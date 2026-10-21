import java.sql.SQLOutput;
import java.util.Scanner
        ;
public class dia2VerificadorChivas {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Verificador de goles!!\n ¿Cuántos goles anotaron las chivas ayer?");
        Scanner sc = new Scanner(System.in);
        int golesChivas = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Cuántos goles anotó el equipo rival?");
        int golesRival = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Cuántos de esos goles fueron del Piojo Alvarado?");
        int golesPiojo = sc.nextInt();
        sc.nextLine();

        boolean ganoChivas = golesChivas > golesRival;
        boolean fueGoleada = ganoChivas == true && golesChivas >= 3;
        boolean huboEmpate = ganoChivas == false && golesChivas == golesChivas;
        boolean piojoGoat = golesPiojo > 0 && ganoChivas == true;

        System.out.println("¿Ganaron las Chivas?: " + ganoChivas);
        System.out.println("¿Fue goleada?: " + fueGoleada);
        System.out.println("¿Quedaron empatados?: " + huboEmpate);
        System.out.println("¿El piojo Alvarado es GOAT?: " + piojoGoat);

        sc.close();

    }
}
