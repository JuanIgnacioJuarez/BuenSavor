import java.util.Date;

public class Factura {
    private Date fechaFacturacion;
    private int mpPaymentId;
    private int mpMechantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;

    public Factura() {}

    public Factura(Date fechaFacturacion, int mpPaymentId, int mpMechantOrderId, String mpPreferenceId, String mpPaymentType, FormaPago formaPago, Double totalVenta) {
        this.fechaFacturacion = fechaFacturacion;
        this.mpPaymentId = mpPaymentId;
        this.mpMechantOrderId = mpMechantOrderId;
        this.mpPreferenceId = mpPreferenceId;
        this.mpPaymentType = mpPaymentType;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
    }

    public Date getFechaFacturacion() {return fechaFacturacion;}
    public void setFechaFacturacion(Date fechaFacturacion) {this.fechaFacturacion = fechaFacturacion;}

    public int getMpPaymentId() {return mpPaymentId;}
    public void setMpPaymentId(int mpPaymentId) {this.mpPaymentId = mpPaymentId;}

    public int getMpMechantOrderId() {return mpMechantOrderId;}
    public void setMpMechantOrderId(int mpMechantOrderId) {this.mpMechantOrderId = mpMechantOrderId;}

    public String getMpPreferenceId() {return mpPreferenceId;}
    public void setMpPreferenceId(String mpPreferenceId) {this.mpPreferenceId = mpPreferenceId;}

    public String getMpPaymentType() {return mpPaymentType;}
    public void setMpPaymentType(String mpPaymentType) {this.mpPaymentType = mpPaymentType;}

    public FormaPago getFormaPago() {return formaPago;}
    public void setFormaPago(FormaPago formaPago) {this.formaPago = formaPago;}

    public Double getTotalVenta() {return totalVenta;}
    public void setTotalVenta(Double totalVenta) {this.totalVenta = totalVenta;}
}
