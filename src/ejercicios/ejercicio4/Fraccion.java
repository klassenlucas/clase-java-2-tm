package ejercicios.ejercicio4;

public class Fraccion {
    int numerador;

    int denominador;
    public Fraccion() {

    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion f) {
        int numResult =  this.numerador * f.denominador + this.denominador * f.numerador;
        int denResult = this.denominador * f.denominador;
        return new Fraccion(numResult, denResult);
    }

    public Fraccion restar(Fraccion f) {
        int numResult =  this.numerador * f.denominador - this.denominador * f.numerador;
        int denResult = this.denominador * f.denominador;
        return new Fraccion(numResult,denResult);
    }

    public Fraccion dividir(Fraccion f) {
        int numResult =  this.numerador * f.denominador;
        int denResult = this.denominador * f.numerador;
        return new Fraccion(numResult,denResult);
    }

    public Fraccion multiplicar(Fraccion f) {
        int numResult =  this.numerador * f.numerador;
        int denResult = this.denominador * f.denominador;
        return new Fraccion(numResult,denResult);
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

}
