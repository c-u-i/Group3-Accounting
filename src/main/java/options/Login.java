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
            System.out.println("= = = = = = = = = = = = = = = = = = =");
            System.out.println("= Choice made: Logon as a customer  =");
            System.out.println("= = = = = = = = = = = = = = = = = = =");
///            Service.service();

        } else if(serviceChosen==2){
            System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("= Choice made: Register as a new customer =");
            System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
///            Register.register();

        } else if(serviceChosen==0){
            System.out.println("- Program Terminates -");
            System.out.println("Good-bye!");
            System.exit(0);
            System.out.println();
        } else {
            System.out.println("Input wrong! Program ends.");
            System.exit(0);
        }
    }

/*
    private HashMap<String, String> setLan(int lanSet){

        HashMap<String, String> dictSrcDes = new HashMap<>();

        if(lanSet==1){
            dictSrcDes = DictEngDeu.dictEngDeu();
        } else if(lanSet==2){
            dictSrcDes = DictEngEsp.dictEngEsp();
        } else if(lanSet==3){
            dictSrcDes = DictEngFra.dictEngFra();
        } else if(lanSet==4){
            dictSrcDes = DictEngIta.dictEngIta();
        } else if(lanSet==5){
            dictSrcDes = DictEngPrt.dictEngPrt();
        } else{
            System.out.println("Input wrong. Program ends");
            System.exit(0);
        }
        return dictSrcDes;
    }

    private void mainMenu(HashMap<String, String> dictSrcDes){
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println();
        boolean mainView = true;
        while(mainView){
            System.out.println("       M A I N   M E N U");
            System.out.println("       -----------------");
            System.out.println("1. (A)dding flash cards (A)");
            System.out.println("2. (C)hanging flash cards (C)");
            System.out.println("3. (D)eleting flash cards (D)");
            System.out.println("4. (G)uessing flash cards (G)");
            System.out.println("5. (R)andom flash card test (R)");
            System.out.println("6. (L)isting all flash cards (L)");
            System.out.println("7. (S)howing all cards in pairs (S)");
            System.out.println("8. (Q)uitting program (Q)");
            System.out.println();

            Scanner input = new Scanner(System.in);
            String choiceMade = input.nextLine();

            if(choiceMade.equals("1") || choiceMade.equalsIgnoreCase("A")){
                dictSrcDes = AddCards.addCards(dictSrcDes);
                System.out.println(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("2") || choiceMade.equalsIgnoreCase("C")){
                dictSrcDes = ChangeCards.changeCards(dictSrcDes);
                System.out.println(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("3") || choiceMade.equalsIgnoreCase("D")){
                System.out.println("3. (D)eleting words (D)");
                DeleteCards.deleteCards(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("4") || choiceMade.equalsIgnoreCase("G")){
                GuessCards.guessingCard(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("5") || choiceMade.equalsIgnoreCase("R")){
                System.out.println();
                System.out.println("5. (R)andom test (R)");
                InRandoms rndmTest = new InRandoms();
                rndmTest.randomTest(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("6") || choiceMade.equalsIgnoreCase("L")){
                System.out.println("6. (L)isting all cards (L)");
                // System.out.println("Total words in the dictionary: " + DictSrcDes.dictSrcDes().size() *2);
                System.out.println("The current dictionary contains:");
                System.out.println(dictSrcDes);
                 System.out.println("Hit Return go back to MainMenu");
                Scanner h2r = new Scanner(System.in);
                String hit2Return = h2r.nextLine();
                System.out.println();
            } else if(choiceMade.equals("7") || choiceMade.equalsIgnoreCase("S")){
                System.out.println("7. (S)howing words in pairs (S)");
                ListInPairs.dictInPairs(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("8") || choiceMade.equalsIgnoreCase("Q")){
                System.out.println("8. (Q)uitting program (Q)");
                System.out.println("Good-bye!");
                mainView = false;
                System.out.println();
            } else {
                System.out.println("Something went wrong. Program is terminated");
                System.exit(0);
            }
        }
    }
*/
}
