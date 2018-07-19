package decorative.pattern;

/**
 * Created by heena on 13/05/17.
 */
public class Test {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCarImpl());
        sportsCar.assemble();

        System.out.println("\n-----------------------");

        Car luxuryCar = new LuxuryCar(new SportsCar(new BasicCarImpl()));
        luxuryCar.assemble();
    }
}