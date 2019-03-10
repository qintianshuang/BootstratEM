package com.huayuan.danke.bootstrap.param;

import com.huayuan.bootstrap.annotation.ExcelAnnotation;

import java.util.ArrayList;
import java.util.List;

/***
 *
 */
public class DemoTemplate {

    @ExcelAnnotation(name = "姓名", column = 0)
    private String name;

    @ExcelAnnotation(name = "性别", column = 1)
    private String sex;

    @ExcelAnnotation(name = "单位", column = 2)
    private String company;

    @ExcelAnnotation(name = "住址", column = 3)
    private String address;

    @ExcelAnnotation(isRow = true)
    private String row;

    public DemoTemplate() {

    }

    public DemoTemplate(String name, String sex, String company, String address) {
        this.name = name;
        this.sex = sex;
        this.company = company;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(final String sex) {
        this.sex = sex;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(final String company) {
        this.company = company;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getRow() {
        return this.row;
    }

    public void setRow(final String row) {
        this.row = row;
    }

    public static List<DemoTemplate> getHeaderTable(){
        List<DemoTemplate> demoTemplates = new ArrayList<>();
        DemoTemplate demoTemplate = new DemoTemplate("张三","1","深圳有限公司","洋澜湖畔公寓一栋405");
        demoTemplates.add(demoTemplate);
        return demoTemplates;
    }

    public void setTonfine(){

    }
}
