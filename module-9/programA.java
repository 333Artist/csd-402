
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

//1.ArrayList filled with 10 strings
//2.For-each loop prints ArrayList Collection
//3.User prompt, asks which element they would like to see again
//4.Printer user element in try/catch format
//5.If the user element value is invalid display a message out of bonds with exception
//6.Include autoboxing/uboxing working with a user's string input

public class programA {

    public static void main(String[] args){

        //[O] 1. ArrayList with 10 Strings

        String petsString = "Ants, Bunny, Cat, Dog, Hamster, Hedgehog, Mouse, Parrot, Rat, Snake";
        
        //ISSUE OCCURED : There was a space before every word, which led to list being read differently than I expected.
        //Fix :  ,\\s* takes away whitespace
        String [] petsItem = petsString.split(",\\s*");

        ArrayList<String> pets = new ArrayList<>(Arrays.asList(petsItem));

        //2.For Each Loop prints each element

        for (String pet : pets) {
            System.out.println("Displaying Collection : " + pet);
        }

        //3.User prompt, asks which element they would like to see again
        //4.Printer user element in try/catch format
        //5.If the user element value is invalid display a message out of bonds with exception
        //6.Include autoboxing/uboxing working with a user's string input

        
       
        while (true) { 
            boolean found = false;
            //3.User Prompt
            String input = JOptionPane.showInputDialog(
            "Hello! Welcome to this program! \nI will show you a list of common pets. \nChoose one to learn more. \n" + pets);
            System.err.println(input);


            //If user clicks cancel or closes the window.
            if (input == null){
            break;
            }


            //Cleans up the input (removes accidental spaces)
            input = input.trim();

            try{
                //
                int matchedIndex = -1;

                // Match String manually using loop

                //For Loop to go through the entire arraylist
                for (int i = 0; i < pets.size(); i++) {

                    //Compares strings with input, then gets the index of where the matched string was.
                    if (input.equalsIgnoreCase(pets.get(i))) {
                        matchedIndex = i; 
                        System.err.println("Matched Index : " + matchedIndex);
                        break;
                    }
                }


                    //6. Autoboxing - Force the primitive int index into an integer object
                    Integer boxedIndex = matchedIndex;
                    System.err.println("boxedIndex : " + boxedIndex);

                    //6. Unboxing - Extract the primitive int out of the integer object
                    int unboxedIndex = boxedIndex;
                    System.err.println("unboxed Index : " + unboxedIndex);

                    // 5. If the value is invalid (-1), we manually trigger the Out of Bounds exception
                    if (unboxedIndex == -1) {

                        //Way better than originally using the for-each loop for this.
                        //Made throwing the exception way easier.
                        throw new IndexOutOfBoundsException("Pet '" + input + "' is not in our list!");

                    }

                    String chosenPet = pets.get(unboxedIndex);
                    JOptionPane.showMessageDialog(null, "You chose a valid pet: " + chosenPet);
                    
                    //Break out of loop once match found.
                    break;

            } catch (IndexOutOfBoundsException e) {
                //5.Display a message out of bounds with exception
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }finally {
            System.err.println("Attempt Processed");
        }
    }

    System.err.println("Program End");

}}

//Summary

//Primitives are basic lightweight data types like int, double, boolean
//Objects are heavyweight classes that come with methods like Integer, Double, Boolean

//boxing and unboxing bridge the two data worlds

//Collections like ArrayList can only store Objects, they cannot hold raw primitives like int
//Integer boxedIndex = matchedIndex; =>> Java will secretly rewrite this code like Integer.valueOf(matchedIndex) to wrap raw number into object box

//Unboxing is the opposite
//int unboxedIndex = boxedIndex; ==>> boxedIndex.intValue() is invoked, and the object box is stripped away to extract raw data

//It would have been harder to use an object to look throw the pet ArrayLists
//Getting the raw primitive int to pass into pets.get(index) was much easier

//Topics Covered : 
//Data Sanitization - split()
//Flow Control and Scope - prevent infinite loops (accidently did that at one point acutley)
//Defensive Programming - exception handling
//Memory Management Concept Rules - memory allocation for primitives (stack allocated) and (heap allocated) objectes

