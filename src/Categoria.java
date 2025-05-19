import java.util.ArrayList;

public class Categoria {
    private String denominacion;
    private Categoria categoriaPadre;
    private ArrayList<Categoria> subCategorias;
    private ArrayList<Sucursal> sucursales;

    public String getDenominacion() {return denominacion;}
    public void setDenominacion(String denominacion) {this.denominacion = denominacion;}

    public Categoria getCategoriaPadre() {return categoriaPadre;}
    public void setCategoriaPadre(Categoria categoriaPadre) {this.categoriaPadre = categoriaPadre;}

    public ArrayList<Categoria> getSubCategorias() {return subCategorias;}
    public void setSubCategorias(ArrayList<Categoria> subCategorias) {this.subCategorias = subCategorias;}

    public ArrayList<Sucursal> getSucursales() {return sucursales;}
    public void setSucursales(ArrayList<Sucursal> sucursales) {this.sucursales = sucursales;}

    public void addSubCategoria(Categoria c){
        if (subCategorias == null) subCategorias = new ArrayList<>();
        subCategorias.add(c);
        c.setCategoriaPadre(this);
    }

    public void removeSubCategoria(Categoria c){
        subCategorias.remove(c);
        c.removeSubCategoria(null);
    }

    public void addSucursal(Sucursal s){
        if (sucursales == null) sucursales = new ArrayList<>();
        sucursales.add(s);
    }

    public void removeSucursal(Sucursal s){
        sucursales.remove(s);
    }
}
