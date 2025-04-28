package org.example.products.shirts;

import org.example.products.Shirt;

public class GalaShirt implements Shirt {


    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa de gala -- tiene mangas largas? -> si");
        return true;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa de gala -- tiene botones? -> si");
        return true;
    }

}
