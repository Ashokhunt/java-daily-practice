import java.util.Scanner;

public class readname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter your name :");

        String name=sc.nextLine();

        System.out.print("Enter your age :");

        int age=sc.nextInt();

        System.out.println("hai my name is "+name+" ,i am "+age+" old");


        
    }
    
}
