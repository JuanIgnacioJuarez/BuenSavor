import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private int cuil;
    private Set<Sucursal> sucursales = new HashSet<>();

    public Empresa() {}

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Empresa(String nombre, String razonSocial, int cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getRazonSocial() {return razonSocial;}
    public void setRazonSocial(String razonSocial) {this.razonSocial = razonSocial;}

    public int getCuil() {return cuil;}
    public void setCuil(int cuil) {this.cuil = cuil;}

    public Set<Sucursal> getSucursales() {return sucursales;}
    public void setSucursales(Set<Sucursal> sucursales) {this.sucursales = sucursales;}

    public void addSucursal(Sucursal s){
        if (s != null){
            sucursales.add(s);
        }
    }

    public void removeSucursal(Sucursal s){
        if (sucursales.contains(s)){
            sucursales.remove(s);
        }
    }
}
