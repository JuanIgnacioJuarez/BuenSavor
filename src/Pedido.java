import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Date horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private Date fechaPedido;
    private Sucursal sucursal;
    private Domicilio domicilio;
    private Factura factura;
    private Cliente cliente;
    private ArrayList<DetallePedido> detallesPedido;

    public Pedido() {}

    public Pedido(Date horaEstimadaFinalizacion, Double total, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, Date fechaPedido) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
    }

    public Date getHoraEstimadaFinalizacion() {return horaEstimadaFinalizacion;}
    public void setHoraEstimadaFinalizacion(Date horaEstimadaFinalizacion) {this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;}

    public Double getTotal() {return total;}
    public void setTotal(Double total) {this.total = total;}

    public Double getTotalCosto() {return totalCosto;}
    public void setTotalCosto(Double totalCosto) {this.totalCosto = totalCosto;}

    public Estado getEstado() {return estado;}
    public void setEstado(Estado estado) {this.estado = estado;}

    public TipoEnvio getTipoEnvio() {return tipoEnvio;}
    public void setTipoEnvio(TipoEnvio tipoEnvio) {this.tipoEnvio = tipoEnvio;}

    public FormaPago getFormaPago() {return formaPago;}
    public void setFormaPago(FormaPago formaPago) {this.formaPago = formaPago;}

    public Date getFechaPedido() {return fechaPedido;}
    public void setFechaPedido(Date fechaPedido) {this.fechaPedido = fechaPedido;}

    public Sucursal getSucursal() {return sucursal;}
    public void setSucursal(Sucursal sucursal) {this.sucursal = sucursal;}

    public Domicilio getDomicilio() {return domicilio;}
    public void setDomicilio(Domicilio domicilio) {this.domicilio = domicilio;}

    public Factura getFactura() {return factura;}
    public void setFactura(Factura factura) {
        this.factura = factura;
        factura.setPedido(this);
    }

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public void addDetallePedido(DetallePedido d){
        if (detallesPedido == null) detallesPedido = new ArrayList<>();
        detallesPedido.add(d);
        d.setPedido(this);
    }

    public void removeDetallePedido(DetallePedido d){
        detallesPedido.remove(d);
    }


}
