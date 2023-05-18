import java.util.LinkedList;
import java.util.List;

public class  GenericMethods2 <T> {
    
    List<T> llistaT = new LinkedList<>();

    public GenericMethods2() {

    }
    public <T> void generic(List<T> llistaT) {

        System.out.println(llistaT.toString());
    }

}
