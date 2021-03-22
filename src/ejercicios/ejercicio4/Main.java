package ejercicios.ejercicio4;

public class Main {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(2,5);
        Fraccion f2 = new Fraccion(6,7);
        Fraccion f3 = new Fraccion(2);

        System.out.println("Suma: " + f1.sumar(f2).toString());
        System.out.println("Resta: " + f1.restar(f3).toString());
        System.out.println("Multiplicacion: " + f1.multiplicar(f3).toString());
        System.out.println("Division: " + f1.dividir(f2).toString());
    }
}
