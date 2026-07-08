import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/* 1.Create a class MaddiArray List Test */

public class MaddiArrayListTest{

    //unit tests
    //just check if the method works as intended

    //Shows it works for all proj requirements
    //Also some are unnesccary cause the try and catch, will prevent null 
    public static void testNormalNumbers() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 18, 9, 0));
        int result = MaddiArrayListTest.max(list);
        
        if (result == 18) {
            System.out.println("testNormalNumbers: PASSED (Found 18)");
        } else {
            System.out.println("testNormalNumbers: FAILED. Expected 18, got " + result);
        }
    }

    
    public static void testEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        int result = MaddiArrayListTest.max(list);
        
        if (result == 0) {
            System.out.println("testEmptyList: PASSED (Returned 0)");
        } else {
            System.out.println("testEmptyList: FAILED. Expected 0, got " + result);
        }
    }

    public static void testOnlyZero() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0));
        int result = MaddiArrayListTest.max(list);
        
        if (result == 0) {
            System.out.println("testOnlyZero: PASSED (Returned 0)");
        } else {
            System.out.println("testOnlyZero: FAILED. Expected 0, got " + result);
        }
    }


    

    /*Inside Class: */
    /*7.Method signature is public static integer max (ArrayList list) */
    /*2.Method - Recieves ArrayList with integers from user input*/
    /*5.Returns larget value in ArrayList*/
    /*6.If ArrayList is empty, method returns 0 */


    public static Integer max(ArrayList<Integer> list){
        //#6 Handling Null

        if(list == null || list.isEmpty()) {
            return 0;
        }

        //Find maximum value
        //Inputs are already stored
        //list.get(0) grabs the absolute first number the user entered, index 0, and assumes its the largest for now.
        //the for loop reads the list from left to right, it compares the current number (num) - the number at index 0, agaisnt the 
        //...tracking variable - largest
        //the tracking variable updates every time the loop encounters a number greather than it
        //exits and returns the ultimite max value

        int largest = list.get(0);

        //Iterate For Loop
        for (int num : list){
            //Update Largest if num is greatest
            if(num > largest){
                largest=num;
            }
        }

        return largest;
    }

    
    /*3.User input can enter integers, End user Input at Zero, record Zero into List */
    /*4.Arraylist gets sent to method */



    
/*Main */
/*Additional Test Code*/
/*Method returns display to user of Largest Value */

 public static void main(String[] args){

    ArrayList<Integer> userList = new ArrayList<>();
    //User enters Input

    //Keep looping until explicit exit condition is met
    //Establish an Infinite Collection Loop
    while(true) {
        //Using JoptionPlane cause its great for display
        String input = JOptionPane.showInputDialog(
            "Hello!Enter any number, except 0 - which will end the program and show the largest number you entered."
        );

        if (input == null){
            break;
        }

        try{
            //Changes user input into a number
            int number = Integer.parseInt(input);

            //if the number is zero, will add to the list, but will break loop
            //once it breaks, outside the loop, will run finished list into the method
            //Zero is a sentinel 
            if (number == 0) {
                userList.add(number);
                break;
            }
            //otherwise it'st just adding the numbers
            userList.add(number);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid whole number.");
        }
    
    }
    //End while loop

    //Pass the completed list to the max method
    int maxResult = max(userList);
    // Display the final output to the user
    JOptionPane.showMessageDialog(null, "The largest value in your list is: " + maxResult);


    //Unit Testing! 

    System.out.println("Running Unit Tests \n");

    testNormalNumbers();
    testEmptyList();
    testOnlyZero();

    System.out.println("\n All tests completed!");


}//End Main Loop

}

//Summary : Lots of things to think about! Important terms :
//Data Collection, Dynmaic Memory, the Sentinel Value (0 -cause its an easy mark to end the program), 
//Arrays need to know the how big before being used
//ArrayLists do not, and can dynamically grow and shrink

//Data Type Parsing, Conversion, Input Validation, Exception Handling
//Just changing string to Integer - Type Parsing
//Checking if users are entering valid input
//Catching exceptions like null 

//Seperation of Methods v Main
//Max and , other Methods handle core logic, like processing the data
//Main handles user interface and data collection
//This is how most websites operate!



