package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Veena Kumari
 * @creation_Date 25th Sep 2019 11.40AM
 * @modification_Date 25th Sep 2019 11.49AM
 * @version 1.0
 * @copyright Zensar Techonologies. All rights reserved.
 * @description It is a persistent class
 *              It represents database table PRODUCT
 *              It is a POJO Class
 *
 */
@Entity
@DiscriminatorValue("B")
public class WageEmp extends Employee
{
public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public float getRate() {
		return rate;
	}


	public void setRate(float rate) {
		this.rate = rate;
	}


@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}


private int hours;
private float rate;


public WageEmp(int empID, String name, LocalDate joiningDate, double salary, int hours, float rate) {
	super(empID, name, joiningDate, salary);
	this.hours = hours;
	this.rate = rate;
}


public WageEmp() {
}


}


