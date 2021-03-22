package ejercicios.ejercicio5;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
    private GregorianCalendar fecha;

    public Fecha() {
        System.out.println();
    }

    public Fecha(int anio, int mes, int dia) {
        this.fecha = new GregorianCalendar(anio,mes,dia);
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public int getDia() {
        return this.fecha.get(Calendar.DATE);
    }

    public int getMes() {
        return this.fecha.get(Calendar.MONTH);
    }

    public int getAnio() {
        return this.fecha.get(Calendar.YEAR);
    }

    public boolean esCorrecta() {
        return this.anioCorrecto() && this.mesCorrecto() && this.diaCorrecto();
    }

    private boolean anioCorrecto() {
        return this.getAnio() == Calendar.getInstance().get(Calendar.YEAR);
    }

    private boolean mesCorrecto() {
        return this.getMes() == Calendar.getInstance().get(Calendar.MONTH)+1;
    }

    private boolean diaCorrecto() {
        return this.getDia() == Calendar.getInstance().get(Calendar.DATE);
    }

    @Override
    public String toString() {
        String[] meses = new DateFormatSymbols().getMonths();
        String mes = meses[this.getMes()-1];
        return this.getDia() + " de " + mes + " de " + this.getAnio();
    }

    public void agregarDia() {
        this.fecha.add(Calendar.DATE,1);
    }

}
