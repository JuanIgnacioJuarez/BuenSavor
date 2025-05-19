import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Categoria {
    private String denominacion;
    private Categoria categoriaPadre;
    private Set<Categoria> subCategorias = new HashSet<>();
    private Set<Articulo> articulos = new HashSet<>();

    public String getDenominacion() {return denominacion;}
    public void setDenominacion(String denominacion) {this.denominacion = denominacion;}

    public Categoria getCategoriaPadre() {return categoriaPadre;}
    public void setCategoriaPadre(Categoria categoriaPadre) {this.categoriaPadre = categoriaPadre;}

    public Set<Categoria> getSubCategorias() {return subCategorias;}
    public void setSubCategorias(Set<Categoria> subCategorias) {this.subCategorias = subCategorias;}

    public Set<Articulo> getArticulos() {return articulos;}
    public void setArticulos(Set<Articulo> articulos) {this.articulos = articulos;}

    public void addSubCategoria(Categoria c){
        if (c != null){
            subCategorias.add(c);
            c.setCategoriaPadre(this);
        }
    }

    public void removeSubCategoria(Categoria c){
        if (subCategorias.contains(c)){
            c.removeSubCategoria(null);
        }
    }

    public void addArticulo(Articulo a){
        if (a != null){
            articulos.add(a);
        }
    }

    public void removeArticulo(Articulo a){
        if (articulos.contains(a)){
            articulos.remove(a);
        }
    }
}
