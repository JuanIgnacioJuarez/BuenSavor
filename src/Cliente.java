import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private Date fechaNacimiento;
    private ArrayList<Domicilio> domicilios;
    private ArrayList<Pedido> pedidos;
    private Usuario usuario;
    private Imagen imagen;

    public Cliente() {}

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(String nombre, String apellido, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Cliente(String nombre, String apellido, String telefono, String email, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public Date getFechaNacimiento() {return fechaNacimiento;}
    public void setFechaNacimiento(Date fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

    public ArrayList<Pedido> getPedidos() {return pedidos;}
    public void setPedidos(ArrayList<Pedido> pedidos) {this.pedidos = pedidos;}

    public ArrayList<Domicilio> getDomicilios() {return domicilios;}
    public void setDomicilios(ArrayList<Domicilio> domicilios) {this.domicilios = domicilios;}

    public Usuario getUsuario() {return usuario;}
    public void setUsuario(Usuario usuario) {this.usuario = usuario;}

    public Imagen getImagen() {return imagen;}
    public void setImagen(Imagen imagen) {this.imagen = imagen;}

    public void addPedido(Pedido p){
        if (pedidos == null) pedidos = new ArrayList<>();
        pedidos.add(p);
        p.setCliente(this);
    }

    public void removePedido(Pedido p){
        pedidos.remove(p);
    }

    public void addDomicilio(Domicilio d){
        if (domicilios == null) domicilios = new ArrayList<>();
        domicilios.add(d);
    }

    public void removeDomicilio(Domicilio d){
        domicilios.remove(d);
    }


}
