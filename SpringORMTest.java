import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sbi.orm.Car;
import com.sbi.orm.CarRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:spring_orm.xml"})
public class SpringORMTest {

	@Autowired
	CarRepository carRepo;
	
	@Autowired
	Car car ;
	
	@Test
	public void insertCarTest() {
		car.setCarId(5);
		car.setCarName("Maruti Swift");
		carRepo.insertCar(car);
	}
}
