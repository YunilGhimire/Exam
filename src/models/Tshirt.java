package models;
import java.util.Arrays;

public class Tshirt {
    String name;
    int productCode;
    double price;
    String brand;
    String description;
    String[] sizes;

    //Constructor

    public Tshirt(String name, int productCode, double price, String brand, String description, String[] sizes) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }

    //GetterANDSetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] sizes() {
        return sizes;
    }

    public void sizes(String[] sizes) {
        this.sizes= sizes;
    }
    //describing the items

    public void Tshirtdescription() {
        System.out.println("Name of Tshirt: " + name);
        System.out.println("Product code: " + productCode);
        System.out.println("Description of the Tshirt:  " + description);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes that you can get: " + Arrays.toString(sizes));
    }
}


