package com.cit.platform.order.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@TableName(value = "charge_order")
public class ChargingOrderPO {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long userId;
    private String userName;
    private String userContact;
    private Long chargingPileId;
    private String chargingPileLocation;
    private String chargingStationName;
    private Long orderNumber;
    private LocalDateTime startTime;
    private LocalDateTime expectedEndTime;
    private LocalDateTime actualEndTime;
    private BigDecimal chargingDuration;
    private BigDecimal chargingQuantity;
    private BigDecimal unitPrice;
    private BigDecimal totalCost;
    private String paymentStatus;
    private String paymentMethod;
    private LocalDateTime paymentTime;
    private String orderStatus;
    private String exceptionInfo;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}