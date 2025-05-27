package ProyectoCajeroATM;

public abstract class Cuenta {
    private int numero_de_cuenta;
    private Cliente cliente;

    public Cuenta(int numero_de_cuenta, Cliente cliente) {
        this.numero_de_cuenta = numero_de_cuenta;
        this.cliente = cliente;
    }

    public int getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(int numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero_de_cuenta=" + numero_de_cuenta +
                ", cliente=" + (cliente != null ? cliente.toString() : "null") +
                '}';
    }
}
