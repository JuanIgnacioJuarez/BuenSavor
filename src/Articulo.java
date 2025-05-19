import java.util.ArrayList;

public abstract class Articulo {
    protected String denominacion;
    protected Double precioVenta;
    private ArrayList<Imagen> imagenes;
    private ArrayList<Promocion> promociones;
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

    public ArrayList<Imagen> getImagenes() {return imagenes;}
    public void setImagenes(ArrayList<Imagen> imagenes) {this.imagenes = imagenes;}

    public ArrayList<Promocion> getPromociones() {return promociones;}
    public void setPromociones(ArrayList<Promocion> promociones) {this.promociones = promociones;}

    public UnidadMedida getUnidadMedida() {return unidadMedida;}
    public void setUnidadMedida(UnidadMedida unidadMedida) {this.unidadMedida = unidadMedida;}

    public Categoria getCategoria() {return categoria;}
    public void setCategoria(Categoria categoria) {this.categoria = categoria;}

    public void addImagen(Imagen i){
        if (imagenes == null) imagenes = new ArrayList<>();
        imagenes.add(i);
    }

    public void removeImagen(Imagen i){
        imagenes.remove(i);
    }

    public void addPromocion(Promocion p){
        if (promociones == null) promociones = new ArrayList<>();
        promociones.add(p);
    }

    public void removePromocion(Promocion p){
        promociones.remove(p);
    }
}
