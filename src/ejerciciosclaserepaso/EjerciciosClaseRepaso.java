package ejerciciosclaserepaso;

//@author Fernando Racca
import java.util.Scanner;

public class EjerciciosClaseRepaso {

    public static void main(String[] args) {
        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio2Scanner();
        Ejercicio3();
    }

    private static void Ejercicio1() {
        int ganados = 5;
        int empatados = 6;
        int puntosTotales;

        puntosTotales = (ganados * 3) + empatados;

        System.out.println("El equipo sumo " + puntosTotales + " puntos");
    }

    private static void Ejercicio2() {
        int golesEquipo1 = 2;
        int golesEquipo2 = 3;
        int equipoGanador = 0;
        boolean empate = false;

        if (golesEquipo1 > golesEquipo2) {
            equipoGanador = 1;
        } else if (golesEquipo2 > golesEquipo1) {
            equipoGanador = 2;
        } else {
            empate = true;
        }

        if (empate) {
            System.out.println("Es un empate entre ambos equipos");
        } else {
            System.out.println("Gano el equipo " + equipoGanador);
        }
    }

    private static void Ejercicio2Scanner() {

        Scanner in = new Scanner(System.in);

        int golesEquipo1, golesEquipo2;
        int equipoGanador = 0;
        boolean empate = false;

        System.out.print("Ingrese los goles del equipo 1: ");
        golesEquipo1 = in.nextInt();
        System.out.print("Ingrese los goles del equipo 2: ");
        golesEquipo2 = in.nextInt();

        if (golesEquipo1 > golesEquipo2) {
            equipoGanador = 1;
        } else if (golesEquipo2 > golesEquipo1) {
            equipoGanador = 2;
        } else {
            empate = true;
        }

        if (empate) {
            System.out.println("Es un empate entre ambos equipos");
        } else {
            System.out.println("Gano el equipo " + equipoGanador);
        }
    }

    private static void Ejercicio3() {

        char[] resultados = new char[]{'G', 'E', 'P', 'G', 'G'};
        int puntos = 0;

        for (char r : resultados) {
            if (r == 'G') {
                puntos += 3;
            } else if (r == 'E') {
                puntos += 1;
            }
        }
        System.out.println("El puntaje del equipo es de " + puntos + " puntos");
    }

}
