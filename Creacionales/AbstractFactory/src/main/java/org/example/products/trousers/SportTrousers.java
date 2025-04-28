package org.example.products.trousers;

import org.example.products.Trousers;

public class SportTrousers implements Trousers {


    @Override
    public boolean hasPockets() {
        System.out.println("El pantalon deportivo no tiene bolsillos");
        return false;
    }

    @Override
    public String getClosureType() {
        return "El pantalon deportivo tiene elastico";
    }
}
