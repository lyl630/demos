package cn.bdqn.his.masterdata.mapper;

import cn.bdqn.his.masterdata.entity.Patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {
    //查询所有患者
    List<Patient> findAllPat();

    /**
     * 根据患者名称查询其他信息
     * @return
     */
    List<Patient> findByPat(String patName);
}
