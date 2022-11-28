package ejemplo2;

public class Auto {
    private String placa;
    private String marca;
    private double precio;
    private String color;
    private static double descuento;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        Auto.descuento = descuento;
    }

    public Auto(String placa, String marca, double precio, String color) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
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
