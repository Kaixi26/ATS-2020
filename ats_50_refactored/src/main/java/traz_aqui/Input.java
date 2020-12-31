package traz_aqui;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Input {

    private static final String TEXT_NEWVALUE = "Novo valor: ";

    public static Scanner input = new Scanner(in);

    private Input() {
    }

    /**
     * Método que obtêm o valor de uma string do user com safeguard
     */
    public static String lerString() {
        boolean ok = false;
        String txt = "";
        while (!ok) {
            try {
                txt = input.nextLine();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Texto Invalido");
                out.print(TEXT_NEWVALUE);
                input.nextLine();
            }
        }
        return txt;
    }

    /**
     * Método que obtêm o valor de um int do user com safeguard
     */
    public static int lerInt() {
        boolean ok = false;
        int i = 0;
        while (!ok) {
            try {
                i = Integer.parseInt(input.nextLine());
                ok = true;
            } catch (Exception e) {
                out.println("Inteiro Invalido");
                out.print(TEXT_NEWVALUE);
                input.nextLine();
            }
        }
        return i;
    }

    /**
     * Método que obtêm o valor de um double do user com safeguard
     */
    public static double lerDouble() {
        boolean ok = false;
        double d = 0.0;
        while (!ok) {
            try {
                d = Double.parseDouble(input.nextLine());
                ok = true;
            } catch (Exception e) {
                out.println("Valor real Invalido");
                out.print(TEXT_NEWVALUE);
                input.nextLine();
            }
        }
        return d;
    }
}