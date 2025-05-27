package ProyectoCajeroATM;

public class Cuenta {
    private int numero_de_cuenta;
    private String tipo;
    private Cliente cliente;

    public Cuenta(int numero_de_cuenta, String tipo, Cliente cliente) {
        this.numero_de_cuenta = numero_de_cuenta;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public int getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(int numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
