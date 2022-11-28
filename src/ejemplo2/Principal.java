package ejemplo2;

import java.time.LocalDate;

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

        Boletos b1=new Boletos(LocalDate.now().toString(),"207870914");
        Boletos b2=new Boletos( LocalDate.now().toString(),"204360110");
        Boletos b3=new Boletos( LocalDate.now().toString(),"205430920");
        Boletos b4=new Boletos( LocalDate.now().toString(),"105510812");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);



    }
}
