package com.xyl.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyl.yygh.model.cmn.Dict;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface DictService extends IService<Dict> {
    List<Dict> findChlidData(Long id);

    void exportData(HttpServletResponse response);

    String getNameByParentDictCodeAndValue(String parentDictCode, String value);

    void importData(MultipartFile file);

    List<Dict> findByDictCode(String dictCode);
}
