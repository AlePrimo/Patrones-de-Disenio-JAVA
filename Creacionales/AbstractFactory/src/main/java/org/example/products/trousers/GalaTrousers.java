package org.example.products.trousers;

import org.example.products.Trousers;

public class GalaTrousers implements Trousers {


    @Override
    public boolean hasPockets() {
        System.out.println("Zapato de gala  si tiene bolsillos");
        return true;
    }

    @Override
    public String getClosureType() {
        return "El pantalon de gala tiene botones";
    }
}
