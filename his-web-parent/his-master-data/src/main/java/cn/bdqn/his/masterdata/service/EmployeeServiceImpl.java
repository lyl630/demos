package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Employee;
import cn.bdqn.his.masterdata.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findAllEmp() {
        return employeeMapper.findAllEmp();
    }
}
