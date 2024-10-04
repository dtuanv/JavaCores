package solid.openClosePrinciple;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        System.out.println("calculate area Circle");
        return Math.PI * radius;
    }
}
