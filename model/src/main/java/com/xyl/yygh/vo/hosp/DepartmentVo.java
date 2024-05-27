package com.xyl.yygh.vo.hosp;


import lombok.Data;

import java.util.List;

@Data
//@ApiModel(description = "Department")
public class DepartmentVo {

	//@ApiModelProperty(value = "科室编号")
	private String depcode;

	//@ApiModelProperty(value = "科室名称")
	private String depname;

	//@ApiModelProperty(value = "下级节点")
	private List<DepartmentVo> children;

}

