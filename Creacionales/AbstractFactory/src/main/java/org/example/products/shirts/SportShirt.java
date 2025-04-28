package org.example.products.shirts;

import org.example.products.Shirt;

public class SportShirt implements Shirt {


    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa deportiva -- tiene mangas largas? -> no");
        return false;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa deportiva -- tiene botones? -> no");
        return false;
    }



}
