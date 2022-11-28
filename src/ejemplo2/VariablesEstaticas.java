package ejemplo2;

public class VariablesEstaticas {
    private static String nombre="Keylor";
    public static void main(String[] args) {
        Saludar();
        SaludarEnIngles();
    }
    public static void Saludar(){
        System.out.println("Feliz fin de cuatrimestre "+nombre);
    }
    public static void SaludarEnIngles(){
        System.out.println("Happy birthday "+nombre);
    }
}

