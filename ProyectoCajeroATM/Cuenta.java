package ProyectoCajeroATM;

public abstract class Cuenta {
    private int numero_de_cuenta;
    private Cliente cliente;
    private double saldo;

    public Cuenta(int numero_de_cuenta, Cliente cliente, double saldo) {
        this.numero_de_cuenta = numero_de_cuenta;
        this.cliente = cliente;
        this.saldo = saldo;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero_de_cuenta=" + numero_de_cuenta +
                ", cliente=" + (cliente != null ? cliente.toString() : "null") +
                ", saldo=" + saldo +
                '}';
    }
}
