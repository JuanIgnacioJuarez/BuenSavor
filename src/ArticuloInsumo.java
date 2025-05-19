public class ArticuloInsumo extends Articulo{
    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, Double precioVenta) {
        super(denominacion, precioVenta);
    }

    public ArticuloInsumo(String denominacion, Double precioVenta, double precioCompra, int stockActual, int stockMaximo, boolean esParaElaborar) {
        super(denominacion, precioVenta);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    public double getPrecioCompra() {return precioCompra;}
    public void setPrecioCompra(double precioCompra) {this.precioCompra = precioCompra;}

    public int getStockActual() {return stockActual;}
    public void setStockActual(int stockActual) {this.stockActual = stockActual;}

    public int getStockMaximo() {return stockMaximo;}
    public void setStockMaximo(int stockMaximo) {this.stockMaximo = stockMaximo;}

    public boolean isEsParaElaborar() {return esParaElaborar;}
    public void setEsParaElaborar(boolean esParaElaborar) {this.esParaElaborar = esParaElaborar;}
}
