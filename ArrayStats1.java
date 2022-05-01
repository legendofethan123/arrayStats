public class ArrayStats1
{
    // ***********************************************
    // print the array's elements all on the same line
    // ***********************************************  
    int i = 0;// We will receive a reference (a memory address)
    // to an array. 
    // ray is the reference variable that receives the memory
    // address of some array.
    public void printArray(int[] ray)
    {
        System.out.print("The list is ");
        // loop through all of the elements
        // and print each element and a space
        
        for (i = 0; i<ray.length; i++)
        {
             System.out.print(ray[i] + " ");// print the ith element and a space
             // ???
        }
        
        // move the cursor to the next line
        System.out.println();// ??????
        
    } // end of method printArray()


    // ****************************************
    // find the sum of the numbers in the array
    // ****************************************  
    public int getTheSum(int[] ray)
    {
        // create a variable to hold your sum and set it 0.
       int sum = 0;
        // loop through all of the elements
        // and add each element to your sum
        for (i=0; i<ray.length; i++)
        {
             //add to your sum the value
            sum = sum  +  ray[i];
        }
        
        // return your sum
        return sum;  // replace the 0!!!!!!!!!!!!
    } // end of method getTheSum()

    
    
    // ****************************************
    // find the average of the numbers in array
    // ****************************************  
    public double getTheAverage(int[] ray)
    {
        // Get the sum and divide by the number
        // of elements in the array.
        // Make sure you do NOT lose any accuracy.
        double sum = 0.0;
        for (i = 0 ; i<ray.length; i++)
        {
             //add to your sum the value
            sum = sum  +  ray[i];
        }
        
      
        return sum/ray.length; // replace me with the average
    } // end of method getTheAverage()


    
    // ***************************************************************
    // find the sum of the numbers that are less than the first number
    // Example: ray = {10, 7, 4, 20, 3}
    // The sum would be 7 + 4 + 3 = 14, since 7, 4, and 3 are all less
    // than 10.
    // ***************************************************************  
    public int getTheSumOfNumbersLessThanFirstNumber(int[] ray)
    {
        // declare your sum variable
         int sum = 0;

        // get the first number from the array
        int firstNumber = ray[0];
    
        // loop from 1 to the end of the list
        for (i = 0; i<ray.length; i++)
        {
             if (ray[i]<firstNumber) // is less than firstNumber then 
             { sum = sum + ray[i]; }
             // add to your sum the value of ray[i]
             //     sum = ???  +  ???[i];

        }
        
        return sum;  // return the sum
    } // end of method getTheSumOfNumbersLessThanFirstNumber()


    
    // ***************************************************************
    // find the sum of the numbers that are less than the last number
    // Example: ray = {10, 7, 4, 25, 20}
    // The sum would be 10 + 7 + 4 = 21, since 10, 7, and 4 are all less
    // than 20.
    // ***************************************************************  
    public int getTheSumOfNumbersLessThanLastNumber(int[] ray)
    {
        int sum = 0;// get your initial sum
         

        // get the last number from the array
        int lastNumber = ray[ray.length-1];
        
        // loop from 0 to the end of the list
        for (i = 0; i<ray.length; i++)
        {
             if (ray[i] < lastNumber)
             {sum = sum + ray[i]; }// if ray[i] is less than lastNumber then 
             // add to your sum the value of ray[i]
             // sum = ???  +  ???[i];

        }
        
        return sum;  // return the sum
    } // end of method getTheSumOfNumbersLessThanLastNumber()

    
    // ****************************************
    // does the first number repeat?
    // ****************************************  
    public boolean firstNumberRepeats(int[] ray)
    {
        // get the first number in the list
        int firstNumber = 5;
        
        // loop through all of the elements starting at position 1
        // and see if you can find the firstNumber
        for (i=1; i<ray.length; i++)
        {
             if(ray[i] == firstNumber)
             {return true;}// is the first number here? 
             // if so, return true

        }
        
        // return false
        return false;
    } // end of method firstNumberRepeats()

    
    // ****************************************
    // does the last number repeat?
    // ****************************************  
    public boolean lastNumberRepeats(int[] ray)
    {
        // get the last number in the list
        int lastNumber = 10;
        
        // loop through all of the elements-1 starting at position 0
        // and see if you can find the lastNumber
        // Or go backwards!
        for (i=ray.length; i<ray.length; i--)
        {
             if (ray[i] == lastNumber)
             {return true;} // is the last number here? 
             // if so, return true

        }
        
        // return false
        return false;
    } // end of method lastNumberRepeats()

    
    
}  // end of class
