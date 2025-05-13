
public class Multa {
    private Long id;
    private Usuario usuario;
    private int diasRetraso;
    private double valor;

    public Multa(Long id, Usuario usuario, int diasRetraso) {
        this.id = id;
        this.usuario = usuario;
        this.diasRetraso = diasRetraso;
        this.valor = calcularMulta();
    }

    public double calcularMulta() {
        return diasRetraso * 1000.0; // Ejemplo: $1000 por día
    }

    // Getters y Setters
}
