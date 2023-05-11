package Model.Entity;

public class Turista 
{
    private String name;   
    private String apellido;
    private String id;
    private String telefono;
    private String gmail;
    private String direction;

    public Turista() {
    }

    
    public Turista(String id, String name, String apellido,String telefono, String gmail, String direction) {
        this.name = name;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
        this.gmail = gmail;
        this.direction = direction;
    }

    public Turista(String id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the gmail
     */
    public String getGmail() {
        return gmail;
    }

    /**
     * @param gmail the gmail to set
     */
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Turista{" + "id=" + id + ", name=" + name + ", apellido=" + apellido + ", telefono=" + telefono + ", gmail=" + gmail + ", direction=" + direction + '}';
    }
    
}
