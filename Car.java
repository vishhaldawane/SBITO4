package com.sbi.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
//Car car 
@Component("theCar")
@Entity // a business entity with primary key mapped for a table
@Table(name="cars")
public class Car {

	 @Id
	 @Column(name="CARID")
	 private int carId;
	 
	 @Column(name="CARNAME")
	 private String carName;

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	 
	 
}
