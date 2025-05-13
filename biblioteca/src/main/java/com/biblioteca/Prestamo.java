
public class Prestamo {
    private Long id;
    private Usuario usuario;
    private Libro libro;
    private String fechaInicio;
    private String fechaFin;
    private boolean devuelto;

    public Prestamo(Long id, Usuario usuario, Libro libro, String fechaInicio, String fechaFin) {
        this.id = id;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.devuelto = false;
    }

    public void crearPrestamo() {
        // Lógica para registrar préstamo
    }

    public void finalizarPrestamo() {
        this.devuelto = true;
    }

    // Getters y Setters
}
