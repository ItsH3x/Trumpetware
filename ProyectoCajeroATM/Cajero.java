package ProyectoCajeroATM;


public class Cajero {
    private String localizacion;
    private String banco;

    public Cajero(String localizacion, String banco){
        this.localizacion = localizacion;
        this.banco = banco;
    }

    public void retirar(String cuenta, int tipo_transaccion, double monto){
        // Se debe hacer un objeto de tipo transaccion al finalizar
    }

    public void transferir(String cuenta_origen, String cuenta_destino, int tipo_transaccion, double monto){
        // Se debe hacer un objeto de tipo transaccion al finalizar
    }

    public void imprimirTicket(String cliente, int tipo_transaccion, double monto){
        System.out.println("================="+this.banco+"===============");
    }

    public String getLocalizacion(){
        return this.localizacion;
    }

    public void setLocalizacion(String localizacion){
        this.localizacion = localizacion;
    }

    public String getBanco(){
        return this.banco;
    }

    public void setBanco(String banco){
        this.banco = banco;
    }
}