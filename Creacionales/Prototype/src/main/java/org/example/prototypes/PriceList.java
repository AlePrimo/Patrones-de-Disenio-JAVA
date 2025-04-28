package org.example.prototypes;

import java.util.ArrayList;
import java.util.List;

public class PriceList implements IPrototype{

    private String name;
    private List<Product> productList = new ArrayList<>();



    public PriceList(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public IPrototype clone() {

        PriceList clone = new PriceList(name);  //CREAMOS UNA NUEVA LISTA Y COPIAMOS
        // Y PEGAMOS LOS MISMOS ELEMENTOS QUE TIENE LA ORIGINAL
        clone.setProductList(productList);
        return clone;

    }

    @Override
    public IPrototype deepClone() {

        PriceList clone = new PriceList(name);  //AQUI CREAMOS UNA NUEVA LISTA Y DESPUES CREAMOS OBJETOS NUEVOS A PARTIR
        // DE LOS OBJETOS ORIGINALES Y CON ESOS OBJETOS CLONADOS POBLAMOS LA NUEVA LISTA

        List<Product> cloneProductList = new ArrayList<>();
        for (Product product : productList){
            Product cloneProduct = (Product) product.clone();
            cloneProductList.add(cloneProduct);
        }

        clone.setProductList(cloneProductList);


        return clone;
    }


    @Override        // CON ESTE TO STRING IMPRIMIMOS LA REFERENCIA EN MEMORIA
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + "  -  PriceList{" +
                "name='" + name + '\'' +
                ", productList=" + productList +
                '}';
    }
}
