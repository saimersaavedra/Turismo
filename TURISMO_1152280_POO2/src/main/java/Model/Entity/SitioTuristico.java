package Model.Entity;

public class SitioTuristico {
    private int id;
    private String name;
    private String photo;
    private int price;
    private int calification;
    private String description;

    public SitioTuristico(int id, String name, String photo, int price, int calification, String description) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
        this.calification = calification;
        this.description = description;
    }

    public SitioTuristico(int id) {
        this.id = id;
    }

    public SitioTuristico() {
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the calification
     */
    public int getCalification() {
        return calification;
    }

    /**
     * @param calification the calification to set
     */
    public void setCalification(int calification) {
        this.calification = calification;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SitioTuristico{" + "id=" + id + ", name=" + name + ", photo=" + photo + ", price=" + price + ", calification=" + calification + ", description=" + description + '}';
    }
    
    
}
