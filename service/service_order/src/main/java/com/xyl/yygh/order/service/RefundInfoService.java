package com.xyl.yygh.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyl.yygh.model.order.PaymentInfo;
import com.xyl.yygh.model.order.RefundInfo;

public interface RefundInfoService extends IService<RefundInfo> {
    /**
     * 保存退款记录
     * @param paymentInfo
     */
    RefundInfo saveRefundInfo(PaymentInfo paymentInfo);

}
