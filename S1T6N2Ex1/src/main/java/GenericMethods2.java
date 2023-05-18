public class  GenericMethods2 <T> {


    private T comodin;
    private T joker;
    private T bufon;

    public GenericMethods2() {

    }

    public <T, U, Integer> void generic(T comodin, U bufon, int joker) {

        System.out.println(comodin + "  " + bufon + "  " + joker);
    }

}
