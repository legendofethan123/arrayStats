// Lab Chapter 14 Arrays Set 1, Lab 4
// 4) Main.java and ArrayStats4.java
      
// Lab Chapter 14 Arrays Set 1, Lab 1
// 1) Main.java and ArrayStats1.java

// FINISH ME
// Name: Your full name goes here

public class Main // ArrayStats1Runner
{
  
    public static void main( String args[] )
    {
        System.out.println("ArrayStats1Runner");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line

        // FINISH ME
        System.out.println("Chapter 14 - Set 1 Lab 1  Written by Ethan gonzalez");
        System.out.println(); // prints a blank line
        System.out.println(); // prints a blank line
        
        ArrayStats1 arrayStats = new ArrayStats1();

        int [] array = new int[] {5,1,2,3,4,5,6,7,8,9,10};
        // we could also say:
        // int [] array = new int[11]; // new creates 11 variables with same name
        // array[0] = 5;
        // array[1] = 1;
        // array[2] = 2;
        // etc.
        
        arrayStats.printArray( array );     
        System.out.println( "The sum is               " + arrayStats.getTheSum( array ) );
        System.out.println( "The average is           " + arrayStats.getTheAverage( array ) );
        System.out.println( "The sum smaller than " + array[0] + "   " + arrayStats.getTheSumOfNumbersLessThanFirstNumber( array ) );
        System.out.println( "The sum smaller than " + array[array.length-1] + "  " + arrayStats.getTheSumOfNumbersLessThanLastNumber( array ) );
        System.out.println( "The first number repeats " + arrayStats.firstNumberRepeats( array ) );
        System.out.println( "The last number repeats  " + arrayStats.lastNumberRepeats( array ) );
          



 
        
    } // end of main method
    
} // end of class

/*
Chapter 14 - Set 1 Lab 1  Written by YOUR NAME GOES HERE


The list is 5 1 2 3 4 5 6 7 8 9 10 
The sum is               60
The average is           5.454545454545454
The sum smaller than 5   10
The sum smaller than 10  50
The first number repeats true
The last number repeats  false
*/

// Lab Chapter 14 Arrays Set 1, Lab 1
// 1) ArrayStats1Runner.java and ArrayStats1.java

// FINISH ME
// Name: Your full name goes here


// NOTE: An array is an object, however it does
//       not have any methods of its own.  
//       It does have a constant variable called length.  
//       Variable length is NOT a method,
//       so NO parenthesis ().
//  
//       Suppose variable ray is a reference to an array.
//      
//       Examples:
//       ray.length is the number of elements in your array. [0 to ray.length-1]
//       You can access an element of the array by using
//       nameOfArray[position]
//       Examples:
//          ray[2] = 98;           // changing the value
//          ray[2] = ray[3];       // changing the value
//          out.println(ray[2]);   // printing
//          if (ray[i] == ray[i+1]) ...
//


