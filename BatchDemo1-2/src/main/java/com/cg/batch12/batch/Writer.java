package com.cg.batch12.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.cg.batch12.entity.Employee;
import com.cg.batch12.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Writer implements ItemWriter<Employee>{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void  write( List<? extends Employee> employee) throws Exception {
		
		log.info("Saving......");
		employeeRepository.saveAll(employee);
		log.info("Data saved."+employee);
	}

}
