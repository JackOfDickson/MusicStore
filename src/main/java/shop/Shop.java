package shop;


import interfaces.ISell;

import java.util.HashMap;

public class Shop {
    private HashMap<ISell, Integer> shopStock;
    private double till;

    public Shop(HashMap<ISell, Integer> shopStock, double till) {
        this.shopStock = shopStock;
        this.till = till;
    }

    public HashMap getShopStock() {
        return shopStock;
    }

    public double getTill() {
        return till;
    }

    public void buyStock(ISell item, int quantity){
        double totalCost = item.getBuyingPrice() * quantity;
        if (totalCost > till){
            //cannot buy stock, ends here
        } else {
            till -= totalCost;
            shopStock.putIfAbsent(item, 0);
            shopStock.put(item, shopStock.get(item) + quantity);
        }
    }

//    public

}
