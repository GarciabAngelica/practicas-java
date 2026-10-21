import java.util.Scanner;
public class Dia2VerificadorChivas {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Verificador de goles!!\n ¿Cuántos goles anotaron las chivas ayer?");
        Scanner sc = new Scanner(System.in);
        int golesChivas = sc.nextInt();
        System.out.println("¿Cuántos goles anotó el equipo rival?");
        int golesRival = sc.nextInt();
        System.out.println("¿Cuántos de esos goles fueron del Piojo Alvarado?");
        int golesPiojo = sc.nextInt();

        boolean ganoChivas = golesChivas > golesRival;
        boolean fueGoleada = ganoChivas && golesChivas >= 3;
        boolean huboEmpate = golesChivas == golesRival;
        boolean piojoGoat = golesPiojo > 0 && ganoChivas;

        System.out.println("¿Ganaron las Chivas?: " + ganoChivas);
        System.out.println("¿Fue goleada?: " + fueGoleada);
        System.out.println("¿Quedaron empatados?: " + huboEmpate);
        System.out.println("¿El piojo Alvarado es GOAT?: " + piojoGoat);

        sc.close();

    }
}
