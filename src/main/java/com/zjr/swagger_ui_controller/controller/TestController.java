package com.zjr.swagger_ui_controller.controller;

import com.zjr.swagger_ui_controller.entity.SchoolDTO;
import com.zjr.swagger_ui_controller.entity.StudentVO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author: Tony
 * @Description: TODO
 * @Date: 2018/4/20 15:32
 * @Version 1.0
 */
@Api(value = "Test", description = "测试用控制类")
@RestController
public class TestController {
    //@ApiResponses和@ApiImplicitParams这两个注解可以不写
    @ApiOperation(value = "我的测试方法")//value的值是对方法功能的描述
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 400, message = "error")})
    @ApiImplicitParams({@ApiImplicitParam(paramType = "body", dataType = "SchoolDTO", name = "schoolDTO", value = "学校DTO类", required = true)})//默认是true
    @RequestMapping(value = "/test", produces = {"application/json"}, method = RequestMethod.POST)
    public StudentVO myTest( @Valid @RequestBody SchoolDTO schoolDTO) {

        StudentVO studentVO = new StudentVO();
        studentVO.setName("张三");
        studentVO.setHobby("羽毛球");
        return studentVO;
    }
}
