package org.example.factories;

import org.example.ClothesFactory;
import org.example.products.Shirt;
import org.example.products.Shoe;
import org.example.products.Trousers;
import org.example.products.shirts.SportShirt;
import org.example.products.shoes.SportShoe;
import org.example.products.trousers.SportTrousers;

public class SportClothesFactory implements ClothesFactory {


    @Override
    public Shoe createShoes() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers createTrouser() {
        return new SportTrousers();
    }




}
