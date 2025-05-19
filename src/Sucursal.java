import java.util.ArrayList;
import java.util.Date;

public class Sucursal {
    private String nombre;
    private Date horarioApertura;
    private Date horarioCierre;
    private Domicilio domicilio;
    private ArrayList<Categoria> categorias;
    private ArrayList<Promocion> promociones;
    private ArrayList<Pedido> pedidos;

    public Sucursal() {}

    public Sucursal(String nombre) {
        this.nombre = nombre;
    }

    public Sucursal(String nombre, Domicilio domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public Sucursal(String nombre, Date horarioApertura, Date horarioCierre, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public Date getHorarioApertura() {return horarioApertura;}
    public void setHorarioApertura(Date horarioApertura) {this.horarioApertura = horarioApertura;}

    public Date getHorarioCierre() {return horarioCierre;}
    public void setHorarioCierre(Date horarioCierre) {this.horarioCierre = horarioCierre;}

    public Domicilio getDomicilio() {return domicilio;}
    public void setDomicilio(Domicilio domicilio) {this.domicilio = domicilio;}

    public ArrayList<Categoria> getCategorias() {return categorias;}
    public void setCategorias(ArrayList<Categoria> categorias) {this.categorias = categorias;}

    public ArrayList<Promocion> getPromociones() {return promociones;}
    public void setPromociones(ArrayList<Promocion> promociones) {this.promociones = promociones;}

    public ArrayList<Pedido> getPedidos() {return pedidos;}
    public void setPedidos(ArrayList<Pedido> pedidos) {this.pedidos = pedidos;}

    public void addCategoria(Categoria c){
        if (categorias == null) categorias = new ArrayList<>();
        categorias.add(c);
        c.addSucursal(this);
    }

    public void removeCategoria(Categoria c){
        categorias.remove(c);
        c.removeSucursal(this);
    }

    public void addPromocion(Promocion p){
        if (promociones == null) promociones = new ArrayList<>();
        promociones.add(p);
        p.addSucursal(this);
    }

    public void removePromocion(Promocion p){
        promociones.remove(p);
        p.removeSucursal(this);
    }

    public void addPedido(Pedido p){
        if (pedidos == null) pedidos = new ArrayList<>();
        pedidos.add(p);
        p.setSucursal(this);
    }

    public void removePedido(Pedido p){
        pedidos.remove(p);
    }
}
