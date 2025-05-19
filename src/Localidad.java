public class Localidad {
    private String nombre;
    private Provincia provincia;

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
}
