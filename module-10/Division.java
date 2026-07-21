//1.abstract division class with :
//a.companys divisions name field
//b.account number field
//c.an abstract display() method defined in subclass


//Top Level Superclass / Parent
public abstract class Division {

    //a,b.Fields
    protected String divisionName;
    protected int accountNumber;

    //2.constructor in superclass that requires values for both fields
    public Division(String divisionName, int accountNumber){
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }
    //c.Abstract Method
    public abstract void display();
}

//Summary
//Abstraction cannot be instantiated on its own, its a blueprint for other classes
//Creating public abstract void display() inside parent creates a rulebook


//Using super() inside a subclass constructor passes arguments up to the parents constructor
//Or. Parent has like core fields, while child has unique fields

//Skills : Multifire Architecture, Polymorphism(again), Main Method Runner - seperating the data structures from execution
