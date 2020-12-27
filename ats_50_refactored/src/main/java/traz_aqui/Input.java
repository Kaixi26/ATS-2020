package traz_aqui;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Input {

    private static final String TEXT_NEWVALUE = "Novo valor: ";

    private Input() {
    }

    /**
     * Método que obtêm o valor de uma string do user com safeguard
     */
    public static String lerString() {
        Scanner input = new Scanner(in);
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
        Scanner input = new Scanner(in);
        boolean ok = false;
        int i = 0;
        while (!ok) {
            try {
                i = input.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
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
        Scanner input = new Scanner(in);
        boolean ok = false;
        double d = 0.0;
        while (!ok) {
            try {
                d = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Valor real Invalido");
                out.print(TEXT_NEWVALUE);
                input.nextLine();
            }
        }
        return d;
    }
}