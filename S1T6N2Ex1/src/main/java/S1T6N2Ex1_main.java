public class S1T6N2Ex1_main {


    public static void main(String[] args) {


        GenericMethods2 obj = new GenericMethods2();


        obj.generic(new Persona2("Rosa", "Parks", 149), "Puntuación", 85);
      // obj.generic(89, "Puntuación", new Persona2("Albert", "Einstein", 149)); // Error porque en el orden le toca un tipo Int
      // obj.generic("Puntuación", 82, new Persona2("Bruce", "Lee", 85));//Idem


        // Por tanto, deberíamos introducir un int :
         obj.generic(89, "Puntuación", 666);
         obj.generic("Puntuación", 82, 666);
    }
}
