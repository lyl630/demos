package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Additionalcost;
import cn.bdqn.his.masterdata.mapper.AdditionalcostMapper;
import cn.bdqn.his.masterdata.mapper.PatientMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AdditionalcostServiceImpl implements AdditionalcostService {
    @Resource
    private AdditionalcostMapper additionalcostMapper;
    @Override
    public List<Additionalcost> findAllAddCost() {
        return additionalcostMapper.findAllAddCost();
    }
}
