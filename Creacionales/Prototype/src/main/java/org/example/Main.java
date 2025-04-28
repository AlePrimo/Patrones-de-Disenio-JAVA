package org.example;


import org.example.prototypes.PriceList;
import org.example.prototypes.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//Lista de precios inicial


        PriceList priceList = new PriceList("Lista de precios normal");
        List<Product> productList = List.of(new Product("Lapicera",524.4),
                new Product("Cartuchera", 1522.50),
                new Product("Mochila", 25400),
                new Product("Calculadora", 52642.30));

        priceList.setProductList(productList);

        System.out.println(priceList);

        //Segunda lista de precios con descuento

        PriceList priceList2 = (PriceList) priceList.deepClone();
        priceList2.setName("Lista con descuentos");

        for (Product product : priceList2.getProductList()){
            product.setPrice(product.getPrice() * 0.9);
        }

        System.out.println(priceList2);





    }
}