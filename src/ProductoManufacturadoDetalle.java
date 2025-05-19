public class ProductoManufacturadoDetalle {
    private int cantidad;
    private ArticuloInsumo articuloInsumo;

    public ProductoManufacturadoDetalle() {}

    public ProductoManufacturadoDetalle(int cantidad, ArticuloInsumo articuloInsumo) {
        this.cantidad = cantidad;
        this.articuloInsumo = articuloInsumo;
    }

    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public ArticuloInsumo getArticuloInsumo() {return articuloInsumo;}
    public void setArticuloInsumo(ArticuloInsumo articuloInsumo) {this.articuloInsumo = articuloInsumo;}
}
