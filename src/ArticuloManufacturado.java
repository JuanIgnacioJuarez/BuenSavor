import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ProductoManufacturadoDetalle> pmd = new HashSet<>();

    public ArticuloManufacturado(String denominacion, Double precioVenta) {
        super(denominacion, precioVenta);
    }

    public ArticuloManufacturado(String denominacion, Double precioVenta, String descripcion) {
        super(denominacion, precioVenta);
        this.descripcion = descripcion;
    }

    public ArticuloManufacturado(String denominacion, Double precioVenta, String descripcion, int tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public int getTiempoEstimadoMinutos() {return tiempoEstimadoMinutos;}
    public void setTiempoEstimadoMinutos(int tiempoEstimadoMinutos) {this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;}

    public String getPreparacion() {return preparacion;}
    public void setPreparacion(String preparacion) {this.preparacion = preparacion;}

    public Set<ProductoManufacturadoDetalle> getPmd() {return pmd;}
    public void stePmd(Set<ProductoManufacturadoDetalle> pmd) {this.pmd = pmd;}

    public void addPmd(ProductoManufacturadoDetalle p){
        if (p != null){
            pmd.add(p);
        }
    }

    public void removePmd(ProductoManufacturadoDetalle p){
        if (pmd.contains(p)){
            pmd.remove(p);
        }
    }


}
