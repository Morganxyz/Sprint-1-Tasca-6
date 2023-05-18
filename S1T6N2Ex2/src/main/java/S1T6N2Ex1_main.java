import java.util.Arrays;

public class S1T6N2Ex1_main {


    public static void main(String[] args) {


        GenericMethods2 obj = new GenericMethods2();

        int edatEinstein = 2023-1879;
        int edatLee = 2023-1940;
        int edatParks= 2023-1913;


        obj.generic(Arrays.asList(new Persona2("Rosa", "Parks", 149), "Puntuación", edatParks));
        obj.generic(Arrays.asList(89, "Puntuación", new Persona2("Albert", "Einstein", edatEinstein)));
       obj.generic(Arrays.asList("Puntuación", 82, new Persona2("Bruce", "Lee", edatLee)));

    }
}
