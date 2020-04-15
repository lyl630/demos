package cn.bdqn.his.masterdata.mapper;

import cn.bdqn.his.masterdata.entity.Disease;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DiseaseMapper {

    //查询所有医嘱信息
    List<Disease> findAllDis();
}
