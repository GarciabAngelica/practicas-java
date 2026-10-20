import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DiaCalculadoraInsumos {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de insumos\n ¿Qué postre quieres preparar?");
        Scanner sc = new Scanner(System.in);
        String postre = sc.nextLine();

        System.out.println("Muy bien hoy prepararemos: " + postre + "\n ¿Cuál es tu primer ingrediente?");
        String ingrediente1 = sc.nextLine();
        System.out.println("¿Cuántos gramos necesitas de " + ingrediente1 + "?");
        double gramosIngrediente1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("¿Cuál es tu segundo ingrediente?");
        String ingrediente2 = sc.nextLine();
        System.out.println("¿Cuántos gramos necesitas de " + ingrediente2 + "?");
        double gramosIngrediente2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("¿Cuál es tu tercer ingrediente?");
        String ingrediente3 = sc.nextLine();
        System.out.println("¿Cuántos gramos necesitas de " + ingrediente3 + "?");
        double gramosIngrediente3 = sc.nextDouble();

        double pesoTotal = gramosIngrediente1 + gramosIngrediente2 + gramosIngrediente3;

        double costoTotal = pesoTotal * 0.15;

        System.out.println("Para preparar " + postre + " con un peso de: " + pesoTotal + " gramos.\n Y el costo será de: " + costoTotal);

        sc.close();
    }

}

