package procedimiento;
public class EjercicioMain {

    // Definimos una función que suma dos números
    public static int sumar(int a, int b) {
        return a + b; // devuelve la suma
    }

    public static void main(String[] args) {
        // Llamamos a la función y mostramos el resultado
        int resultado = sumar(1, 2);
        System.out.println("La suma es: " + resultado);
    }
}