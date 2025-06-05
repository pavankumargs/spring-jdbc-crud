package com.twg.SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.twg.SpringJdbc.business.EmployeeBusiness;
import com.twg.SpringJdbc.business.EmployeeBusinessImpl;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ConfigurationMetadata.xml");
    	EmployeeBusiness employee = context.getBean("employeeBusiness",EmployeeBusinessImpl.class);
    	employee.printEmpHikes();
    }
}
