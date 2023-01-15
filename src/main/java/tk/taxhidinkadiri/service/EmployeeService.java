package tk.taxhidinkadiri.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.taxhidinkadiri.entity.Employee;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);


    public void save(Employee theEmployee);

    public void deleteById(int theId);

}
