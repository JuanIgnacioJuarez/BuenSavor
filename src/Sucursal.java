import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private String nombre;
    private Date horarioApertura;
    private Date horarioCierre;
    private Domicilio domicilio;
    private Set<Categoria> categorias = new HashSet<>();
    private Set<Promocion> promociones = new HashSet<>();

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

    public Set<Categoria> getCategorias() {return categorias;}
    public void setCategorias(Set<Categoria> categorias) {this.categorias = categorias;}

    public Set<Promocion> getPromociones() {return promociones;}
    public void setPromociones(Set<Promocion> promociones) {this.promociones = promociones;}

    public void addCategoria(Categoria c){
        if (c != null){
            categorias.add(c);
        }
    }

    public void removeCategoria(Categoria c){
        if (categorias.contains(c)){
            categorias.remove(c);
        }
    }

    public void addPromocion(Promocion p){
        if (p != null);{
            promociones.add(p);
        }
    }

    public void removePromocion(Promocion p){
        if (promociones.contains(p)){
            promociones.remove(p);
        }
    }
}
