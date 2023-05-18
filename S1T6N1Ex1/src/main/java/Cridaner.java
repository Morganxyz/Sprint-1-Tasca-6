import java.util.LinkedList;

public class Cridaner{

public static void main(String [] args) {


    String nom = "Freddy";
    String cognom = "Krüger";
    String alias = "El Guapo";

    LinkedList <NoGenericMethods> persona = new LinkedList<>();
    NoGenericMethods g0 = new NoGenericMethods(alias,cognom,nom);
    NoGenericMethods g1 = new NoGenericMethods(cognom,nom,alias);
    NoGenericMethods g2 = new NoGenericMethods(nom,cognom, alias);

    persona.add(g0);
    persona.add(g1);
    persona.add(g2);



   for(NoGenericMethods ng : persona){
       System.out.println(ng.toString());
   }



    }
}
