import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
/**
 * Permissible Dating Age program
 *
 * @author elliot omark
 * @version 2023-11-1 Version 1.0.0
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
        boolean should_continue=true;
        while(true){
            System.out.println("How old are you?");
            Scanner inputs=new Scanner(System.in);
            int age; int old=0; int young=0;
            int LOWER_BOUND=0;

            try{
                age= inputs.nextInt();
                if(age<LOWER_BOUND){
                    System.out.println(age+" is too young!!");
                }else {
                    old=age-7;old=old*2;
                    young=age/2;young=young+7;
                    Math.round(young);
                    Math.round(old);
                    if(young<0||old<0){
                        System.out.println("pardon me HWHAT!!");
                        System.out.println(young+" to "+old+" is your age range");
                    }if(young<18){
                        System.out.println("your a pedophile");
                        System.out.println(young+" to "+old+" is your age range");
                    }else{
                        System.out.println(young+" to "+old+" is your age range");
                    }
                }
            } catch(InputMismatchException error){
                System.out.println("Please enter an integer next time");
                inputs.next();
            }
            Scanner Continue=new Scanner(System.in);
            System.out.println("Do you wish to continue, 1 for yes, 0 for no");
            try{
                int l=Continue.nextInt();
                if(l==0){
                    System.out.println("thank you for playing");
                    should_continue=false;
                }
            } catch(InputMismatchException error){
                System.out.println("Please enter an integer next time");
                Continue.next();
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

