package org.example;


import org.example.factories.GalaClothesFactory;
import org.example.factories.SportClothesFactory;

import org.example.products.shirts.GalaShirt;
import org.example.products.shirts.SportShirt;
import org.example.products.shoes.GalaShoe;
import org.example.products.shoes.SportShoe;
import org.example.products.trousers.GalaTrousers;
import org.example.products.trousers.SportTrousers;


public class Main {
    public static void main(String[] args) {



        //A partir de la clase abstracta madre creamos una instancia de ropa deportiva

        ClothesFactory sportClothesFactory = new SportClothesFactory();

         SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoes();
         SportShirt sportShirt = (SportShirt) sportClothesFactory.createShirt();
         SportTrousers sportTrousers = (SportTrousers) sportClothesFactory.createTrouser();


        System.out.println("\n ----------- Ejemplo de ropa deportiva ----------- \n");
        sportShoe.isElegantShoe();
        sportShirt.hasButtons();
        sportTrousers.hasPockets();



        //A partir de la clase abstracta madre creamos una instancia de ropa de gala

        ClothesFactory galaClothesFactory = new GalaClothesFactory();

        GalaShoe galaShoe = (GalaShoe) galaClothesFactory.createShoes();
        GalaTrousers galaTrousers = (GalaTrousers) galaClothesFactory.createTrouser();
        GalaShirt galaShirt = (GalaShirt) galaClothesFactory.createShirt();



        System.out.println("\n ----------- Ejemplo de ropa de gala----------- \n");
        galaShoe.isElegantShoe();
        galaShirt.hasButtons();
        galaTrousers.hasPockets();









    }
}