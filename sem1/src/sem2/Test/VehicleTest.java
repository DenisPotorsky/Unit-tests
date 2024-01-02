package sem2.Test;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {
    @Test
    public void checkInstance() {
        sem_2.Car car = new sem_2.Car("Car", "Car", 2015);
        assertThat(car).isInstanceOf(sem_2.Vehicle.class);
    }
    @Test
    public void checkCarWheels() {
        sem_2.Car car = new sem_2.Car("Car", "Car", 2015);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @Test
    public void checkMotorcycleWheels() {
        sem_2.Motorcycle moto = new sem_2.Motorcycle("Moto", "Moto", 2012);
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }
    @Test
    public void checkCarSpeed() {
        sem_2.Car car = new sem_2.Car("Car", "Car", 2015);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    public void checkMotoSpeed() {
        sem_2.Motorcycle moto = new sem_2.Motorcycle("Moto", "Moto", 2012);
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }
    @Test
    public void checkCarStop() {
        sem_2.Car car = new sem_2.Car("Car", "Car", 2015);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    public void checkMotoStop() {
        sem_2.Motorcycle moto = new sem_2.Motorcycle("Moto", "Moto", 2012);
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}
