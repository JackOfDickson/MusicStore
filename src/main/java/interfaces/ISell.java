package interfaces;

public interface ISell {

    public double calculateMarkupAbsolute(double buyingPrice, double sellingPrice);

    public double calculateMarkupPercentage(double buyingPrice, double sellingPrice);
}
