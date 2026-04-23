package procedimiento;

public class EjemploFunciones {
    public static double calcularArea(double base, double altura) {
        return (base * altura) / 2; // Fórmula: (base × altura) / 2
    }

    public static void main(String[] args) {
        double resultado = calcularArea(10, 5);
        System.out.println("El área del triángulo es: " + resultado);
    }
}