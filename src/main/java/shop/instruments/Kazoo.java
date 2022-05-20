package shop.instruments;

import interfaces.IPlay;

public class Kazoo extends Instrument implements IPlay {

    public Kazoo(String model, double buyingPrice, double sellingPrice) {
        super(model, InstrumentType.Wind, buyingPrice, sellingPrice);
    }

    public String play(){
        return "*Kazoo noises*";
    }
}
