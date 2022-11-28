package ejemplo2;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*Auto auto1=new Auto("BRY-122","KIA",6000000,"Vino");
        Auto auto2=new Auto("BBM-322","Toyota",3500000,"Gris");

        System.out.println(auto1.PrecioVenta());
        System.out.println(auto2.PrecioVenta());

        //ANULAR DESCUENTO
        Auto.CancelarDescuento();
        System.out.println("\n");
        System.out.println(auto1.PrecioVenta());
        System.out.println(auto2.PrecioVenta());*/
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String mensajeOpciones = "Realizar acción: \n" +
                "1) Registrar auto\n" +
                "2) Establecer descuento\n" +
                "3) Anular descuento\n" +
                "4) Precios actuales\n" +
                "5) Salir";

        do {
            System.out.println(mensajeOpciones);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    RegistrarAuto();
                    break;
                case 2:
                    IndicarDescuento();
                    break;
                case 3:
                    Auto.CancelarDescuento();
                    System.out.println("El precio de descuento ha sido cancelado.");
                    break;
                case 4:
                    PreciosActuales();
                    break;
                case 5:
                    System.out.println("Hasta pronto!");
                    System.exit(0);
                default: System.out.println("Opción no válida");
            }
        }while (opcion!=5);
    }
    public static void RegistrarAuto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese modelo del auto: ");
        String modelo=scanner.nextLine();
        System.out.println("Ingrese el color del auto: ");
        String color=scanner.nextLine();
        System.out.println("Ingrese el número de placa del auto: ");
        String placa=scanner.nextLine();
        System.out.println("Ingrese el valor del auto de venta inicial del auto: ");
        double precio=scanner.nextDouble();
        String resultado=Controlador.RegistrarAuto(placa,modelo,precio,color);
        System.out.println(resultado);
    }
    public static void IndicarDescuento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje descuento para aplicar a los precios: ");
        double descuento=scanner.nextDouble();
        Auto.setDescuento(descuento);
        System.out.println("Se estableció un porcentaje de descuento del: "+descuento+"%.");
    }
    public static void PreciosActuales(){
        String respuesta=Controlador.preciosActuales();
        System.out.println(respuesta);
    }
}
