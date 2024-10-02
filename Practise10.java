//Name: Abubakar Aamir
//Language:java
//Class: SC-1


// In this section we learn about the methods . methods are just like the functions 
//suppose we have a block of code we call them if we needed . 
//  method is a block of code which only runs when it is called.
//You can pass data, known as parameters, into a method.
//Methods are used to perform certain actions, and they are also known as functions.

// here we created the class name Prcatise10 beacuse the program run with the same name class as the file name
/**
 * Practise10
 */


 // Here is the method() code using without parametres .

// public class Practise10 {

//     //here we created method name "mymethod"
//     static void mymethod(){
//  String Name = "Abubakar"; // here we created string data type for the name 
//  String fname = "Aamir"; // same as the above
//  int CLASS = 1; // // here we created the integar data type for the number

//  // here we print the results.
// System.out.println("The Name is :  " + Name);
// System.out.println("The father name is :" + fname);
// System.out.println("Your semester is :" + CLASS);


//     }


//     public static void main(String[] args) {
//         mymethod(); // here we call the our method 1 time(function)
//         mymethod(); // here we call the our method 2 time
//         mymethod(); // here we call the our method 3 time 

//     }
// }


// Here is the method() code using parametres
// class Practise10 {
 
//  //Here we created mymethod() with parametres.with name,integar   
// static void mymethod(String Name, int age){

// System.out.println("Kiya haal ha apke sir :  "+ Name);
// System.out.println("Apki omer yeh ha : " + age);


// }


// public static void main(String[] args) {
  
//   //Here we created mymethod(function)  
//     mymethod("Abubakar", 21);

// }


// }

// here is the second code practise.

// class Practise10{

//     static void Agechecked(String name , int age){
// System.out.println("Your Name is : " + name);

// if (age > 18) {
    
//     System.out.println("Yes you are young you can vote for the elections : " + age);

// }
// else{

//     System.out.println("You cannot vote for the elections \n because you are a child");
// }


//     }


//     public static void main(String[] args) {
        
//   Agechecked("Abubakar", 11);

//     }
// }


//Here is the mymethod()  code with return type 

// class Practise10{
//     static int mymethod(int x , int y){
//         return x + y;
//     }


//     public static void main(String[] args) {
//         int z = mymethod(5,4);
//         System.out.println("The Total is :  " + z);
//     }
// }



//Here is the method overloading 

//Method Overloading:
//With method overloading, multiple methods can have the same name with different parameters:

//1:int myMethod(int x)
//2:float myMethod(float x)
//3:double myMethod(double x, double y)


class Practise10{
static int plusMethod(int x, int y) {
    return x + y;
  }
  
  static double plusMethod(double x, double y) {
    return x  + y;
  }
  
  public static void main(String[] args) {
    int myNum1 = plusMethod(8, 5);
    double myNum2 = plusMethod(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }

}

