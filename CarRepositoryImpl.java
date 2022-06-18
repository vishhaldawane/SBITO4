package com.sbi.orm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

@Repository("carRepo")
public class CarRepositoryImpl implements CarRepository {

	EntityManager entityManager;
	
	public CarRepositoryImpl() {
		EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("Entity manager factory : "+entityManagerFactory);
		entityManager = entityManagerFactory.createEntityManager();	
		System.out.println("Entity manager         : "+entityManager);
	}
	
	@Override
	public void insertCar(Car carObj) {
		EntityTransaction et = entityManager.getTransaction();
		System.out.println("Entity transaction     : "+et);
		et.begin();
			entityManager.persist(carObj);
		et.commit();
	}

	@Override
	public void updateCar(Car carObj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCar(int carId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Car selectCar(int carId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> selectAllCars() {
		// TODO Auto-generated method stub
		return null;
	}

}
