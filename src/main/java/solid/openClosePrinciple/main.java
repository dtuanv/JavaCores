package solid.openClosePrinciple;

public class main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        double calculate = areaCalculator.calculate(new Square(20.0));
        System.out.println(calculate);

        double rectangle = areaCalculator.calculate(new Rectangle(5,3));

        System.out.println(rectangle);
    }
}
