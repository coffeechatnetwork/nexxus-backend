package com.nexxus.server.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.handler.TenantLineHandler;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.TenantLineInnerInterceptor;
import com.nexxus.common.AccountInfo;
import com.nexxus.common.AccountInfoContext;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.StringValue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        TenantLineInnerInterceptor tenantInterceptor = new TenantLineInnerInterceptor(new TenantLineHandler() {
            @Override
            public Expression getTenantId() {
                AccountInfo accountInfo = AccountInfoContext.get();
                return new StringValue(String.valueOf(accountInfo.getOrgId()));
            }

            @Override
            public String getTenantIdColumn() {
                return "org_id";
            }

            @Override
            public boolean ignoreTable(String tableName) {
                return tableName.equals("cos_comment") ||
                        tableName.equals("cos_organization");
            }
        });

        PaginationInnerInterceptor pagination = new PaginationInnerInterceptor();
        pagination.setMaxLimit(200L);

        interceptor.addInnerInterceptor(tenantInterceptor);
        interceptor.addInnerInterceptor(pagination);

        return interceptor;
    }
}
