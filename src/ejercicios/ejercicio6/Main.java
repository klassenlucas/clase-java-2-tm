package ejercicios.ejercicio6;

public class Main {
    public static void main(String[] args) {
        System.out.println("rpad: " + StringUtil.rpad("5",3,'0'));
        System.out.println(StringUtil.ltrim("       Prueba de ltrim   "));
        System.out.println(StringUtil.rtrim("    Prueba de rtrim   "));
        System.out.println(StringUtil.trim("    Prueba de trim   "));
        System.out.println("indexOfN: " + StringUtil.indexfOfN("John|Paul|George|Ringo",'|',2));
    }
}
