package com.xyl.yygh.vo.user;


import lombok.Data;

@Data
//@ApiModel(description="注册对象")
public class RegisterVo {

    //@ApiModelProperty(value = "手机号")
    private String mobile;

    //@ApiModelProperty(value = "密码")
    private String password;

    //@ApiModelProperty(value = "验证码")
    private String code;
}
