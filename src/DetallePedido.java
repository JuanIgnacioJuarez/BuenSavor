public class DetallePedido {
    private int cantidad;
    private Double subTotal;
    private Articulo articulo;
    private Promocion promocion;

    public DetallePedido() {
    }

    public DetallePedido(int cantidad, Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
        this.promocion = null;
        //calcularSubtotal();
    }

    public DetallePedido(int cantidad, Promocion promocion) {
        this.cantidad = cantidad;
        this.promocion = promocion;
        this.articulo = null;
        //calcularSubtotal();
    }

    //public void calcularSubtotal(){
    //  seteo el subTotal al final del metodo.
    //}

    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public Double getSubTotal() {return subTotal;}
    public void setSubTotal(Double subTotal) {this.subTotal = subTotal;}

    public Articulo getArticulo() {return articulo;}
    public void setArticulo(Articulo articulo) {this.articulo = articulo;}

    public Promocion getPromocion() {return promocion;}
    public void setPromocion(Promocion promocion) {this.promocion = promocion;}
}
