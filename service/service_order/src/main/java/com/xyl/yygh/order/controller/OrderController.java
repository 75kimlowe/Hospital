package com.xyl.yygh.order.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xyl.yygh.common.result.Result;
import com.xyl.yygh.enums.OrderStatusEnum;
import com.xyl.yygh.model.order.OrderInfo;
import com.xyl.yygh.order.service.OrderService;
import com.xyl.yygh.vo.order.OrderQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Api(tags = "订单接口")
@RestController
@RequestMapping("/admin/order/orderInfo")
public class OrderController {
    @Autowired
    private OrderService orderService;


    //@ApiOperation(value = "获取分页列表")
    @GetMapping("{page}/{limit}")
    public Result index(
            //@ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            //@ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            //@ApiParam(name = "orderCountQueryVo", value = "查询对象", required = false)
            OrderQueryVo orderQueryVo) {

        Page<OrderInfo> pageParam = new Page<>(page, limit);
        IPage<OrderInfo> pageModel = orderService.selectPage(pageParam, orderQueryVo);
        return Result.ok(pageModel);
    }

    //@ApiOperation(value = "获取订单状态")
    @GetMapping("getStatusList")
    public Result getStatusList() {
        return Result.ok(OrderStatusEnum.getStatusList());
    }

    //@ApiOperation(value = "获取订单")
    @GetMapping("show/{id}")
    public Result get(
            //@ApiParam(name = "orderId", value = "订单id", required = true)
            @PathVariable Long id) {
        return Result.ok(orderService.show(id));
    }


}
