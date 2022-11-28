package ejemplo2;

import java.util.ArrayList;

public class Controlador {
    static ArrayList<Auto> listaAutos=new ArrayList<>();

    public static String RegistrarAuto(String placa, String modelo, double precio, String color){
        Auto auto1=new Auto(placa,modelo,precio,color);
        listaAutos.add(auto1);

        return "El auto se registró de manera correcta al sistema:)";

    }
    public static String listarAutos(){
        String listaAutosTemporal="";
        for (int i=0;i<listaAutos.size();i++){
            listaAutosTemporal+=listaAutos.get(i);
        }
        return listaAutosTemporal;
    }
    public static String preciosActuales(){
        String preciosnuevos="";
        System.out.println("Los precios actuales de los autos son:");
        for (int i=0;i<listaAutos.size();i++){
            preciosnuevos+="Para el "+listaAutos.get(i).getMarca()+" número de placa: "+listaAutos.get(i).getPlaca()+" su precio atual es: ₡"+listaAutos.get(i).PrecioVenta()+"\n";
        }

        return preciosnuevos;
    }
}
