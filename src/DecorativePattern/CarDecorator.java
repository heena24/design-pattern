package decorative.pattern;

/**
 * Created by heena on 13/05/17.
 */
public class CarDecorator implements Car {
    Car car;

    CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
