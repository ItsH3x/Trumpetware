package ProyectoCajeroATM;

public class CuentaDebito extends Cuenta {
    private double limiteDiario;

    public CuentaDebito(int numero_de_cuenta, Cliente cliente, double saldo, double limiteDiario) {
        super(numero_de_cuenta, cliente, saldo);
        this.limiteDiario = limiteDiario;
    }

    public double getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(double limiteDiario) {
        this.limiteDiario = limiteDiario;
    }

    @Override
    public String toString() {
        return "CuentaDebito{" +
                "numero_de_cuenta=" + getNumero_de_cuenta() +
                ", cliente=" + (getCliente() != null ? getCliente().toString() : "null") +
                ", limiteDiario=" + limiteDiario +
                '}';
    }
}