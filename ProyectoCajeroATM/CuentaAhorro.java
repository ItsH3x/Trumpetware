package ProyectoCajeroATM;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(int numero_de_cuenta, Cliente cliente, double tasaInteres) {
        super(numero_de_cuenta, cliente, tasaInteres);
        this.tasaInteres = tasaInteres;
        this.tipo = 'A';
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "numero_de_cuenta=" + getNumero_de_cuenta() +
                ", cliente=" + (getCliente() != null ? getCliente().toString() : "null") +
                ", tasaInteres=" + tasaInteres +
                '}';
    }
}