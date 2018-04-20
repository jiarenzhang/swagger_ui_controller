package com.zjr.swagger_ui_controller;

/**
 * @Author: Tony
 * @Description: TODO
 * @Date: 2018/4/20 14:55
 * @Version 1.0
 */
public class 备注说明 {

    /**
     * 此项目是由idea编写的
     * 这个项目的VO类和DTO类只是举例，没有业务含义
     *controller类也是测试swagger用的，没有业务含义，这里省去了mapper,servcie等
     * 以后写类似的类的时候可以参照着写
     *
     *重点在Controller类中使用swagger注解
     *
     * 如果用浏览器访问swagger ui时，出现说白色标签错误页面的错，说明少加了一个jar依赖
     *
     * 如果看不到具体的方法，则说明SwaggerDocumentationConfig类中的basePackage里面的字符串没有改成自己包的
     *
     * @ApiModelProperty(value = "学校名称", required = true)这里的true并不能限制前端不传就报错什么的（只作提示作用），需要实现报错，
     *需要在Controller方法参数中加@Valid注解，然后实体属性用注解来限制
     *
     */
}
