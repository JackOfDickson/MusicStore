package shop.instruments;

import interfaces.IPlay;

public class Piano extends Instrument implements IPlay {

    private int keys;

    public Piano(String model, double buyingPrice, double sellingPrice, int keys) {
        super(model, InstrumentType.Percussion, buyingPrice, sellingPrice);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public String play(){
        return "*Piano sounds*";
    }


}
