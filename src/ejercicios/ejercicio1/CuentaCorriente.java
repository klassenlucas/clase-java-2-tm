package ejercicios.ejercicio1;

public class CuentaCorriente {
    private double saldo;
    private int numeroCuenta;
    private String nombre;
    private String apellido;

    public CuentaCorriente() {

    }

    public CuentaCorriente(int numeroCuenta, String nombre, String apellido) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public CuentaCorriente(CuentaCorriente cc) {
        this.saldo = cc.getSaldo();
        this.numeroCuenta = cc.getNumeroCuenta();
        this.nombre = cc.getNombre();
        this.apellido = cc.getApellido();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void ingreso(double monto) {
        this.saldo += monto;
    }

    public void egreso(double monto) {
        this.saldo -= monto;
    }

    public void reintegro(double monto) {
        this.ingreso(monto);
    }

    public void transferencia(CuentaCorriente cuentaDestino, double monto) {
        this.egreso(monto);
        cuentaDestino.ingreso(monto);
    }


}
