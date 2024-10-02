    // This is the first code practise:
// class Demo {
//     String name = "Abubakar ";
//     String fname = "Aamir";
//     int year = 1;
//     int age = 21;
    
//      //here we created our method to print our result.

// void show_reult(){
//      System.out.println(" Your name is "+ name);
//      System.out.println("Your father name is " + fname);
//      System.out.println("Your university year is " + year);
//      System.out.println("Your age is  " + age);

// } 


// }

// class Practise9 {
//     public static void main(String[] args) {
//         Demo reference = new Demo();
//          reference.show_reult();
//     }
// }


//   This is the second code practise:

//here we created a class named Test 
// class  Test {
//     //properties(or attributes) of the class.
//     String model = "mira";
//     String color = "grey";
//     int year =  2;


//     // here we created methods to displays car details
// void  show_result()
// {
//     //here we print our messages.
//     System.out.println("Your car name is " + model);
//     System.out.println("Your car color is " + color);
//     System.out.println("Your color validation is " + year);    

// }


// }

// //here we created main class to run the program 
// class Practise9{
//      public static void main(String[] args) {

//         //create an object of the car class.
//         Test reference =  new Test();
//         reference.show_result();
//      }
//     }


// This is the third code practise .

// defined the class named cricketplayer 
// class cricketplayer {
//     //properties (or attributres ) for the class. 
// String name ; 
// String fname; 
// int experience;
// int age ;



// //method to display playerinformation .
// void playerdisplay(){

//     //here we print our messages .
// System.out.println("Player name is : " + name);
// System.out.println("Player father name : " + fname);
// System.out.println("Player experience : " + experience );
// System.out.println("Player age :" + age);



// }


// }

// // here we created the Practise  class to run the program .
// class  Practise9 {

//     public static void main(String[] args) {
//        //   create an object of the cricketplayer 
//         cricketplayer player =  new cricketplayer();

// //. is also called reference operator . 
//         player.name = " Abubakar";
//         player.fname = "Aamir";
//         player.age = 21;
//         player.experience = 11; 
       
//         player.playerdisplay();

//     }
// }



// This is the fourth code practise.


class  cricketteam {
    String Teamname ;
    String Teamcolor;


    void  cricketteaminfro(){

        System.out.println("Team name  is : " + Teamname );
        System.out.println("Team color is : " + Teamcolor);

    }

}

// here we created class Practise9 to run the program .

public  class  Practise9{

    public static void main(String[] args) {
        
        cricketteam team1 = new cricketteam();
        team1.Teamname = "Pakistan "; 
        team1.Teamcolor = "green";
        team1.cricketteaminfro();
    }
}