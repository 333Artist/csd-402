import java.util.ArrayList;
import javax.swing.JOptionPane;

//1. Create a collection of Fan Instances
//2.Create a method taking a collection of fan instances for display
//3.Create a method that takes a single instance of fan for for displaying
//4.use this where allowed
//5.test code that creates a collection of fans and displays the functionality of all fans instances in the collection


//Fan Class
class Fan {
        String color;

        //Constructor
        //4.Use this where allowed
        Fan(String color){
            this.color = color;
        }

        //3
        void display() {

            JOptionPane.showMessageDialog(null, "The Fan is " + this.color, "Fans", JOptionPane.INFORMATION_MESSAGE
            );
        }

         @Override
            //Readable
            public String toString() {
                return this.color;
            }
}


public class UseFans{


    //Fan Display Method
    public static void displayFans(ArrayList<Object> list){
        int length = list.size();
        for (int i = 0; i < length; i++) {
            Object obj = list.get(i);

            //Fulfill requirement 3 & 5
            Fan currentFan = (Fan) obj;
            currentFan.display();
            
        }
    }


    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, 
            "Welcome to UseFans!\nI will display my collection of fans.", 
            "Fans,Fans,Fans", 
            JOptionPane.INFORMATION_MESSAGE);


        //Fan Instances
        Fan fan1 = new Fan("blue");
        Fan fan2 = new Fan("red");
        Fan fan3 = new Fan("green");


        //1.Collection 
        ArrayList<Object> list = new ArrayList<>();
        
        list.add(fan1);
        list.add(fan2);
        list.add(fan3);
        

        //Text Code for full Functionality

        displayFans(list);

        System.err.println("Program Run");

        
        

    }
}

//Summary
//Clean code architecture main method is the orchestrator, mange a single item, manage an entire inventory loop
//Encapsulation, Fan class completely owns everything inside it, UseFans asks Fan instance to display itself
//Self-Reliance, the 'this' reference disambiguating local parameter and objects acutal field.
//Collections, dymanic list 
//Polymorphism, inherits from master Object class in ArrayList
//Downcasting, list is generic objects, must write (Fan) obj to convert it back to a fan
//Static vs Instance, static is global - main, displayFans, Instance, -Fan, display, requires NEW

