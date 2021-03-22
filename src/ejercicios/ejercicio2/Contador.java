package ejercicios.ejercicio2;

public class Contador {

    private int valor;

    public Contador() {
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador(Contador c) {
        this.valor = c.valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void incremento() {
        this.valor++;
    }

    public void decremento() {
        this.valor--;
    }
}
