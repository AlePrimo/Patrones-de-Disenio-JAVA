package org.example.products.shoes;

import org.example.products.Shoe;

public class SportShoe implements Shoe {


    @Override
    public boolean isElegantShoe() {
        System.out.println("Zapato deportivo no es elegante");
        return false;
    }

    @Override
    public boolean isRunningShoe() {
        System.out.println("Zapato deportivo es para correr");
        return true;
    }



}
