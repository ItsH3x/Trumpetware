package ProyectoCajeroATM;

public abstract class Transaccion implements ITransaccion{
    private String identificador;
    private String fecha;
    private String tipo;
    private double monto;

    public Transaccion(String identificador, String fecha, String tipo, double monto) {
        this.identificador = identificador;
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "identificador='" + identificador + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tipo='" + tipo + '\'' +
                ", monto=" + monto +
                '}';
    }
}
