public class GenericMethods <T> {


    private T comodin;
    private T joker;
    private T bufon;

    public GenericMethods() {

    }

    public <T> void generic(T comodin, T bufon, T joker) {

        System.out.println(comodin + "  " + bufon + "  " + joker);
    }

}




