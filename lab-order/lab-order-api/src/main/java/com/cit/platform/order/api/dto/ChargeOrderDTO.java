package com.cit.platform.order.api.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: Richard
 * @Description: 充电订单详情
 * @CreateDate: 2024/11/11 14:15
 * @UpdateUser: zhouli
 * @UpdateDate: 2024/11/11 14:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Data
public class ChargeOrderDTO {
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
    private Double chargingDuration;
    private Double chargingQuantity;
    private Double unitPrice;
    private Double totalCost;
    private String paymentStatus;
    private String paymentMethod;
    private LocalDateTime paymentTime;
    private String orderStatus;
    private String exceptionInfo;
}
