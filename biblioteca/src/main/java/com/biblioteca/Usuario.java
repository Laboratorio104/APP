
public class Usuario {
    private Long id;
    private String nombre;
    private String correo;
    private String rol; // estudiante, profesor, admin

    public Usuario(Long id, String nombre, String correo, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    public void registrarse() {
        // Lógica de registro
    }

    public void autenticarse() {
        // Lógica de autenticación
    }

    // Getters y Setters
}
