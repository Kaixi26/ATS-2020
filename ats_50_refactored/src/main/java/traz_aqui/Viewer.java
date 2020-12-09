package traz_aqui;

public class Viewer {

    private Viewer() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Método que dá print a uma string
     *
     * @param a String
     */
    public static void prints(String a) {
        System.out.println(a);
    }

    /**
     * Método que dá print a um inteiro
     *
     * @param a Integer
     */
    public static void prints(Integer a) {
        System.out.println(a);
    }

    /**
     * Método que dá print a um double
     *
     * @param a Double
     */
    public static void prints(Double a) {
        System.out.println(a);
    }

    /**
     * Método que dá print a um TrazAqui.topUsers
     *
     * @param top TrazAqui.topUsers
     */
    public static void prints(TopUsers top) {
        System.out.println(top);
    }

}
