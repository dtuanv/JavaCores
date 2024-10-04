package solid.openClosePrinciple;

public class Square implements Shape{

    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double calculateArea(){
        System.out.println("Square: ");
        return side * side;
    }
}
