import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private Date fechaNacimiento;
    private Set<Domicilio> domicilios = new HashSet<>();
    private Set<Pedido> pedidos = new HashSet<>();
    private Usuario usuario;
    private ImagenPersona imagen;

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

    public Set<Pedido> getPedidos() {return pedidos;}
    public void setPedidos(Set<Pedido> pedidos) {this.pedidos = pedidos;}

    public Set<Domicilio> getDomicilios() {return domicilios;}
    public void setDomicilios(Set<Domicilio> domicilios) {this.domicilios = domicilios;}

    public Usuario getUsuario() {return usuario;}
    public void setUsuario(Usuario usuario) {this.usuario = usuario;}

    public ImagenPersona getImagen() {return imagen;}
    public void setImagen(ImagenPersona imagen) {this.imagen = imagen;}

    public void addPedido(Pedido p){
        if (p != null){
            pedidos.add(p);
        }
    }

    public void removePedido(Pedido p){
        if (pedidos.contains(p)){
            pedidos.remove(p);
        }
    }

    public void addDomicilio(Domicilio d){
        if (d != null){
            domicilios.add(d);
        }
    }

    public void removeDomicilio(Domicilio d){
        if (domicilios.contains(d)){
            domicilios.remove(d);
        }
    }


}
