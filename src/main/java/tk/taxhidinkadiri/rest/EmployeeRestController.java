package tk.taxhidinkadiri.rest;

import java.util.List;

import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.bind.annotation.*;

import tk.taxhidinkadiri.dao.EmployeeDAOHibernateImpl;
import tk.taxhidinkadiri.entity.Employee;
import tk.taxhidinkadiri.service.EmployeeService;
import javax.persistence.EntityManager;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private final LocalContainerEntityManagerFactoryBean entityManager;
	private EmployeeService employeeService;
    private EmployeeDAOHibernateImpl employeeDAOHibernate;

	
	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeService, LocalContainerEntityManagerFactoryBean entityManager) {
		employeeService = theEmployeeService;
		this.entityManager = entityManager;
	}
	
	// expose "/employees" and return list of employees
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	// add mapping for GET /employees/{employeeId}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		
		Employee theEmployee = employeeService.findById(employeeId);
		
		if (theEmployee == null) {
			throw new RuntimeException("Employee id not found - " + employeeId);
		}
		
		return theEmployee;
	}



	
	// add mapping for POST /employees - add new employee
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theEmployee.setId(0);
		
		employeeService.save(theEmployee);
		
		return theEmployee;
	}
	
	// add mapping for PUT /employees - update existing employee
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		
		employeeService.save(theEmployee);
		
		return theEmployee;
	}
	
	// add mapping for DELETE /employees/{employeeId} - delete employee
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		
		Employee tempEmployee = employeeService.findById(employeeId);
		
		// throw exception if null
		
		if (tempEmployee == null) {
			throw new RuntimeException("Employee id not found - " + employeeId);
		}
		
		employeeService.deleteById(employeeId);
		
		return "Deleted employee id - " + employeeId;
	}



/*		@GetMapping("/employees/{firstname}")
	public Employee get_first_name(@PathVariable String firstname) {

*//*		int theEmployee_1 = employeeService.findContact_string(firstname);

		if (theEmployee_1 == 0) {
			throw new RuntimeException("Employee name not found - " + firstname);
		}

		return getEmployee(theEmployee_1);*//*
		 List <Employee> employeeList = employeeDAOHibernate.find_all_1();

		 return employeeList.get(findAll().indexOf(firstname));

	}*/


}










