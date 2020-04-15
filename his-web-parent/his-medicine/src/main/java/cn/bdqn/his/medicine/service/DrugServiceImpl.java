package cn.bdqn.his.medicine.service;

import cn.bdqn.his.medicine.entity.Drug;
import cn.bdqn.his.medicine.entity.DrugCategory;
import cn.bdqn.his.medicine.mapper.DrugMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {
    @Resource
    private DrugMapper drugMapper;
    @Override
    public List<Drug> findAllDrug() {
        return drugMapper.findAllDrug();
    }

    @Override
    public List<Drug> findAllByDrug(Integer drugTypeId, String drugName) {
        return drugMapper.findAllByDrug(drugTypeId,drugName);
    }

    @Override
    public List<DrugCategory> findAllDrugCategory() {
        return drugMapper.findAllDrugCategory();
    }

}
