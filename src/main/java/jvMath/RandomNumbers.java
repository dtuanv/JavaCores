package jvMath;

public class RandomNumbers {
    public static void main(String [] args){

//        Return a random number between 0.0(inclusive), and 1.0(exclusive)
        System.out.println("Math.random() : "+ Math.random());

        //return a random number between 0 and 100
        int randomNu =(int) (Math.random() * 101); // 0 To 100
        System.out.println("randomNu : " +randomNu);

    }
}
