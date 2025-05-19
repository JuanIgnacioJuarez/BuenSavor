import javax.sound.sampled.Port;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais() {}

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public ArrayList<Provincia> getProvincias() {return provincias;}
    public void setProvincias(ArrayList<Provincia> provincias) {this.provincias = provincias;}

    public void addProvincia(Provincia p){
        if (provincias == null) provincias = new ArrayList<>();
        provincias.add(p);
    }

    public void removeProvincia(Provincia p){
        provincias.remove(p);
    }
}
