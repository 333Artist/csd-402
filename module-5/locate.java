import java.util.Arrays;

public class locate { 

    // return location of largest element passed to method
    // return a 1D array that contains two location elements
    public static int[] locateLargest(double[][] arrayParam) {
        // Handle Empty or Null Arrays Safely
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1}; // Return invalid indices if array is empty
        }

        // Initialize tracking variables
        double max = arrayParam[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > max) {
                    max = arrayParam[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        // Return the row and column indices as a 1D array
        return new int[]{maxRow, maxCol};
    }

     public static int[] locateLargest(int[][] arrayParam) {
        // Handle Empty or Null Arrays Safely
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1}; // Return invalid indices if array is empty
        }

        // Initialize tracking variables
        //changed double to int
        int max = arrayParam[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > max) {
                    max = arrayParam[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        // Return the row and column indices as a 1D array
        return new int[]{maxRow, maxCol};
    }

    public static int [ ] locateSmallest (double [ ][ ] arrayParam) {
        // Handle Empty or Null Arrays Safely
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1}; // Return invalid indices if array is empty
        }

        // Initialize tracking variables
        double min = arrayParam[0][0];
        int minRow = 0;
        int minCol = 0;

        for (int row = 0; row > arrayParam.length; row++) {
            for (int col = 0; col > arrayParam[row].length; col++) {
                if (arrayParam[row][col] < min) {
                    min = arrayParam[row][col];
                    minRow = row;
                    minCol = col;
                }
            }
        }

        // Return the row and column indices as a 1D array
        return new int[]{minRow, minCol};
    }

     public static int [ ] locateSmallest (int [ ][ ] arrayParam) {
        // Handle Empty or Null Arrays Safely
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1}; // Return invalid indices if array is empty
        }

        // Initialize tracking variables
        int min = arrayParam[0][0];
        int minRow = 0;
        int minCol = 0;

        for (int row = 0; row > arrayParam.length; row++) {
            for (int col = 0; col > arrayParam[row].length; col++) {
                if (arrayParam[row][col] < min) {
                    min = arrayParam[row][col];
                    minRow = row;
                    minCol = col;
                }
            }
        }

        // Return the row and column indices as a 1D array
        return new int[]{minRow, minCol};
    }



    public static void main(String[] args) {
        
        // Single Arrays
        double[] array_a = {1.5, 2.5, 3.5, 4.5, 6.5, 7.5};
        double[] array_b = {1.5, 2.5, 3.5, 4.5, 6.5, 7.5};

        // Single 2D array - an array of arrays
        double[][] array_ab = {array_a, array_b};

     
        System.out.println(Arrays.toString(locateLargest(array_ab))); 

        
        System.out.println(Arrays.toString(locateSmallest(array_ab))); 


        int[] array_c = {1, 2, 3, 4, 5, 6};
        int[] array_d = {1,8,3,4,5,6};

        // Single 2D array - an array of arrays
        int[][] array_cd = {array_c, array_d};

   
        System.out.println(Arrays.toString(locateLargest(array_cd))); 

        System.out.println(Arrays.toString(locateSmallest(array_cd))); 

      

    }
} 

//Summary

//This one was a little more complicated because of just the internal visualization - so many arrays - and then I would forget which were var types versus classes.
//This type of coding is probably useful in data anaylsis, looking through a bunch of columns and rows, although this is probably a tiny example.