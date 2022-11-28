package ejemplo2;

public class Boletos {
    private static int contador=0;
    private int numero;
    private String fechaCompra;
    private String cedulaCliente;

    public Boletos(String fechaCompra, String cedulaCliente) {
        contador++;
        this.numero=contador;
        this.fechaCompra = fechaCompra;
        this.cedulaCliente = cedulaCliente;
    }

    @Override
    public String toString() {
        return "Boletos{" +
                "numero=" + numero +
                ", fechaCompra='" + fechaCompra + '\'' +
                ", cedulaCliente='" + cedulaCliente + '\'' +
                '}';
    }
}
