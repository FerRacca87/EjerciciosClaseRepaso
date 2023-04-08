package ejerciciosclaserepaso;

//@author Fernando Racca
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;

public class Ejercicio4 {

    public static void main(String[] args) throws IOException {

        Path tablaEquipos = Paths.get("archivos\\equipos.csv");
        Path tablaPartidos = Paths.get("archivos\\partidos.csv");

        ArrayList<Equipo> equipos = new ArrayList<>();
        ArrayList<Partido> partidos = new ArrayList<>();

        //Cargar los equipos a la lista equipos
        for (String linea : Files.readAllLines(tablaEquipos)) {
            Equipo equipo = new Equipo(linea);
            equipos.add(equipo);
        }

        //cargar los partidos a la lista partidos
        for (String linea : Files.readAllLines(tablaPartidos)) {
            if (linea.startsWith("equipo1")) {
            } else {
                //
                String[] datos = linea.split(";");
                Partido partido = new Partido();

                for (Equipo e : equipos) {
                    if (e.getNombre().equals(datos[0])) {
                        partido.setEquipo1(e);
                        partido.setGolesEquipo1(Integer.parseInt(datos[1]));
                    } else if (e.getNombre().equals(datos[2])) {
                        partido.setEquipo2(e);
                        partido.setGolesEquipo2(Integer.parseInt(datos[3]));
                    }
                }
                //Asignar goles y puntos
                partido.getEquipo1().sumarGolesAFavor(partido.getGolesEquipo1());
                partido.getEquipo1().sumarGolesEnContra(partido.getGolesEquipo2());
                partido.getEquipo2().sumarGolesAFavor(partido.getGolesEquipo2());
                partido.getEquipo2().sumarGolesEnContra(partido.getGolesEquipo1());

                partido.getEquipo1().sumarPuntaje(partido.calcularPuntosEquipo1());
                partido.getEquipo2().sumarPuntaje(partido.calcularPuntosEquipo2());
                partidos.add(partido);
            }
        }
        //Ordenar
        equipos.sort(Comparator.comparing(Equipo::getPuntaje).thenComparing(Equipo::getGolesAFavor).reversed());

        //Imprimir equipos
        for (Equipo e : equipos) {
            System.out.println(e.getNombre() + ": " + e.getPuntaje());
        }
    }
}
