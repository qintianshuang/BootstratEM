package com.huayuan.bootstrap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @des Excel 注解
 * @author mapp 2018/2/10.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE})
public @interface ExcelAnnotation {

    /** 对应的列名称 */
    public abstract String name() default "";

    /** 列序号 */
    public abstract int column() default 0;

    /** 字段类型对应的格式 */
    public abstract String format() default "string";

    /** 记录行数 */
    public abstract boolean isRow() default false;

    /** 数据起始行 */
    public abstract int initRow() default 1;

    /** 是否需要校验 */
    public abstract boolean isCheck() default false;

    /** 校验字段长度 */
    public abstract int fieldLength() default 50;

    /** 校验是否可以为空 */
    public abstract boolean isEmpty() default true;

    /**
     * 设置只能选择不能输入的列内容.
     */
    public abstract String[] combo() default {};

    /**
     * 是否导出数据,应对需求:有时我们需要导出一份模板,这是标题需要但内容需要用户手工填写.
     */
    public abstract boolean isExport() default true;

    /**
     * 提示信息
     */
    public abstract String prompt() default "";
}



