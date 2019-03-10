package com.huayuan.danke.bootstrat.controller.poi;


import com.huayuan.bootstrap.util.PoiUtils;
import com.huayuan.danke.bootstrap.sercice.PoiFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Api(value = "文件处理", description = "检查模板操作")
@Controller
@RequestMapping("/poi")
public class PoiController {

    @Resource
    private PoiFileService poiFileService;

    @ApiOperation(value = "下载文件", notes = "文件导出")
    @GetMapping("/download")
    public void downloadFile(HttpServletResponse response) throws Exception {
        String fileName = "文件下载";
        Workbook workbook = poiFileService.downloadFile();
         PoiUtils.outExcel(response, fileName, workbook);
    }
}
