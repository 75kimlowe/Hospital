package com.xyl.yygh.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyl.yygh.model.user.Patient;

import java.util.List;

public interface PatientService extends IService<Patient> {
    List<Patient> findAllUserId(Long userId);

    //根据id获取就诊人信息
    Patient getPatientId(Long id);

}
