import java.util.Scanner;

public class complex_calci {

    public static void main(String[]  args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number\n ");
        String s1 = sc.nextLine();
        System.out.print("Enter Second Number\n");
        String s2 = sc.nextLine();
        System.out.print("Enter Operation( +,-,*,/ ) ");
        String op = sc.nextLine();
        double r =0;
       
        try {
            double a1 = Double.parseDouble(s1);
            double a2 = Double.parseDouble(s2);
        
        switch(op){
            case "+":
            r = a1+a2;;
            break;

            case "-":
            r = a1-a2;
            break;

            case "/":
            r = a1/a2;
            break;

            case "*":
            r = a1*a2;
            break;

            default:
            System.out.println("Wrong operation" + op);
            return;
        }
        System.out.println("Result Final : " + r); 
    } 
    catch (Exception e) {
        System.out.println("Not a correct Number" + e.getMessage());
    }
}   
        }