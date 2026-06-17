import java.util.Arrays;
import javax.swing.JOptionPane;

//Maddison Montijo//Module 4.2
public class ArrayAverageTest {

    //Overloaded Short Method
    public static short average(short[] array)
    {
    //I started with int method, copied the code, and adjusted for type.
    //Forgot to spell arrary and static correctly and to add semi-colon after sum += num

    //if loop for when array is empty, return 0
    if (array == null || array.length == 0) return 0;
    long sum = 0; // Long prevents overflow

    //for loop, adds numbers in array all together
    for(short num : array){
        sum += num;
    }
    //divides sum by array lenght -- very useful length method
    return (short) (sum / array.length);

    }

    //Overloaded Int Method
    public static int average(int[] array){
    //if loop for when array is empty, return 0
    if (array == null || array.length == 0) return 0;
    long sum = 0; // Long prevents overflow

    //for loop, adds numbers in array all together
    for(int num : array){
        sum += num;
    }
    //divides sum by array lenght -- very useful length method
    return (int) (sum / array.length);

    }


    //Overloaded Long Method
    public static long average(long[] array){
    //if loop for when array is empty, return 0
    if (array == null || array.length == 0) return 0;
    long sum = 0; // Long prevents overflow

    //for loop, adds numbers in array all together
    for(long num : array){
        sum += num;
    }
    //divides sum by array lenght -- very useful length method
    //I did not type the return
    return (sum / array.length);

    }

    //Overloaded Double Method
    public static double average(double[] array){
     //if loop for when array is empty, return 0
    if (array == null || array.length == 0) return 0;
    long sum = 0; // Long prevents overflow

    //for loop, adds numbers in array all together
    for(double num : array){
        sum += num;
    }
    //divides sum by array lenght -- very useful length method
    return (sum / array.length);

    }


    //Main Program//

    public static void main(String[] args) {

    //Intializing  Different Sized Arrays

    short[] shortArray = {10,20,30,40,50};
    int[] intArray = {100,200,300,400,500,600};
    long[] longArray = {1000L,3000L,5000L,7000L};
    double[] doubleArray = {1.5, 2.5, 3.5, 4.5,6.5,7.5};


    // Short Average String for Optionplane and Console
    String shortA = "Short Array Size |  " + shortArray.length + 
    " | Short Array Elements | " + Arrays.toString(shortArray) 
    + " | Short Array Average Results | " + average(shortArray);

    System.out.printf("%-15s | %-40s | %-10d\n", 
        "short (size " + shortArray.length + ")", 
        Arrays.toString(shortArray), 
        average(shortArray));


    // Int Average String for Optionplane and Console
    String intA = "Int Array Size |  " + intArray.length + 
    " | Int Array Elements | " + Arrays.toString(intArray) 
    + " | Int Array Average Results | " + average(intArray);

    System.out.printf("%-15s| %40s | %-10d\n",
        "int (size " + intArray.length + "0",
        Arrays.toString(intArray),
        average(intArray));

    // Long Average String for Optionplane and Console
    String longA = "Long Array Size |  " + longArray.length + 
    " | Long Array Elements | " + Arrays.toString(longArray) 
    + " | Long Array Average Results | " + average(longArray);

    System.out.printf("%-15s | %-40s | %-10d\n", 
        "long (size " + longArray.length + ")", 
        Arrays.toString(longArray), 
        average(longArray));

     // Double Average String for Optionplane and Console
    String doubleA = "Double Array Size |  " + doubleArray.length + 
    " | Double Array Elements | " + Arrays.toString(doubleArray) 
    + " | Double Array Average Results | " + average(doubleArray);

    System.out.printf("%-15s | %-40s | %-10.4f\n", 
        "double (size " + doubleArray.length + ")", 
        Arrays.toString(doubleArray), 
        average(doubleArray));

    //JOptionDisplay

    String AllStrings = (shortA + "\n" 
    + intA + "\n" 
    + longA + "\n" 
    + doubleA);

     JOptionPane.showMessageDialog(null, 
        AllStrings,
        "Average Result",
         JOptionPane.INFORMATION_MESSAGE);


    }

    



    
}
