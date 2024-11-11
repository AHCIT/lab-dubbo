package com.cit.platform.order.api;

import com.cit.platform.order.api.dto.ChargeOrderDTO;

/**
 * @Author: Richard
 * @Description: 充电业务接口
 * @CreateDate: 2024/11/11 14:11
 * @UpdateUser: zhouli
 * @UpdateDate: 2024/11/11 14:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface ChargeOrderService {

    int saveOrder(ChargeOrderDTO order);
}
