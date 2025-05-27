package ProyectoCajeroATM;

public class Cliente {

    private int identificador;
    private String nombre;
    private String direccion;

    public Cliente(int identificador, String nombre, String direccion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

