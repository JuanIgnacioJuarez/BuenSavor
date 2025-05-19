import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
    private Set<DetallePedido> detallesPedido = new HashSet<>();

    public Pedido() {}

    public Pedido(Date horaEstimadaFinalizacion, Double total, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, Date fechaPedido) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
    }

    public Pedido(Date horaEstimadaFinalizacion, Double total, Double totalCosto, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, Date fechaPedido, Sucursal sucursal, Domicilio domicilio) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
        this.sucursal = sucursal;
        this.domicilio = domicilio;
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
    }

    public Set<DetallePedido> getDetallesPedido() {return detallesPedido;}
    public void setDetallesPedido(Set<DetallePedido> detallesPedido) {this.detallesPedido = detallesPedido;}

    public void addDetallePedido(DetallePedido d){
        if (d != null){
            detallesPedido.add(d);
            //Cada vez que agrego algo calcular total
        }
    }

    public void removeDetallePedido(DetallePedido d){
        if (detallesPedido.contains(d)){
            detallesPedido.remove(d);
            //Recalcular total eliminando el detalle
        }
    }
}
