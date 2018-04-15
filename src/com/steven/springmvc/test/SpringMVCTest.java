package com.steven.springmvc.test;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.steven.springmvc.crud.dao.EmployeeDao;
import com.steven.springmvc.crud.entities.Employee;

@Controller
public class SpringMVCTest {
	@Autowired
	private EmployeeDao mEmployeeDao;
	
	
	@ResponseBody
	@RequestMapping("testJson")
	public Collection<Employee> testJson(){
		return mEmployeeDao.getAll();
	}

}
