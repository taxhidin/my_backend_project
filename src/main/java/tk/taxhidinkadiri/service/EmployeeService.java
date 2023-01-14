package tk.taxhidinkadiri.service;

import java.util.List;

import tk.taxhidinkadiri.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);


	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

	// public Employee addOrder(Employee employee);

/*	public int findContact_string(String employee);

	public int findContact_employee(Employee employee);*/


}
