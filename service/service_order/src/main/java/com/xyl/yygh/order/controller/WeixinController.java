package com.xyl.yygh.order.controller;

import com.xyl.yygh.common.result.Result;
import com.xyl.yygh.enums.PaymentTypeEnum;
import com.xyl.yygh.order.service.PaymentService;
import com.xyl.yygh.order.service.WeixinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/order/weixin")
public class WeixinController {
    @Autowired
    private WeixinService weixinPayService;
    @Autowired
    private PaymentService paymentService;

    /**
     * 下单 生成二维码
     */
    @GetMapping("/createNative/{orderId}")
    public Result createNative(
            //@ApiParam(name = "orderId", value = "订单id", required = true)
            @PathVariable("orderId") Long orderId) {
        return Result.ok(weixinPayService.createNative(orderId));
    }

    //@ApiOperation(value = "查询支付状态")
    @GetMapping("/queryPayStatus/{orderId}")
    public Result queryPayStatus(
            //@ApiParam(name = "orderId", value = "订单id", required = true)
            @PathVariable("orderId") Long orderId) {
        //调用查询接口
        Map<String, String> resultMap = weixinPayService.queryPayStatus(orderId, PaymentTypeEnum.WEIXIN.name());
        if (resultMap == null) {//出错
            return Result.fail().message("支付出错");
        }
        if ("SUCCESS".equals(resultMap.get("trade_state"))) {//如果成功
            //更改订单状态，处理支付结果
            String out_trade_no = resultMap.get("out_trade_no");
            paymentService.paySuccess(out_trade_no, PaymentTypeEnum.WEIXIN.getStatus(), resultMap);
            return Result.ok().message("支付成功");
        }
        return Result.ok().message("支付中");

    }
}

