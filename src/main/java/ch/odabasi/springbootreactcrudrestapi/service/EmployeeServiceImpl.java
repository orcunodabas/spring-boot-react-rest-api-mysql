package ch.odabasi.springbootreactcrudrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.odabasi.springbootreactcrudrestapi.dao.EmployeeDAO;
import ch.odabasi.springbootreactcrudrestapi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDao;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDao.get();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return employeeDao.get(id);
    }
    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);

    }
    @Transactional
    @Override
    public void delete(int id) {
        employeeDao.delete(id);

    }
}
