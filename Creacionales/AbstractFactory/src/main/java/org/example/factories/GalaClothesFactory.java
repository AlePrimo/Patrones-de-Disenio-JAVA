package org.example.factories;

import org.example.ClothesFactory;
import org.example.products.Shirt;
import org.example.products.Shoe;
import org.example.products.Trousers;
import org.example.products.shirts.GalaShirt;
import org.example.products.shoes.GalaShoe;
import org.example.products.trousers.GalaTrousers;

public class GalaClothesFactory implements ClothesFactory {
    @Override
    public Shoe createShoes() {
        return new GalaShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Trousers createTrouser() {
        return  new GalaTrousers();
    }
}
