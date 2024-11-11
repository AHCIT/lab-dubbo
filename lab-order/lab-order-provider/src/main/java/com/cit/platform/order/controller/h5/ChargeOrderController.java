package com.cit.platform.order.controller.h5;

import com.cit.platform.order.api.ChargeOrderService;
import com.cit.platform.order.api.dto.ChargeOrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Richard
 * @Description: 充电订单
 * @CreateDate: 2024/11/11 14:39
 * @UpdateUser: zhouli
 * @UpdateDate: 2024/11/11 14:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/order/charge")
public class ChargeOrderController {
    @Autowired
    private ChargeOrderService chargeOrderService;

    /**
     * 创建订单
     */
    @PostMapping("/create")
    Object createOrder(@RequestBody ChargeOrderDTO chargeOrderDTO) {
        return chargeOrderService.saveOrder(chargeOrderDTO);
    }
}
