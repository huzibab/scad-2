import java.util.Scanner;

public class Payments {
    public void p_method(){
        String m1 = "Cash";
        String m2 = "Card";
        String m3 = "Easypaisa/JazzCash";
        Scanner met = new Scanner(System.in);
        System.out.println("Enter Mode of payment: ");
        System.out.println("1. Cash\n2. Card\n3. Easypaisa/JazzCash");
        int met1 = met.nextInt();
        if (met1 == 1){
            System.out.println("You chose: "+m1);
        }
        else if(met1 == 2){
            System.out.println("You chose: " + m2);
        }
        else if(met1 == 3){
            System.out.println("You Chose: "+m3);
        }
        else{
            System.out.println("Invalid Choice!");
        }

    }
}
