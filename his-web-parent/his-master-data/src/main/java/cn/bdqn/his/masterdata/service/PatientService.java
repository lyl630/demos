package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Patient;

import java.util.List;

public interface PatientService {
    //查询所有患者
    List<Patient> findAllPat();
    /**
     * 根据患者名称查询其他信息
     * @return
     */
    List<Patient> findByPat(String patName);
}
