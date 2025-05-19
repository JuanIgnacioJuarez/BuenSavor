public class DetallePedido {
    private int cantidad;
    private Double subTotal;
    private Pedido pedido;
    private Articulo articulo;

    public DetallePedido() {}

    public DetallePedido(int cantidad, Double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public Double getSubTotal() {return subTotal;}
    public void setSubTotal(Double subTotal) {this.subTotal = subTotal;}

    public Pedido getPedido() {return pedido;}
    public void setPedido(Pedido pedido) {this.pedido = pedido;}

    public Articulo getArticulo() {return articulo;}
    public void setArticulo(Articulo articulo) {this.articulo = articulo;}
}
