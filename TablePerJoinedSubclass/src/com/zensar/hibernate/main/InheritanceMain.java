package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) 
	{
Configuration c=new Configuration().configure();
SessionFactory f=c.buildSessionFactory();
Session s=f.openSession();
Transaction t=s.beginTransaction();


				
        Employee e=new Employee();
		e.setName("Riya");
		e.setJoiningDate(LocalDate.of(1997,06,12));
		e.setSalary(200000);
		s.save(e);
		
		WageEmp we = new WageEmp();
		we.setName("Ram");
		we.setJoiningDate(LocalDate.of(1998,06,12));
		we.setSalary(3000);
		we.setHours(10);
		we.setRate(500.0f);
		s.save(we);

		t.commit();
		s.close();

	}

}
