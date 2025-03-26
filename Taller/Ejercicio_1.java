class TestCase {
    private int id;
    private String nombre;
    private String estado;

    public TestCase(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(String estado) {
        if (estado.equals("PASSED") || estado.equals("FAILED") || estado.equals("BLOCKED")) {
            this.estado = estado;
        } else {
            System.out.println("Estado inválido. Debe ser PASSED, FAILED o BLOCKED.");
        }
    }

    public String getEstado() {
        return estado;
    }

    public String detalles() {
        return "ID: " + id + ", Nombre: " + nombre + ", Estado: " + estado;
    }
}

public class Main {
    public static void main(String[] args) {
        TestCase caso1 = new TestCase(1, "Prueba de inicio de sesión", "PASSED");
        TestCase caso2 = new TestCase(2, "Prueba de registro de usuario", "FAILED");

        System.out.println(caso1.detalles());
        System.out.println(caso2.detalles());
    }
}