package shop.instruments;

import interfaces.ISell;

public abstract class Instrument implements ISell {
    private String model;
    private InstrumentType instrumentType;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String model, InstrumentType instrumentType, double buyingPrice, double sellingPrice) {
        this.model = model;
        this.instrumentType = instrumentType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getModel() {
        return model;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
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
    }
}
