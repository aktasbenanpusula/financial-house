package com.fhouse.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)

public class AcquireControllerTest extends AbstractControllerTest{

	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void testGetAllAcquireList() throws Exception {
		
		String uri = "/api/v3/acquirers/";

        HttpHeaders httpHeaders = getHeadersForJson();
		
		MvcResult mvcResult = mockMvc.perform(
		          MockMvcRequestBuilders.get(uri).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
		        ).andReturn();
		
		int status = mvcResult.getResponse().getStatus();
		Assert.assertEquals("Status 200 expected", 200, status);

	}



}
