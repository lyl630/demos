package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Additionalcost;

import java.util.List;

public interface AdditionalcostService {
    /**
     * 查所有附加费用
     * @return
     */
    List<Additionalcost> findAllAddCost();
}
