
import java.util.Optional;

public class optional{

    public static void main(String[] args) {
        var optionalString =  Optional.ofNullable("Optional");
        var result  = optionalString.orElseThrow(); //similar to get if value not null
        System.out.println(result); //print Optional

        //String nullString = null;
        //var optionalString =  Optional.ofNullable(nullString);
        //var result  = optionalString.orElseThrow();
        //System.out.println(result); //throw exception
        
    }


}

