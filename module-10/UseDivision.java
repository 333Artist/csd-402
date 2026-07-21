//5.write an app named useDivision that creates two instances of each of these concrete classes
//a.4 totalt instances

public class UseDivision{
    public static void main(String[] args) {
    DomesticDivision dom1 = new DomesticDivision("East Coast Sales", 1001, "New York");
        DomesticDivision dom2 = new DomesticDivision("Midwest Logistics", 1002, "Illinois");

        InternationalDivision int1 = new InternationalDivision("EMEA Operations", 2001, "United Kingdom", "English");
        InternationalDivision int2 = new InternationalDivision("APAC Tech", 2002, "Japan", "Japanese");

        dom1.display();
        dom2.display();
        int1.display();
        int2.display();
    }
}