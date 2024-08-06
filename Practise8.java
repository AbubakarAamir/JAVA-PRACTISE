//MADE BY:ABUBAKAR AAMIR
//CLASS:SC 1
//LANGUAGE:JAVA

//      IN THIS WE ARE DOING WHILE LOOP AND DO-WHILE LOOP PROGRAMS
import  java.util.Scanner;

public class Practise8 {


Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      
        // System.out.println("Here we print your name multiple times:");
        // String userinput = "Abubakar";
     
        // int i; // decaleration
        // i = 0; // intialiation
        // while(i<=10){
        //     System.out.println(userinput);
        //     i++;
        // // }
        // Scanner scanner = new Scanner(System.in);

        // // Prompt the user to enter their name
        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();
        // System.out.println("Hello, " + name + "!");

        // // Prompt the user to enter a number
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // // Use a while loop to print the name the specified number of times
        // int count = 0;
        // while (count < number) {
        //     System.out.println(name);
        //     count++;
        // }

        // // Close the scanner
        // scanner.close();


    // HERE WE DOING DO WHILE LOOP:
//     int i = 0;
// do {
//   System.out.println(i);
//   i++;
// }
// while (i < 5);
     
// HERE WE DOING DAILY LIFE EXAMPLES:
// int countdown = 3;

// while (countdown > 0) {
//   System.out.println(countdown);
//   countdown--;
// }

// System.out.println("Happy New Year!!");


// int dice = 1;

// while (dice <= 6) {
//   if (dice < 6) {
//     System.out.println("No Yatzy.");
//   } else {
//     System.out.println("Yatzy!");
//   }
//   dice = dice + 1;
// }



    // HERE WE DOING FOR LOOP AND NESTED LOOP :

//in this for loop we intilaize , condition and also do increament in same bracket

// for(int i = 1; i<=20; i++){
//     System.out.println("HIII ! Abubakar");
// }

     //Here is the nested loop :


    //  for (int x = 1; x<=2; x++){
    //     System.out.println("Outer loop is " + x );


    //     for(int y =2; y<=3; y++){

    //         System.out.println("inner loop is " + y);
    //     }
    //  }


    //Here we print the table :
    // int mynumber = 5;
    // for(int i = 1; i<=10; i++){
    //     System.out.println(mynumber + "x" + i + "=" +(mynumber*i));
    // }


    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a number
    System.out.print("Enter a number to print its multiplication table: ");
    int number = scanner.nextInt();

    // Use a for loop to print the multiplication table
    System.out.println("Multiplication Table of " + number + ":");
    for (int i = 1; i <= 10; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));
    }

    // Close the scanner
    scanner.close();
 



}
    
}
