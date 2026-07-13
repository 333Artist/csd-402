import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Random;

//1.create a new file titled data.file TODO oh wait gotta rename this program
//2.Write to the new file - adding 10 random generated numbers
//3. Each integer is to be seperated by a space
//4.Close the file,
// // then reopen the file, 
// /// //read the data from the file 
// // // //and display it


//I'm gonna utilize all the topic we discuss in the discussions more often.
//Important Keywords
//FileSystem, Paths, Files, BasicFileAttributes 
//BufferedOutPut Steam, OutputStream
//BufferedReader, InputStreamReader

public class programB {

    public static void main(String[] args) {

        //Instance Field
        String fileName = "data.file";


        //1.create a new file titled data.file 
        try {

            //Utilizing a lot of libraries  this time
            //Using File to create file object
            File myObj = new File(fileName);

            //Create a new file if said file does not exist.
            if (myObj.createNewFile()) {
                System.err.println("File Created :" + myObj.getName());
            } else {
                System.err.println("File Already Exists");
            }


            //Tracking the file path
            Path path = Paths.get(fileName);
            //Inspect File
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
            //File creation tracking
            System.err.println("Creation Time : " + attr.creationTime());
           
            //Using it for more efficent file writing
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(myObj));
            //Random to create random numbers
            Random r = new Random();

            //Generate random integers in range 0 to 999.
            //Obviously gonna use a loop so I dont gotta write them all out - arthritis yikes
            for (int i = 0; i < 10; i++) {
                int randomNum = r.nextInt(100);

                myWriter.write(String.valueOf(randomNum));
                myWriter.write(" ");
                
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.\n");

            // 5. Reopen the file, read the data, and display it
            System.out.println("--- Reopening and Reading File ---");
            
            // Using BufferedReader to read the text back efficiently
            BufferedReader myReader = new BufferedReader(new FileReader(myObj));
            String line;

            while ((line = myReader.readLine()) != null) {
                System.err.println("File Content: " + line);
            }

            myReader.close();

            
        } catch (IOException e) {
            System.err.println("An Error occured");
            e.printStackTrace(); //Print Error Details

        }

        //2.Write to the new file - adding 10 random generated numbers
        

        //3. Each integer is to be seperated by a space


        
    }

}