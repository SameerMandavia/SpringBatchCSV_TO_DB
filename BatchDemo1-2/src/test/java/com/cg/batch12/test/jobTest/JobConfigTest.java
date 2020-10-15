package com.cg.batch12.test.jobTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.batch12.BatchDemo12Application;
import com.cg.batch12.config.SpringBatchConfig;
import com.cg.batch12.entity.Employee;
import com.cg.batch12.test.config.SpringBatchConfigTest;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BatchDemo12Application.class,SpringBatchConfigTest.class})
public class JobConfigTest {

	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;
	
	@Autowired
	private SpringBatchConfig config;
	
	
	
//	@Test
//	public void testEntireJob() {
//		final JobExecution jobExecution = jobLauncherTestUtils.getJobLauncher().run(config.job(jobBuilderFactory, stepBuilderFactory, itemReader, itemProcessor, itemWriter)
//				,jobLauncherTestUtils.getUniqueJobParameters());
//		assertNotNull(jobExecution);
//		assertEquals(BatchStatus.COMPLETED, jobExecution.getStatus());
//	}
}
