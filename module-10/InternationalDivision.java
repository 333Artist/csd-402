//4.International Division includes fields
//a.country field where division field is located
//b.language spoke field 


//5.write an app named useDivision that creates two instances of each of these concrete classes
//a.4 totalt instances


public class InternationalDivision extends Division{
    //a.4. Fields
    private String country;
    private String languageSpoken;

    //c.Constructor
    public InternationalDivision(String divisionName, int accountNumber, String country, String languageSpoken) {
        super(divisionName, accountNumber); // Pass shared fields to Division
        this.country = country;
        this.languageSpoken = languageSpoken;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + divisionName + 
                           " | Acct #: " + accountNumber + 
                           " | Country: " + country + 
                           " | Language: " + languageSpoken);
    }
}