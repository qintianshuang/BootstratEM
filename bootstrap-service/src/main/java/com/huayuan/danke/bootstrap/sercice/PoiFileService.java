package com.huayuan.danke.bootstrap.sercice;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.multipart.MultipartFile;

public interface PoiFileService {

    /***
     *
     * @return
     */
    Workbook downloadFile() throws Exception;

    /***
     *
     * @return
     */
    Workbook importFile(MultipartFile file) throws Exception;
}
