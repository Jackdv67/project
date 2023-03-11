import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sen = new Scanner(System.in);
        System.out.println("Enter Length of Array:");
        int arrLength =sen.nextInt();
        int [] anArray= new int[arrLength];
        System.out.println("Enter the element of the Array");
        for (int i=0;i<arrLength;i++){
            anArray[i] =sen.nextInt();
        }
            System.out.println("Displaying One Dimensional Array");
            for (int i=0;i<arrLength;i++){
                System.out.println(anArray[i]+ i + i++);
            }
    }
}
