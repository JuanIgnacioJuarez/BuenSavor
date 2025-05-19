import java.util.HashSet;
import java.util.Set;

public abstract class Articulo {
    protected String denominacion;
    protected Double precioVenta;
    private Set<ImagenComida> imagenes = new HashSet<>();
    private Set<Promocion> promociones = new HashSet<>();
    private UnidadMedida unidadMedida;
    private Categoria categoria;

    public Articulo(String denominacion, Double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public String getDenominacion() {return denominacion;}
    public void setDenominacion(String denominacion) {this.denominacion = denominacion;}

    public Double getPrecioVenta() {return precioVenta;}
    public void setPrecioVenta(Double precioVenta) {this.precioVenta = precioVenta;}

    public Set<ImagenComida> getImagenes() {return imagenes;}
    public void setImagenes(Set<ImagenComida> imagenes) {this.imagenes = imagenes;}

    public Set<Promocion> getPromociones() {return promociones;}
    public void setPromociones(Set<Promocion> promociones) {this.promociones = promociones;}

    public UnidadMedida getUnidadMedida() {return unidadMedida;}
    public void setUnidadMedida(UnidadMedida unidadMedida) {this.unidadMedida = unidadMedida;}

    public Categoria getCategoria() {return categoria;}
    public void setCategoria(Categoria categoria) {this.categoria = categoria;}

    public void addImagen(ImagenComida i){
        if (i != null){
            imagenes.add(i);
        }
    }

    public void removeImagen(ImagenComida i){
        if (imagenes.contains(i)){
            imagenes.remove(i);
        }
    }

    public void addPromocion(Promocion p){
        if (p != null){
            promociones.add(p);
        }
    }

    public void removePromocion(Promocion p){
        if (promociones.contains(p)){
            promociones.remove(p);
        }
    }
}
