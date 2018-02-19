import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Must type with spaces, e.g. 1 + 2");
        System.out.println("Type ! as the operator to quit.");
        Scanner in = new Scanner(System.in);
        Boolean quit = false;
        while (!quit) {
            int x = 0;
            int y = 0;
            System.out.println("Enter equation: ");
            String str = in.nextLine();
            for (int i=0;i<str.length();i++) {
                 String sub = str.substring(0+i,1+i);
                 if (sub.equals(" ")) {
                    y = i;
                }
            }
            double a = Double.parseDouble(str.substring(0,y-2));
            String op = str.substring(y-1,y);
            double b = Double.parseDouble(str.substring(y+1));
            if (b == 0)  {
                System.out.println("Divide by zero...");
            }
            else {
                int z = 0;
                if (op.equals("+"))  z = 1;
                else if (op.equals("-"))  z = 2;
                else if (op.equals("*"))  z = 3;
                else if (op.equals("/"))  z = 4;
                else if (op.equals("!"))  z = 5;

                if (z == 1) {
                    a += b;
                }
                else if (z == 2) {
                    a -= b;
                }
                else if (z == 3) {
                    a = a * b;
                }
                else if (z == 4) {
                    a = a / b;
                }
                else if (z == 5) {
                    a = Math.pow(a, b);
                }
                long f = Math.round(a * 1000);
                a = f / 1000.0;
                System.out.println("Result: " + a);
            }
        }
    }
}
