//MADE BY : ABUBAKAR AAMIR
//CLASS: SC 1
//LANGAUGE: JAVA


// HERE WE ARE DOING SWITCH CASES :
//The switch statement selects one of many code blocks to be executed:


import  java.util.Scanner;
public class Practise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here we show you the weekend days names by using your input number:");
        System.out.println("Let's get started");
    
        int number = scanner.nextInt();

        switch (number) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
            System.out.println("Wednesday");
            break;
            
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Week mein bus 7 he din hote ha ");
            
        }

scanner.close();
    }
    
}
