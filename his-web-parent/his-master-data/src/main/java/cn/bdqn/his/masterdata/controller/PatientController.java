package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.entity.Patient;
import cn.bdqn.his.masterdata.service.PatientService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@RequestMapping("/pat")
public class PatientController {

    @Autowired
    private PatientService patientService;

    /**
     * 查询所有患者
     * @return
     */
    @GetMapping("/findAllPat")
    public Response findAll(){
        List<Patient> list=patientService.findAllPat();
        PageInfo<Patient> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
    /**
     * 根据患者名称查询信息
     * @return
     */
    @ApiOperation(value = "调用基础数据模块api,根据患者名称查询信息",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "患者名称，必填",name = "name", required = true),
    })
    @GetMapping("/findByPat")
    public Response findAll2(String name){
        List<Patient> list=patientService.findByPat(name);
        PageInfo<Patient> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
}
