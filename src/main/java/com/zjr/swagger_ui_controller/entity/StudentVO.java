package com.zjr.swagger_ui_controller.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author: Tony
 * @Description: 返回给前端（或者APP端）展示的VO类（即直接与前端打交道的实体，不是直接与数据库打交道的实体）
 * @Date: 2018/4/20 13:54
 * @Version 1.0
 */
//@ApiModel(value = "学生VO类")不要用value这个，用value的话swagger ui那边就用value的值替换类名了，用下面的description这个
@ApiModel(description = "学生VO类")
public class StudentVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "爱好")
    private String hobby;
    @ApiModelProperty(value = "年龄")
    private Integer age;

    public StudentVO() {
        this.name = "";
        this.hobby = "";
        this.age = 1;
    }

    public StudentVO(String name, String hobby, Integer age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StudentVO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hobby='").append(hobby).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
