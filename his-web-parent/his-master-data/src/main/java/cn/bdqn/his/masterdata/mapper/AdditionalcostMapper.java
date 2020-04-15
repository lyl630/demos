package cn.bdqn.his.masterdata.mapper;

import cn.bdqn.his.masterdata.entity.Additionalcost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 附加费用接口
 */
@Mapper
public interface AdditionalcostMapper {
    List<Additionalcost> findAllAddCost();

}
