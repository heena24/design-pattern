package decorative.pattern;

/**
 * Created by heena on 13/05/17.
 */
public class LuxuryCar extends CarDecorator {

    LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of luxuary car.");
    }


}
