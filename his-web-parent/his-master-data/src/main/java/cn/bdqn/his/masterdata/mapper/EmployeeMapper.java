package cn.bdqn.his.masterdata.mapper;

import cn.bdqn.his.masterdata.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    /**
     * 查询所有员工
     * @return
     */
    List<Employee> findAllEmp();
}
