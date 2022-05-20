package shop.instruments;

import interfaces.IPlay;

public class Saxophone extends Instrument implements IPlay {

    public Saxophone(String model, double buyingPrice, double sellingPrice) {
        super(model, InstrumentType.Brass, buyingPrice, sellingPrice);
    }

    public String play() {
        return "*Saxophone sounds*";
    }


}
