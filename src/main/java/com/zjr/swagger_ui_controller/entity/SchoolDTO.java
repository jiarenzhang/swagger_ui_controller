package com.zjr.swagger_ui_controller.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: Tony
 * @Description: 前端（或者APP端）传给后端的实体类，与VO类类似，也是不直接与数据库打交道的实体
 * @Date: 2018/4/20 14:45
 * @Version 1.0
 */
@ApiModel(description = "学校DTO类")
public class SchoolDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学校名称", required = true)
    @NotNull//表示不能为null，但是可以为""
    private String schoolName;
    @ApiModelProperty(value = "历史沿革", required = false)//false表示是可选（optional）的，不是必传的,用于提示前端，但是不能限制，要限制一定传，不然报错需要用@Valid
    @NotEmpty//表示不能为null,也不能为""
    private String history;
    @ApiModelProperty(value = "学校名称")//默认required=false,所以可以不写
    @NotNull//不是字符串的，就用@NotNull即可
    private Integer age;

    public SchoolDTO() {
        this.schoolName = "";
        this.history = "";
        this.age=1;
    }

    public SchoolDTO(@NotNull String schoolName, @NotEmpty String history, Integer age) {
        this.schoolName = schoolName;
        this.history = history;
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SchoolDTO{");
        sb.append("schoolName='").append(schoolName).append('\'');
        sb.append(", history='").append(history).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
