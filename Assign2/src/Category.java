import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Category extends Product {
public void cat(){
    String cat1 = "Chips";
    String cat2 = "Biscuit";
    String cat3 = "Ice-Cream";
    String p1 = "Lay's";
    String p2 = "Oreo";
    String p3 = "Walls";
    String p4 = "Sooper";
    String p5 = "Super Crisps";
    String p6 = "Omore";
    Scanner c = new Scanner(System.in);
    System.out.println("Enter Product whose category you want to see: ");
    System.out.println("\n1. " + p1 +"\n2. "+ p2 + "\n3. " + p3 + "\n4. " + p4 + "\n5. "+ p5 + "\n6. "+p6);
    int ch = c.nextInt();
    if(ch == 1 || ch == 5){
        System.out.println("Category: "+cat1);
    }
    else if(ch == 2 || ch == 4){
        System.out.println("Category: "+cat2);
    }
    else if(ch == 3 || ch == 6){
        System.out.println("Category: "+cat3);
    }
}
}