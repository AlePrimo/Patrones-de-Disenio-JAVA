package org.example.products.shoes;

import org.example.products.Shoe;

public class GalaShoe implements Shoe {
    @Override
    public boolean isElegantShoe() {
        System.out.println("Zapato de gala  es elegante");
        return true;
    }

    @Override
    public boolean isRunningShoe() {
        System.out.println("Zapato de gala  no es para correr");
        return false;
    }
}
