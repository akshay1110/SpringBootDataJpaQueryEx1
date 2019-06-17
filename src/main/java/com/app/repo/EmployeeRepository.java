package com.app.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	@Query("select e from com.app.model.Employee e")
	public List<Employee> getAllEmps();
	
	@Query("select e from Employee e where e.empId=:id")
	public Optional<Employee> getEmpById(Integer id);

	@Modifying
	@Transactional
	@Query("delete from Employee e where e.empId=:id")
	public int deleteOne(Integer id);
	
	@Modifying
	@Transactional
	@Query(" update Employee e set empSal=:sal where empId=:id")
	public int updateOne(double sal,Integer id);
	
	@Query(" select e.empSal,e.empName from Employee e where e.empSal>:sal order by empName desc")
	public List<Object[]> getEmpInfo(double sal);
	
	@Query(" select avg(e.empSal) from Employee e ")
	public double getAvgSal();
	
	@Query(" select e from Employee e where e.empId in (:id , :ids) order by e.empName desc")
	public List<Employee> getEmpByin(Integer id,Integer ids);
}
