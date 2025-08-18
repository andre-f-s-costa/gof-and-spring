import br.com.gof.facade.OrderFacade;
import br.com.gof.singleton.SimpleSingleton;
import br.com.gof.strategy.Car;
import br.com.gof.strategy.Driver;
import br.com.gof.strategy.Motorcycle;
import br.com.gof.strategy.Vehicle;

public class Main {
    public static void main(String[] args) {

        // Strategy
        Driver driver = new Driver();

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        driver.setVehicle(car);
        driver.run();

        driver.setVehicle(motorcycle);
        driver.run();

        // Singleton
        System.out.println(SimpleSingleton.getInstance());

        // Facade
        OrderFacade order = new OrderFacade();
        order.orderProduct("Freezer");
    }
}