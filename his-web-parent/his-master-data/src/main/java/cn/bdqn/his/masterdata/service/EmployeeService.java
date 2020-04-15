package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * 查询所有员工
     * @return
     */
    List<Employee> findAllEmp();
}
