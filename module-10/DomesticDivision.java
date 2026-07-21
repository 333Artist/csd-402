//3.create two subclasses named InternationalDivision and Domestic Division





public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state){
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName + 
                            " | Acct #: " + accountNumber +
                            " | State: " + state);
    }
}