package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.PreType;
import cn.bdqn.his.masterdata.entity.PrescriptionTemp;
import cn.bdqn.his.masterdata.entity.PrescriptionTempDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 处方
 */

public interface PrescriptionService {
    /**
     * 查询所有处方类型
     * @return
     */
    List<PreType> findAllPre();

    /**
     * 按照条件查询处方模板
     * @return
     */
    List<PrescriptionTemp> findByPreTemp(  Integer preTypeId,   Integer tempQuan,  String name);
    /**
     * 根据处方模板id查询处方模板详情
     * @param preTempId
     * @return
     */
    List<PrescriptionTempDetails> findByPreDetails(Integer preTempId);
}
