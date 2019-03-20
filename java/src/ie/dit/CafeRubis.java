package ie.dit;

import processing.core.PApplet;

public class CafePublis extends PApplet
{
    ArrayList<Product> products = new ArrayList<Product>();
    public void setting()
    {
        size(800, 800);
        loadProducts();
    }

    void loadProduct()
    {
        Table table = loadTable("cafe.csv", "header");
        for(TableRow tr:table.row())
        {
            Product p = new Product(tr);
            products.add(p);
        }
    }

    public void moseClicked()
    {
        int which = -1;

        (mouseY
        which = (int)((mouseY - border)/(buttonHeight + gap));

        if(which != -1)
        {
            System.out.println(products.get(which));
        }
    }


    float border = 20;
    float buttonWidth = 100;
    float buttonHeight = 50;
    float gap = 10;

    void drawProductButtons()
    {

        for(int i = 0; i < products.size(); i++)
        {
            float y = border + (i * buttonHeight + gap);
            float x = border;
            noFill();
            stroke(0);
            rect(x, y , buttonWidth, buttonHeight);
            textAlign(CENTER, CENTER);
            fill(0);
            text(p.getName(), x + buttonWidth * 0.5f, y + buttonHeight * 0.5f);
        }
    }

    public void draw()
    {
        background(127);


    }
}