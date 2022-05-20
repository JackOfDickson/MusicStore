package shop.instruments;

import interfaces.IPlay;

public class Banjo extends Instrument implements IPlay{

    private int stringCount;

    public Banjo(String name, int stringCount, double buyingPrice, double sellingPrice) {
        super(name, InstrumentType.String, buyingPrice, sellingPrice);
        this.stringCount = stringCount;
    }

    public int getStringCount() {
        return stringCount;
    }

    public String play(){
        return "plong";
    }


}
