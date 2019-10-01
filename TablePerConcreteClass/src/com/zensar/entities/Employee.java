package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Veena Kumari
 * @creation_Date 25th Sep 11.40AM
 * @modification_Date 25th Sep 2019 2.17PM
 * @version 2.0
 * @copyright Zensar Techonologies. All rights reserved.
 * @description It is a persistent class
 *              It represents database table PRODUCT
 *              It is a POJO Class
 *
 */

@Entity
@Table(name = "emp_master_1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int empID;
	private String name;
	private LocalDate joiningDate;
	private double salary;
	
	
      public Employee() {
}


	public Employee(int empID, String name, LocalDate joiningDate, double salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.joiningDate = joiningDate;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", joiningDate=" + joiningDate + ", salary=" + salary
				+ "]";
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

 
	public LocalDate getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
}

