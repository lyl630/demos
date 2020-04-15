package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Disease;
import cn.bdqn.his.masterdata.mapper.DiseaseMapper;
import cn.bdqn.his.masterdata.mapper.PatientMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DiseaseServiceImpl implements DiseaseService {
    @Resource
    private DiseaseMapper diseaseMapper;
    @Override
    public List<Disease> findAllDis() {
        return diseaseMapper.findAllDis();
    }
}
