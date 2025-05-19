import java.util.ArrayList;

public class Localidad {
    private String nombre;
    private Provincia provincia;
    private ArrayList<Domicilio> domicilios;

    public Localidad() {}

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
        provincia.addLocalidad(this);
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public Provincia getProvincia() {return provincia;}
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
        provincia.addLocalidad(this);
    }

    public ArrayList<Domicilio> getDomicilios() {return domicilios;}
    public void setDomicilios(ArrayList<Domicilio> domicilios) {this.domicilios = domicilios;}

    public void addDomicilio(Domicilio d){
        if (domicilios == null) domicilios = new ArrayList<>();
        domicilios.add(d);
    }

    public void removeDomicilio(Domicilio d){
        domicilios.remove(d);
    }
}
