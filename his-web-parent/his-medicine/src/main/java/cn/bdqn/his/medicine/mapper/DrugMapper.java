package cn.bdqn.his.medicine.mapper;

import cn.bdqn.his.medicine.entity.Drug;
import cn.bdqn.his.medicine.entity.DrugCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 药品接口
 */
@Mapper
public interface DrugMapper {
    List<Drug> findAllDrug();

    /**
     * 按照类别和名称查询接口
     * @param drugTypeId
     * @param drugName
     * @return
     */
    List<Drug> findAllByDrug(@Param("drugTypeId") Integer drugTypeId, @Param("drugName") String drugName);


    List<DrugCategory> findAllDrugCategory();
}
