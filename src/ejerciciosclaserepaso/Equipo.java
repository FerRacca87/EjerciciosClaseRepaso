package ejerciciosclaserepaso;

//@author Fernando Racca
public class Equipo {

    private String nombre;
    private int puntaje = 0;
    private int golesAFavor = 0;
    private int golesEnContra = 0;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }
    
    

    public void sumarPuntaje(int puntaje) {
        this.puntaje += puntaje;
    }

    public void sumarGolesAFavor(int golesAFavor) {
        this.golesAFavor += golesAFavor;
    }

    public void sumarGolesEnContra(int golesEnContra) {
        this.golesEnContra += golesEnContra;
    }

}
