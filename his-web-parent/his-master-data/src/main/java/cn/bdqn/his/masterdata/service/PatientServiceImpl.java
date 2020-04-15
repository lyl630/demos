package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Patient;
import cn.bdqn.his.masterdata.mapper.PatientMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PatientServiceImpl implements  PatientService {

    @Resource
    private PatientMapper patientMapper;
    @Override
    public List<Patient> findAllPat() {
        return patientMapper.findAllPat();
    }

    @Override
    public List<Patient> findByPat(String patName) {
        return patientMapper.findByPat(patName);
    }
}
