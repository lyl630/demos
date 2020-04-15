package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Disease;

import java.util.List;

public interface DiseaseService {
    /**
     * 查询所有疾病
     * @return
     */
    List<Disease> findAllDis();
}
