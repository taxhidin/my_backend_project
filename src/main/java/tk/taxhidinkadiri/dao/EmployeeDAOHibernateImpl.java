package tk.taxhidinkadiri.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import tk.taxhidinkadiri.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}


	@Override
	public List<Employee> findAll() {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		Query<Employee> theQuery =
				currentSession.createQuery("from Employee", Employee.class);

		// execute query and get result list
		List<Employee> employees = theQuery.getResultList();

		// return the results
		return employees;
	}


	@Override
	public Employee findById(int theId) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// get the employee
		Employee theEmployee =
				currentSession.get(Employee.class, theId);
		
		// return the employee
		return theEmployee;
	}




	@Transactional
	public List<Employee> find_all_1() {
	Session session = entityManager.unwrap(Session.class);
	Criteria criteria = session.createCriteria(Employee.class);
	criteria.addOrder(Order.asc("firstname"));
	List<Employee> employeeList = criteria.list();

	return employeeList;

	}


	@Override
	public void save(Employee theEmployee) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// save employee
		currentSession.saveOrUpdate(theEmployee);
	}


	@Override
	public void deleteById(int theId) {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// delete object with primary key
		Query theQuery = currentSession.createQuery(
						"delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		
		theQuery.executeUpdate();
	}

/*	@Override
	public Employee addOrder(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);

		// delete object with primary key
		Query theQuery = currentSession.createQuery(
				"SELECT firstName from Employee order by firstName DESC");


	theQuery.getResultList();


	}*/


/*	@Override
	public Employee query_first_name(String name){
		int position = findContact_string(name);

		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		Query<Employee> theQuery =
				currentSession.createQuery("from Employee", Employee.class);

		// execute query and get result list
		List<Employee> employees = theQuery.getResultList();


		if (position > 0){

			return  employees.get(position);
		}

		return null;
	}*/


/*	@Override
	public int findContact_string(String employee){
		Session currentSession_2 = entityManager.unwrap(Session.class);

		Query<Employee> theQuery =
				currentSession_2.createQuery("from Employee", Employee.class);
		int employee_2 = theQuery.getParameter(employee).getPosition();

		return employee_2;

	}
	@Override
	public int findContact_employee(Employee employee){
		Session currentSession_1 = entityManager.unwrap(Session.class);

		// create a query
		Query<Employee> theQuery =
				currentSession_1.createQuery("from Employee", Employee.class);

		// execute query and get result list
		int employees_1 = theQuery.getParameter(employee.getId()).getPosition();

		// return the results
		return employees_1;
	}*/

}







