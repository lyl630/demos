package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.PreType;
import cn.bdqn.his.masterdata.entity.PrescriptionTemp;
import cn.bdqn.his.masterdata.entity.PrescriptionTempDetails;
import cn.bdqn.his.masterdata.mapper.PrescriptionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PrescriptionServiceImpl implements PrescriptionService {
    @Resource
    private PrescriptionMapper prescriptionMapper;
    @Override
    public List<PreType> findAllPre() {
        return prescriptionMapper.findAllPre();
    }

    @Override
    public List<PrescriptionTemp> findByPreTemp(Integer preTypeId, Integer tempQuan, String name) {
        return prescriptionMapper.findByPreTemp(preTypeId,tempQuan,name);
    }

    @Override
    public List<PrescriptionTempDetails> findByPreDetails(Integer preTempId) {
        return prescriptionMapper.findByPreDetails(preTempId);
    }
}
