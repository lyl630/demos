package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.entity.PrescriptionTemp;
import cn.bdqn.his.masterdata.entity.PrescriptionTempDetails;
import cn.bdqn.his.masterdata.service.PrescriptionService;
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

/**
 * 处方
 */
@Api
@RestController
@RequestMapping("/pre")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;
    @ApiOperation(value = "调用基础数据模块api,根据处方模板id查询处方模板详情列表",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "处方模板id,必填",name = "preTempId", required = true),
    })
    @GetMapping("/findByPreDetails")
    public Response findAll1(Integer preTempId){
        List<PrescriptionTempDetails> list=prescriptionService.findByPreDetails(preTempId);
        PageInfo<PrescriptionTempDetails> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }

    @ApiOperation(value = "调用基础数据模块api,根据条件查询所有处方模板列表",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "处方类型id",name = "preTypeId", required = true),
            @ApiImplicitParam(value = "模板权限id,1-公有，2-私人",name = "tempQuan", required = true),
            @ApiImplicitParam(value = "模板编码/模板名称",name = "name", required = true),
    })
    @GetMapping("/findByPreTemp")
    public Response findAll2(Integer preTypeId,Integer tempQuan,String name){
        List<PrescriptionTemp> list=prescriptionService.findByPreTemp(preTypeId,tempQuan,name);
        PageInfo<PrescriptionTemp> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
}
