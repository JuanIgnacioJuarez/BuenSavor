import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private int cuil;
    private ArrayList<Sucursal> sucursales;

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

    public ArrayList<Sucursal> getSucursales() {return sucursales;}
    public void setSucursales(ArrayList<Sucursal> sucursales) {this.sucursales = sucursales;}

    public void addSucursal(Sucursal s){
        if (sucursales == null) sucursales = new ArrayList<>();
        sucursales.add(s);
    }

    public void removeSucursal(Sucursal s){
        sucursales.remove(s);
    }
}
