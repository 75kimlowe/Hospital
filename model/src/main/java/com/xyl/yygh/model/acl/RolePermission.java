package com.xyl.yygh.model.acl;

import com.xyl.yygh.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <p>
 * 角色权限
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@Data
//@ApiModel(description = "角色权限")
@TableName("acl_role_permission")
public class RolePermission extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	//@ApiModelProperty(value = "roleid")
	@TableField("role_id")
	private Long roleId;

	//@ApiModelProperty(value = "permissionId")
	@TableField("permission_id")
	private Long permissionId;

}

