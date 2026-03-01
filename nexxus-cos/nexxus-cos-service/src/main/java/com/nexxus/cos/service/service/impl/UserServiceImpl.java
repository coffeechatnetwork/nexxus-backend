package com.nexxus.cos.service.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nexxus.cos.service.entity.UserEntity;
import com.nexxus.cos.service.mapper.UserMapper;
import com.nexxus.cos.service.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {
    @Override
    public UserEntity getByEmail(String email) {
        return lambdaQuery()
                .eq(UserEntity::getEmail, email)
                .one();
    }

    @Override
    public UserEntity getByAccountId(String accountId) {
        return lambdaQuery()
                .eq(UserEntity::getAccountId, accountId)
                .one();
    }

    @Override
    public Page<UserEntity> listUsers(Long orgId, Long page, Long pageSize) {
        return lambdaQuery()
                .eq(orgId != null, UserEntity::getOrgId, orgId)
                .page(new Page<>(page, pageSize));
    }

    @Override
    public Map<UUID, UserEntity> mapByAccountIds(List<UUID> accountIds) {
        List<UserEntity> userEntities = lambdaQuery()
                .in(UserEntity::getAccountId, accountIds)
                .list();
        return userEntities.stream()
                .collect(Collectors.toMap(UserEntity::getAccountId, user -> user));
    }
}
