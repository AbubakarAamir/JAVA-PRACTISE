//MADE BY :ABUBAKAR AAMIR.
//CLASS: SC 1
//LANGUAGE: JAVA

           //Java Operators:
//Operators are used to perform operations on variables and values.

class Hello {
    public static void main(String[] args) {
        
        int sum1 = 100 + 50;
        int sum2 = sum1 + 200;
        int sum3 = sum1 + sum2;
        int z = 19;
        z +=10;
        System.out.println(z); //print 29 beacuse we add 10 in 19
        int x = 23, y = 22;
    System.out.println(x>y);  // return true because x is greater than y
    System.out.println("The result of first \n"+  sum1);
    System.out.println("The result of second \n" +  sum2);
    System.out.println("The result of third \n" +  sum3);     
        

        // Java divides the operators into the following groups:

        // Arithmetic operators
        // Assignment operators
        // Comparison operators
        // Logical operators
        // Bitwise operators

    
        // Operator	Name	Example	
        // ==	Equal to	x == y	
        // !=	Not equal	x != y	
        // >	Greater than	x > y	
        // <	Less than	x < y	
        // >=	Greater than or equal to	x >= y




        // Operator	Name	Description	Example	
        // +	Addition	Adds together two values	x + y	
        // -	Subtraction	Subtracts one value from another	x - y	
        // *	Multiplication	Multiplies two values	x * y	
        // /	Division	Divides one value by another	x / y	
        // %	Modulus	Returns the division remainder	x % y	
        // ++	Increment	Increases the value of a variable by 1	++x	
        // --	Decrement	Decreases the value of a variable by 1	--x


        // && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
        // || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
        // !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

        

    //    HERE WE STARTED THE STRINGS METHODS :

    String greeting = "Assalam alikum";
    System.out.println(greeting.length());
    System.out.println(greeting.toLowerCase());
    System.out.println(greeting.toUpperCase());

    // here is the simple practise related string 
    String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("where")); // Outputs 7


   // HERE IS THE PROCESS TO CONCATENATION   A STRING  :

   String  NAME = "Abubakar";
   String FNAME = "Aamir";
   String MNAME = "Nadia";
   //HERE IS THE FIRST METHOD TO CONCATENATION.
   System.out.println(NAME +" "  + FNAME);
   //   HERE IS THE SECOND METHOD TO CONCATENATION.
  System.out.println(MNAME  .concat(  FNAME));
    }
}
