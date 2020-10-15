package com.cg.batch12.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.cg.batch12.entity.Employee;

@Component
public class Processor implements ItemProcessor<Employee, Employee> {

//	private static final Map<String,String> DEPT_NAME = new HashMap<>();
//
//	
//	public Processor() {
//		DEPT_NAME.put("IT","Software Engineer");
//		DEPT_NAME.put("Finance","Team Leader");
//	}
	
	
	@Override
	public Employee process(Employee employee) throws Exception {

//		String dept = employee.getDept();
//		String allDept = DEPT_NAME.get(dept); 
//		employee.setDept(allDept);
		
		return employee;
	}

}
