package cn.bdqn.his.medicine.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.medicine.entity.Drug;
import cn.bdqn.his.medicine.service.DrugService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/drug")
public class DrugController {
    @Autowired
    private DrugService drugService;
    @GetMapping("/finAllDrug")
    public Response findAll(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List <Drug> list=drugService.findAllDrug();
        PageInfo<Drug> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
  /*  @RequestMapping(value = "/findByDrug",method = {RequestMethod.GET,RequestMethod.POST})
    public Response findBy(Integer pageNum, Integer pageSize, Integer typeId, String name) {
        PageHelper.startPage(pageNum,pageSize);
        List<Drug> list = drugService.findAllByDrug(typeId, name);
        PageInfo<Drug> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }*/
    @RequestMapping(value = "/findByDrug",method = {RequestMethod.GET,RequestMethod.POST})
    public Response findBy( Integer typeId, String name) {
        List<Drug> list = drugService.findAllByDrug(typeId, name);
        PageInfo<Drug> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }

}
