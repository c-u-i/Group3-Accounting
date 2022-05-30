package options;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Main class of the Java program.
 */

public class Login {

    public void start() {

        bannerShow();
        ok();
//        HashMap<String, String> dictSrcDes = chooseLan();
//        mainMenu(dictSrcDes);
    }

    private void bannerShow(){
        System.out.println("==========================================");
        System.out.println("=     Welcome to J2 Demo Bank System     =");
        System.out.println("==========================================");
        System.out.println();
    }

    //    private HashMap<String, String> chooseLan(){
    private void ok(){

        HashMap<String, String> dictSrcDes = new HashMap<>();
        int counter = 0;


        System.out.println("     1. Logon as a customer");
        System.out.println("     2. Register as a new customer");
        System.out.println();
        System.out.println("     0. Terminate the program");
        System.out.println();

        System.out.print("Please make a choice: ");

        Scanner sc = new Scanner(System.in);
        int serviceChosen = sc.nextInt();
        System.out.println();

        if(serviceChosen==1){
            System.out.println("= = = = = = = = = = = = = = = = = =");
            System.out.println("= Choice made: Logon as customer  =");
            System.out.println("= = = = = = = = = = = = = = = = = =");
///            Service.service();
///            Bank.Bank();

/*
        //creating 3 objects
        Bank bank = new Bank();
        Options options = new Options();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Welcome to your Banking Services");
            System.out.println("********************************");


            User u;

            do {
                System.out.println("Please write your name");
                String name = input.nextLine();

                System.out.println("Please write your password");
                String password = input.nextLine();
                System.out.println("****************************");

                u = bank.login(name, password);
            } while( u == null);

*/


        } else if(serviceChosen==2){
            System.out.println("= = = = = = = = = = = = = = = = = = = = =");
            System.out.println("= Choice made: Register as new customer =");
            System.out.println("= = = = = = = = = = = = = = = = = = = = =");
///            Register.register();

        } else if(serviceChosen==0){
            System.out.println("- Program Terminates -");
            System.out.println("Good-bye!");
            System.exit(0);
            System.out.println();
        } else if (serviceChosen!=1 || serviceChosen!=2 || serviceChosen!=0){
            do {
                if(counter == 3){
                    System.out.println("Good morning! Are you analphabet?");
                    System.out.println("You pressed " + counter + " times with a wrong number! Program ends.");
                    System.exit(0);
                } else {
                    System.out.println("Input wrong. Please press 1, 2 or 0.");
                    System.out.print("Please make a choice: ");

// 1. How does it know to amend the value of serviceChosen?

                    serviceChosen = sc.nextInt();
                    System.out.println();
                    counter++;
                }
            } while (true);
        } else {

// 2. How to catch special signs, pls !!!

            System.out.println("Sorry, but you did not press a number. Program ends with no comments.");
            System.exit(0);
        }
    }

}

