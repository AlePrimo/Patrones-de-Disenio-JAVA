package org.example.prototypes;

public class Product implements IPrototype{

    private String name;
    private double price;

    public Product() {}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public IPrototype clone() {
        Product clone = new Product(this.name, this.price);
        return clone;
    }

    @Override
    public IPrototype deepClone() {   //COMO ESTA CLASE SOLO TIENE DATOS PRIMITIVOS Y
        // NO TIENE OBJETOS COMO ATRIBUTOS ESTE METODO NO ES NECESARIO
        return null;
    }


    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) +  "  - Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
