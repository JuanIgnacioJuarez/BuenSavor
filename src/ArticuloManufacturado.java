import java.util.ArrayList;

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private ArrayList<ProductoManufacturadoDetalle> pmd;

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

    public ArrayList<ProductoManufacturadoDetalle> getPmd() {return pmd;}
    public void stePmd(ArrayList<ProductoManufacturadoDetalle> pmd) {this.pmd = pmd;}

    public void addPmd(ProductoManufacturadoDetalle p){
        if (pmd == null) pmd = new ArrayList<>();
        pmd.add(p);
    }

    public void removePmd(ProductoManufacturadoDetalle p){
        pmd.remove(p);
    }


}
