import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Promocion {
    private String denominacion;
    private Date fechaDesde;
    private Date fechaHasta;
    private Date horaDesde;
    private Date horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<ImagenComida> imagenes = new HashSet<>();
    private Set<Articulo> articulos = new HashSet<>();

    public Promocion() {}

    public Promocion(String denominacion, Date fechaDesde, Date fechaHasta, Date horaDesde, Date horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
    }

    public String getDenominacion() {return denominacion;}
    public void setDenominacion(String denominacion) {this.denominacion = denominacion;}

    public Date getFechaDesde() {return fechaDesde;}
    public void setFechaDesde(Date fechaDesde) {this.fechaDesde = fechaDesde;}

    public Date getFechaHasta() {return fechaHasta;}
    public void setFechaHasta(Date fechaHasta) {this.fechaHasta = fechaHasta;}

    public Date getHoraDesde() {return horaDesde;}
    public void setHoraDesde(Date horaDesde) {this.horaDesde = horaDesde;}

    public Date getHoraHasta() {return horaHasta;}
    public void setHoraHasta(Date horaHasta) {this.horaHasta = horaHasta;}

    public String getDescripcionDescuento() {return descripcionDescuento;}
    public void setDescripcionDescuento(String descripcionDescuento) {this.descripcionDescuento = descripcionDescuento;}

    public Double getPrecioPromocional() {return precioPromocional;}
    public void setPrecioPromocional(Double precioPromocional) {this.precioPromocional = precioPromocional;}

    public TipoPromocion getTipoPromocion() {return tipoPromocion;}
    public void setTipoPromocion(TipoPromocion tipoPromocion) {this.tipoPromocion = tipoPromocion;}

    public Set<ImagenComida> getImagenes() {return imagenes;}
    public void setImagenes(Set<ImagenComida> imagenes) {this.imagenes = imagenes;}

    public Set<Articulo> getArticulos() {return articulos;}
    public void setArticulos(Set<Articulo> articulos) {this.articulos = articulos;}

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
