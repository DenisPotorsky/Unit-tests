import org.junit.Test;
import sem_2.Car;
import sem_2.Motorcycle;
import sem_2.Vehicle;
import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {
    @Test
    public void checkInstance() {
        Car car = new Car("Car", "Car", 2015);
        assertThat(car).isInstanceOf(Vehicle.class);
    }
    @Test
    public void checkCarWheels() {
        Car car = new Car("Car", "Car", 2015);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @Test
    public void checkMotorcycleWheeels() {
        Motorcycle moto = new Motorcycle("Moto", "Moto", 2012);
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }
    @Test
    public void CheckCarSpeed() {
        Car car = new Car("Car", "Car", 2015);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    public void CheckMotoSpeed() {
        Motorcycle moto = new Motorcycle("Moto", "Moto", 2012);
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }
    @Test
    public void CheckCarStop() {
        Car car = new Car("Car", "Car", 2015);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    public void CheckMotoStop() {
        Motorcycle moto = new Motorcycle("Moto", "Moto", 2012);
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}
