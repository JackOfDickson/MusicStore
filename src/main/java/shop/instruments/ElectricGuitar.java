package shop.instruments;

public class ElectricGuitar extends Instrument{

    private int stringCount;

    public ElectricGuitar(String model, double buyingPrice, double sellingPrice, int stringCount) {
        super(model, InstrumentType.String, buyingPrice, sellingPrice);
        this.stringCount = stringCount;
    }

    public int getStringCount() {
        return stringCount;
    }

    public String play(){
        return "*electric guitar noises*";
    }
}
