public class DiscoDuro {
    String datos;
    double capacidadMaxima;
    double velocidadTransferencia;

    public DiscoDuro(double capacidadMaxima, double velocidadTransferencia) {
        this.capacidadMaxima = capacidadMaxima;
        this.velocidadTransferencia = velocidadTransferencia;
        this.datos = "";
    }

    public void escribirDatos(String datos) {
        if (datos.length() <= capacidadMaxima) {
            this.datos = datos;
        } else {
            System.out.println("No hay suficiente espacio en el Disco Duro.");
        }
    }

    public String leerDatos() {
        return datos;
    }
}
