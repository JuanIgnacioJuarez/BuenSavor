import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private Pais pais;
    private ArrayList<Localidad> localidades;

    public Provincia() {}

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        pais.addProvincia(this);
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public Pais getPais() {return pais;}
    public void setPais(Pais pais) {
        this.pais = pais;
        pais.addProvincia(this);
    }

    public ArrayList<Localidad> getLocalidades() {return localidades;}
    public void setLocalidades(ArrayList<Localidad> localidades) {this.localidades = localidades;}

    public void addLocalidad(Localidad l){
        if (localidades == null) localidades = new ArrayList<>();
        localidades.add(l);
    }

    public void removeLocalidad(Localidad l){
        localidades.remove(l);
    }
}
