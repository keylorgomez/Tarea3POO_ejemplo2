package ejemplo2;

import java.util.ArrayList;

public class Controlador {
    static ArrayList<Auto> listaAutos=new ArrayList<>();

    public static String RegistrarAuto(String placa, String modelo, double precio, String color){
        Auto auto1=new Auto(placa,modelo,precio,color);
        listaAutos.add(auto1);

        return "El auto se registró de manera correcta al sistema:)";

    }
}
