package com.cit.platform.order.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cit.platform.order.domain.entity.ChargingOrderPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Richard
 * @Description: 充电订单数据层接口
 * @CreateDate: 2024/11/11 14:07
 * @UpdateUser: zhouli
 * @UpdateDate: 2024/11/11 14:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Mapper
public interface ChargeOrderMapper extends BaseMapper<ChargingOrderPO> {
}
