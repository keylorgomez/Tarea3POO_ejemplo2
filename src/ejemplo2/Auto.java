package ejemplo2;

public class Auto {
    private String placa;
    private String marca;
    private double precio;
    private String color;
    private static double descuento;

    public Auto(String placa, String marca, double precio, String color) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        Auto.descuento=10;
    }
    public double PrecioVenta(){
        return this.precio-this.precio * Auto.descuento/100;
    }

    public static void CancelarDescuento(){
        Auto.descuento=0;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}
