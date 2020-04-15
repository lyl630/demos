package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.entity.Additionalcost;
import cn.bdqn.his.masterdata.entity.Disease;
import cn.bdqn.his.masterdata.service.AdditionalcostService;
import cn.bdqn.his.masterdata.service.DiseaseService;
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
 * 附加费用和疾病
 */
@Api
@RestController
@RequestMapping("/DisAndDocr")
public class DisAndDocrController {
    @Autowired
    private AdditionalcostService additionalcostService;
    @Autowired
    private DiseaseService diseaseService;
    /**
     * 查询所有附加费用
     * @return
     */
    @ApiOperation(value = "调用基础数据模块api,查询所有附加费用信息",response = Response.class)

    @GetMapping("/findAllAddCost")
    public Response findAll1(){
        List<Additionalcost> list=additionalcostService.findAllAddCost();
        PageInfo<Additionalcost> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
    /**
     * 查询所有疾病
     * @return
     */
    @ApiOperation(value = "调用基础数据模块api,查询所有疾病信息",response = Response.class)
    @GetMapping("/findAllDis")
    public Response findAll2(){
        List<Disease> list=diseaseService.findAllDis();
        PageInfo<Disease> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
}
