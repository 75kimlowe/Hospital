package com.xyl.yygh.hosp.service;


import com.xyl.yygh.model.hosp.Department;
import com.xyl.yygh.vo.hosp.DepartmentQueryVo;
import com.xyl.yygh.vo.hosp.DepartmentVo;
import org.springframework.data.domain.Page;


import java.util.List;
import java.util.Map;

public interface DepartmentService {
    void save(Map<String, Object> paramMap);
    Page<Department> selectPage(Integer page, Integer limit, DepartmentQueryVo departmentQueryVo);
    void remove(String hoscode, String depcode);
    List<DepartmentVo> findDeptTree(String hoscode);

    String getDepName(String hoscode, String depcode);

    /**
     * 获取部门
     */
    Department getDepartment(String hoscode, String depcode);

}
