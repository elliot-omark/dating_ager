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
        while(should_continue==true){
            System.out.println("How old are you?");
            Scanner inputs=new Scanner(System.in);
            float age; float old=0; float young=0;
            int LOWER_BOUND=13;

            try{
                age= inputs.nextInt();
                if(age<=LOWER_BOUND){
                    System.out.println(age+" is too young!!");
                }else {
                    old=(age-7)*2;
                    young=(age/2)+7;
                    Math.ceil(young);
                    Math.floor(old);
                    if(young<0||old<0){
                        System.out.println("NO");
                        System.out.println("JUST NO");
                    }if(young<21){
                        System.out.println("The creator of this code" +
                        " does not condone this");
                        System.out.println(Math.round(young)+" to "+Math.round(old)+
                        " is your age range");
                    }else{
                        System.out.println(Math.round(young)+" to "+Math.round(old)+" is your age range");
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

