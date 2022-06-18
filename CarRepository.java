package com.sbi.orm;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository   
public interface CarRepository {
	void       insertCar(Car carObj);
	void       updateCar(Car carObj);
	void 	   deleteCar(int carId);
	Car  	   selectCar(int carId);
	List<Car>  selectAllCars();
}
