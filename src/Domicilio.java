import java.util.ArrayList;

public class Domicilio {
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Cliente> clientes;

    public Domicilio() {}

    public Domicilio(String calle, int numero, int cp, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
        localidad.addDomicilio(this);
    }

    public String getCalle() {return calle;}
    public void setCalle(String calle) {this.calle = calle;}

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    public int getCp() {return cp;}
    public void setCp(int cp) {this.cp = cp;}

    public Localidad getLocalidad() {return localidad;}
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
        localidad.addDomicilio(this);
    }

    public ArrayList<Pedido> getPedidos() {return pedidos;}
    public void setPedidos(ArrayList<Pedido> pedidos) {this.pedidos = pedidos;}

    public ArrayList<Cliente> getClientes() {return clientes;}
    public void setClientes(ArrayList<Cliente> clientes) {this.clientes = clientes;}

    public void addPedido(Pedido p){
        if (pedidos == null) pedidos = new ArrayList<>();
        pedidos.add(p);
        p.setDomicilio(this);
    }

    public void removePedido(Pedido p){
        pedidos.remove(p);
    }

    public void addCliente(Cliente c){
        if (clientes == null) clientes = new ArrayList<>();
        clientes.add(c);
        c.addDomicilio(this);
    }

    public void removeCliente(Cliente c){
        clientes.remove(c);
        c.removeDomicilio(this);
    }
}
