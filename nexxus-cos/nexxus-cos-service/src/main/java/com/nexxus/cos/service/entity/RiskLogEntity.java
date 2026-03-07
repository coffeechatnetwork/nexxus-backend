package com.nexxus.cos.service.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.nexxus.common.BaseEntity;
import com.nexxus.common.enums.cos.risklog.RiskLogCategory;
import com.nexxus.common.enums.cos.risklog.RiskLogLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("cos_risk_log")
public class RiskLogEntity extends BaseEntity {
    private String displayId;
    private Long orgId;
    private Long projectId;
    private String topic;
    private String description;
    private String risk;
    private String mitigationOfRisk;
    private RiskLogCategory category;
    private RiskLogLevel level;
}
