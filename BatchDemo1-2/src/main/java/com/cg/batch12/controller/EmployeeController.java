package com.cg.batch12.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job job;
	
	@GetMapping
	public BatchStatus helloEmployee() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		
		Map<String,JobParameter> addTime = new HashMap<>();
		addTime.put("Time", new JobParameter(System.currentTimeMillis()));
		JobParameters jobParameters = new JobParameters(addTime);
		JobExecution jobExecution = jobLauncher.run(job,jobParameters);
		log.info("Job Execution"+jobExecution.getStatus());
		return jobExecution.getStatus();
	}
	
}
