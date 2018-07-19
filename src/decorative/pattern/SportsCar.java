package decorative.pattern;

/**
 * Created by heena on 13/05/17.
 */
public class SportsCar extends CarDecorator {

    SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of sports car.");
    }
}
