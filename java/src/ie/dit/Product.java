package ie.dit;

import processing.data.*;

public class Product
{
    private String name;
    private float price;

    public Product(String name, float f)
    {

    }

    public Product(TableRow tr);
    {
        // Constructor chaining
        this(tr.getString("Name"), tr.getFloat("Price"));
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
}