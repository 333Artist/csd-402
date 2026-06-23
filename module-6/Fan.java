public class Fan {

    //Final ensures values cannot be changed
    //Learned today, when a var is static, and belongs to the class itself, it saves memory
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

     private int speed = STOPPED; 
     private boolean on = true;
     private int radius = 6;
     private String color = "white"; 


     //Default Constructor - No Argument - No Return
     //Out of the Box Fan
    public Fan(){

        //Setting Defaults
        System.out.println("No-Arg Constructor Invoked");
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";

        

    }

     //Argument Constructor
     //Custom Fan
     public Fan(int speed, boolean on, int radius, String color) {
        System.out.println("Arg Constructor Invoked");
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
        }

    //Getters and Setters
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public boolean isOn() { return on; }
    public void setOn(boolean on) { this.on = on; }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    //Readable
    public String toString() {
        if (on) {
            return "Fan is ON: speed = " + speed + ", color = " + color + ", radius = " + radius;
        } else {
            return "Fan is OFF: color = " + color + ", radius = " + radius;
        }
    }


  public static void main(String[] args) {
        // Default constructor
        //Out of the box Fan
        Fan fan1 = new Fan();
        
        // Argument constructor (e.g., FAST, turned on, radius 10, yellow)
        // 
        Fan fan2 = new Fan(FAST, true, 10, "yellow");

        // Display functionality using toString()
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }

    
}

//Summary : I'm going to start writing notes on what skills this builds
// Encapuslation - private, public, static, final - keep code immutable and secure
// Polymorphism - two constructors means code is flexible
//Object-Oritend Modeling - one blueprint can create indepdent objects with seperate data
//Maybe I could do the skills builts like tags 
