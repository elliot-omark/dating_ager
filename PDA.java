import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        Scanner inputs=new Scanner(System.in);
        int age; int age2;
        int LOWER_BOUND=0; int young=1;
        while(true){
            System.out.println("How old are you?");
            try{
                age= inputs.nextInt(); 
                System.out.println(age);
            } catch(InputMismatchException error){
                System.out.println("Please enter an integer next time");
                System.out.println("please reset");
                System.exit(0);
            }
            age= inputs.nextInt();

            System.out.println("younger or older");
            Scanner yong_or_olda=new Scanner(System.in);
            try{
                young= yong_or_olda.nextInt(); 
                System.out.println(age);
            } catch(InputMismatchException error){
                System.out.println("Please enter an integer next time");
                System.out.println("please reset");
                System.exit(0);
            }

            young= yong_or_olda.nextInt(); 
            if(young==1){
                age2=age/2;
                age2=age2+7;
                if (age2<18){
                    System.out.println("pedophile you match with people under 18"); 
                }else{
                    System.out.println(age2);    
                }
            }
            if(young==0){
                age2=age*2;
                age2=age2-7;
                if (age2<18){
                    System.out.println("pedophile you match with people under 18"); 
                }else{
                    System.out.println(age2); 
                }
            }else{
                System.out.println("not a valid input please try again");
                System.exit(0);
            }

        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

