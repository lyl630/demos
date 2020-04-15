package cn.bdqn.his.medicine.service;

import cn.bdqn.his.medicine.entity.Drug;
import cn.bdqn.his.medicine.entity.DrugCategory;

import java.util.List;

public interface DrugService {
    List<Drug> findAllDrug();
    List<Drug> findAllByDrug(Integer drugTypeId,String drugName);

    //查询所有药品类别
    List<DrugCategory> findAllDrugCategory();
}
