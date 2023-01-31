import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int d1;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("1. Supplier\n2. Products\n3. Employees\n4. Customer\n5. Order\n6. History\n7. Warehouse");
        int ch = c.nextInt();
            switch (ch) {
                case 1: {
                    Supplier s1 = new Supplier();
                    s1.suppliers();
                    break;
                }
                case 2: {
                    Category c1 = new Category();
                    Scanner p = new Scanner(System.in);
                    System.out.println("Enter Choice: \n1. Products\n2. Categories of Products");
                    int cat = p.nextInt();
                    if (cat == 1) {

                        c1.prod();
                    } else if (cat == 2) {
                        c1.cat();
                    } else {
                        System.out.println("Invalid Choice");
                    }
                    break;
                }
                case 3: {
                    Manager emp = new Manager();
                    Scanner e = new Scanner(System.in);
                    System.out.println("Enter your choice: \n1. Employee Information\n2. Manager's Information");
                    int e1 = e.nextInt();
                    switch (e1) {
                        case 1: {
                            emp.Emp();
                            break;
                        }
                        case 2: {
                            emp.mgr();
                            break;
                        }
                        default: {
                            System.out.println("Invalid Choice!");
                        }
                        break;
                    }
                }
                case 4: {
                    Customer c1 = new Customer();
                    c1.cust();
                    break;
                }
                case 5: {
                    OrderDetails o1 = new OrderDetails();
                    o1.orderdet();
                    break;
                }
                case 6: {
                    History h1 = new History();
                    h1.Histor();
                    break;
                }
                case 7: {
                    Warehouse w1 = new Warehouse();
                    w1.w_info();
                    break;
                }
            }
            Scanner d = new Scanner(System.in);
            System.out.println("Do you want to Chose again? ");
             d1 = d.nextInt();
    }
}