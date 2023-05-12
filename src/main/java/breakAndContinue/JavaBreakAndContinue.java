package breakAndContinue;

public class JavaBreakAndContinue {
    //Break used to "jump out" of a loop; or of a switch Statement.
    public static void main(String[] args){
        for(int i = 0; i<20; i++){
            if(i == 15){
                break;
            }
            System.out.println("for loop with Break statement i in break < 15 : "+i);

        }
        System.out.println("---------------Java Continue----------------------");

        // The continue Statement breaks one iteration (in the loop),
        // if a specified condition occurs, and continues with the next iteration in the loop!
        for(int i = 0 ; i < 20 ; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("for loop with continue statement ! i: "+i);
        }
//        Break and Continue in While Loop are the same as in a for loop
    }
}
