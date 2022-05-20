package shop.musicAccessories;

import interfaces.ISell;

public class MusicAccessory implements ISell {

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public MusicAccessory(String description, double buyingPrice, double sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkupAbsolute(){
        return sellingPrice - buyingPrice;
    }

    public double calculateMarkupPercentage(){
        return (sellingPrice-buyingPrice)/buyingPrice;
    } // 1 = 100%

}
