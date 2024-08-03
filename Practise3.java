//MADE BY :ABUBAKAR AAMIR.
//CLASS: SC 1
//LANGUAGE: JAVA

//     IN THIS WE DOING TYPE CASTING :

//TYPE CASTING:Type casting is when you assign a value of one primitive data type to another type

class main {
    public static void main(String[] args) {
      
      // Set the maximum possible score in the game to 500
int maxScore = 500;

// The actual score of the user
int userScore = 423;

/* Calculate the percantage of the user's score in relation to the maximum available score.
Convert userScore to float to make sure that the division is accurate */
float percentage = (float) userScore / maxScore * 100.0f;

System.out.println("User's percentage is " + percentage);
      
      
       //here is the type casting integar to double
        int myintegar = 9;
         double mydouble = myintegar; //here automatically casting into double 
         System.out.println(myintegar);
         System.out.println(mydouble); 
    }
}