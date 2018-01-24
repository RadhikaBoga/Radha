package com.ojas.test.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ojas.dao.Daocls;

public class DaoTest {
	
	JdbcTemplate template=Mockito.mock(JdbcTemplate.class);
	
	Daocls dao =new Daocls(template);
	
	@Test
	public void daoTest() {
		
	}
}
