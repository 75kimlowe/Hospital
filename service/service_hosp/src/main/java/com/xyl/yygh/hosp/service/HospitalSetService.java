package com.xyl.yygh.hosp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyl.yygh.model.hosp.HospitalSet;
import com.xyl.yygh.vo.order.SignInfoVo;

public interface HospitalSetService extends IService<HospitalSet> {
    String getSignKey(String hoscode);

    //获取医院签名信息
    SignInfoVo getSignInfoVo(String hoscode);

}
