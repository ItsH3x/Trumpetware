package ProyectoCajeroATM;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cajero {
    
    ArrayList<Transaccion> listaTransacciones = new ArrayList<>();
    private String localizacion;
    private String banco;
    private static int id = 0;

    public Cajero(String localizacion, String banco){
        this.localizacion = localizacion;
        this.banco = banco;
    }

    public void retirar(Cuenta cuenta, double monto){
        if(cuenta.getSaldo() < monto){
            System.out.println("Fondos insuficientes para el retiro");
            return;
        }
        double saldoNuevo = cuenta.getSaldo() - monto;
        cuenta.setSaldo(saldoNuevo);

        id++;

        // Obtener la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();

        // Formatear la fecha y hora como String
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraFormateada = ahora.format(formato);
        
        Transaccion retiro = new Retiro(id, fechaHoraFormateada, 'R', monto);
        listaTransacciones.add(retiro);
    }

    public void transferir(Cuenta cuenta_origen, Cuenta cuenta_destino, double monto){
        // Se debe hacer un objeto de tipo transaccion al finalizar
        if(cuenta_origen.getSaldo() < monto){
            System.out.println("Fondos insuficientes para la transaccion");
            return;
        }
        // Nuevo saldo cuenta origen
        double saldoNuevoOri = cuenta_origen.getSaldo() - monto;
        cuenta_origen.setSaldo(saldoNuevoOri);
        // Nuevo saldo cuenta destino
        double saldoNuevoDes = cuenta_destino.getSaldo() + monto;
        cuenta_origen.setSaldo(saldoNuevoDes);

        id++;

        // Obtener la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();

        // Formatear la fecha y hora como String
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraFormateada = ahora.format(formato);

        Transaccion transferencia = new Transferencia(id, fechaHoraFormateada, 'T', monto);
        listaTransacciones.add(transferencia);
        imprimirTicket(cuenta_origen.getCliente().getNombre(), 'T', monto);
    }

    public void imprimirTicket(String cliente, int tipo_transaccion, double monto){
        System.out.println("================="+this.banco+"===============");
        System.out.println("Nombre del cliente: "+cliente);
        
        String tipoTransaccion = "Retiro";
        if(tipo_transaccion=='T') tipoTransaccion = "Transferencia";
        System.out.println("Tipo de transaccion: "+tipoTransaccion);

        System.out.println("Monto total: "+monto);
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