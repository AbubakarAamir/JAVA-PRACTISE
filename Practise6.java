//MADE BY :ABUBAKAR AAMIR.
//CLASS: SC 1
//LANGUAGE: JAVA

//  import java.util.Scanner;
//  public class  Practise6{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner (System.in);
//         System.out.println("Enter your name here :");
//         String userinputstring = scanner.nextLine();
//         System.out.println("Enter your age here :");
//         String userinputage = scanner.nextLine();
//         System.out.println("Your name is :" + userinputstring);
//         System.out.println("Your age is : " + userinputage);
//         scanner.close();
//     }
//  }
import java.util.Scanner;

public class Practise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name here:");
        String name = scanner.nextLine();

        System.out.println("Enter your age here :");
        int age = scanner.nextInt();
        if (age == 21) {
            System.out.println("Yes you are abubakar aamir ");
        } else if (age <= 20) {
            System.out.println(" you are not abubakar ");
        } else {

            System.out.println("you are the very wrong person");
        }
    scanner.close();


       System.out.println("Hello sir :  \n" + name);
       System.out.println("sir kaise ha aap\n:" +name);
       System.out.println("sir khana kah liya apne\n "+ name);

    }
}
