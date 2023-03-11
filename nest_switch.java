import java.util.Scanner;

class nest_switch{    
    public static void main(String []arg) {
    int ch,a=1,b=100;
    System.out.print("Menu\nChoose the option\n 1) Addition\n 2) Substraction\n 3) Multiplication\n 4) Division \n Enter the option given \t");
    Scanner sc=new Scanner(System.in);
    ch=sc.nextInt();
    switch (ch) {
        case 1:
            System.out.print(a+b);
            break;
        case 2:
            System.out.print(a-b);
            break;
        case 3:
            System.out.println(a*b);
            break;
        case 4:
            System.out.println(a/b);
            break;
        default:
            System.out.println("Invalid Option");       
            break;
    }
     }
}