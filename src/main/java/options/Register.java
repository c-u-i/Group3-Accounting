package options;
import java.util.Scanner;


public class Register {

    public void register() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name ");
        String customerName = scanner.nextLine();
        System.out.println();
        System.out.println("Please set a password (6 digits and first 2 must be letters)");
        String customerPassword = scanner.nextLine();

//???
        if(customerPassword != null){
            System.out.println("You password is not 6 digits long!");

//    }else if(!(customerPassword.contains() == null)){
        }else if(null == null){
            System.out.println("First 2 digits must be letters!");

        }else {
            System.out.println("!!!!");

        }




        System.out.println();

        System.out.println("Welcome customer: " + customerName + " with password: " + customerPassword);
        System.out.println("Every dog has its day!");
        System.out.println("And you're the lucky devil today!");
        System.out.println("As a new customer, you get 250.00 EUR as bonus!");

    }




}