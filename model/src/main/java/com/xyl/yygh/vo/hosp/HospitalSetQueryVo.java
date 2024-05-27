package com.xyl.yygh.vo.hosp;

import com.baomidou.mybatisplus.annotation.TableField;

import lombok.Data;

@Data
public class HospitalSetQueryVo {

    //@ApiModelProperty(value = "医院名称")
    private String hosname;

    //@ApiModelProperty(value = "医院编号")
    private String hoscode;
}
