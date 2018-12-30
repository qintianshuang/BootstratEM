package com.huayuan.danke.bootstrap.sercice.impl;

import com.huayuan.bootstrap.util.PoiUtils;
import com.huayuan.danke.bootstrap.param.DemoTemplate;
import com.huayuan.danke.bootstrap.sercice.PoiFileService;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class PoiFileServiceImpl implements PoiFileService {

    @Override
    public Workbook downloadFile() throws Exception {
        List<DemoTemplate> demoTemplates = DemoTemplate.getHeaderTable();
        Workbook workbook = PoiUtils.exportExcel(DemoTemplate.class, "文件模板下载", demoTemplates);
        return workbook;
    }

    @Override
    public Workbook importFile(MultipartFile file) throws Exception {
        List<DemoTemplate> demoTemplates = PoiUtils.readExcel(file, DemoTemplate.class, null);

        return null;
    }
}
