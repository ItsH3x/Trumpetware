package ProyectoCajeroATM;

public class Transferencia extends Transaccion {

    public Transferencia(int identificador, String fecha, char tipo, double monto) {
        super(identificador, fecha, tipo, monto);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void realizar_Operacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizar_Operacion'");
    }

    // @Override
    // public void Transacciones() {
    // 			System.out.print("Cuanto quieres Transferir: ");
    //             Transferencia();
    //             if (transferencia <= getSaldo()) {
    //                 transacciones = getSaldo();
    //                 setSaldo(transacciones - transferencia);
    //                 System.out.println("====================================");
    //                 System.out.println("=================BBVA===============");
    //                 System.out.println("				Debito				");
    //                 System.out.println("Se relalizo una Consulta el 31/10/2023");
    //                 System.out.println("A la cuenta "+numero_cuenta);
    //                 System.out.println("transferiste : " + transferencia);
    //                 System.out.println("Tu saldo actual es: " + getSaldo());
    //                 System.out.println("====================================");
    //             } else {
    //                 System.out.println("=====================");
    //                 System.out.println("Saldo insuficiente");
    //                 System.out.println("=====================");
               
        	
    //             }
    			
    // }
}