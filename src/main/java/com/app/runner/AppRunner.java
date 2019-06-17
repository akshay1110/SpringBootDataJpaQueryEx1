package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.repo.EmployeeRepository;

@Component
public class AppRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * repo.saveAll(Arrays.asList( new Employee(11,"AK",23.34,"HYD"), new
		 * Employee(12,"HR",67.34,"BAN"), new Employee(13,"VB",53.34,"MUM"), new
		 * Employee(14,"BK",33.34,"DEL"), new Employee(15,"MH",45.34,"PUN") ));
		 */
		
//		  repo.getAllEmps().forEach(System.out::println);
		
		
//		  Optional<Employee> e=repo.getEmpById(13);
//		  if(e.isPresent()) {
//		  System.out.println(e.get().getEmpName()+","+e.get().getEmpSal());
//		  }else {
//		  System.out.println("data not found"); 
//		  }
		 
//		int count=repo.deleteOne(14);
//		System.out.println(count);
		
//		int count=repo.updateOne(200.43, 12);
//		System.out.println(count);
		
//		List<Object[]> arr=repo.getEmpInfo(50);
//		for(Object[] o:arr) {
//		    System.out.println(o[0]+","+o[1]);
//		}
		
//		double d=repo.getAvgSal();
//		System.out.println(d);
		
		repo.getEmpByin(12,14).forEach(System.out::println);
		}
	}

