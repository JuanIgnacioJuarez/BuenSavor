import java.util.ArrayList;
import java.util.Date;

public class Promocion {
    private String denominacion;
    private Date fechaDesde;
    private Date fechaHasta;
    private Date horaDesde;
    private Date horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private ArrayList<Imagen> imagenes;
    private ArrayList<Articulo> articulos;

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

    public ArrayList<Imagen> getImagenes() {return imagenes;}
    public void setImagenes(ArrayList<Imagen> imagenes) {this.imagenes = imagenes;}

    public ArrayList<Articulo> getArticulos() {return articulos;}
    public void setArticulos(ArrayList<Articulo> articulos) {this.articulos = articulos;}

    public void addImagen(Imagen i){
        if (imagenes == null) imagenes = new ArrayList<>();
        imagenes.add(i);
    }

    public void removeImagen(Imagen i){
        imagenes.remove(i);
    }

    public void addArticulo(Articulo a){
        if (articulos == null) articulos = new ArrayList<>();
        articulos.add(a);
        a.addPromocion(this);
    }

    public void removeArticulo(Articulo a){
        articulos.remove(a);
        a.removePromocion(this);
    }
}
