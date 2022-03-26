package com.codingstuff.scrollview.Model;

public class BestSeller {

    private int image;
    private String offer;

    public BestSeller(int image , String offer){
        this.image = image;
        this.offer = offer;
    }

    public int getImage() {
        return image;
    }

    public String getOffer() {
        return offer;
    }
}
