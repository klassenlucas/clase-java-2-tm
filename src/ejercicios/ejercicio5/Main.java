package ejercicios.ejercicio5;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(2021,03,22);
        System.out.println(fecha.toString());
        System.out.println(fecha.esCorrecta());

        fecha.agregarDia();
        System.out.println(fecha.toString());
        System.out.println(fecha.esCorrecta());
    }
}
