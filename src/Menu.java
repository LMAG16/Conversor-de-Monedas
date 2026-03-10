import java.util.Scanner;

public class Menu {

    Scanner lectura = new Scanner(System.in);
    ServicioCambio servicio = new ServicioCambio();

    public void mostrarMenu() {

        int opcion = 0;

        while(opcion != 7){

            System.out.println("""
            Sea bienvenido al Conversor de Moneda
    
            1) USD -> ARS
            2) ARS -> USD
            3) USD -> BRL
            4) BRL -> USD
            5) USD -> COP
            6) COP -> USD
            7) Ver historial
            8) Salir
            """);

            opcion = lectura.nextInt();

            if(opcion == 8){
                System.out.println("Programa finalizado.");
                break;
            }

            if(opcion == 7){
                servicio.mostrarHistorial();
                continue;
            }

            System.out.println("Ingrese el valor a convertir:");
            double valor = lectura.nextDouble();

            servicio.convertir(opcion, valor);
        }
    }
}