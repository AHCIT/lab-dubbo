package com.cit.platform.order.service;

import com.cit.platform.order.api.ChargeOrderService;
import com.cit.platform.order.api.dto.ChargeOrderDTO;
import com.cit.platform.order.dao.mapper.ChargeOrderMapper;
import com.cit.platform.order.domain.entity.ChargingOrderPO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Richard
 * @Description: 充电业务接口实现
 * @CreateDate: 2024/11/11 14:12
 * @UpdateUser: zhouli
 * @UpdateDate: 2024/11/11 14:12
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Slf4j
@DubboService
public class ChargeOrderServiceImpl implements ChargeOrderService {
    @Autowired
    private ChargeOrderMapper chargeOrderMapper;

    @Override
    public int saveOrder(ChargeOrderDTO order) {
        ChargingOrderPO chargingOrderPO = new ChargingOrderPO();
        BeanUtils.copyProperties(order, chargingOrderPO);
        return chargeOrderMapper.insert(chargingOrderPO);
    }
}
