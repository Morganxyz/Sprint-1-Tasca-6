import java.util.Scanner;

public class S1T6N1Ex2_Main {


    public static void main(String[] args){


        GenericMethods obj = new GenericMethods();


        obj.generic(new Persona("Rosa","Parks",149), "Puntuación", 85);
        obj.generic(89, "Puntuación", new Persona("Albert","Einstein",149));
        obj.generic("Puntuación", 82, new Persona("Bruce","Lee",85));


    }
}
