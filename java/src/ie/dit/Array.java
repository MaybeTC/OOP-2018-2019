package ie.dit;

import processing.core.PApplet;

public class Array extends PApplet
{
    float[] rainFall = {45,37,55,27,38,50,79,48,104,31,100,58};
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", 
    "Aug", "Sep", "Oct", "Nov", "Dec"};

    //float[] fa = {10,9};
    float[] colorD = new float[12];
    float[] fa = new float[2];//empty new arrays

    public void settings()
    {
        size(500,500);
    }

    public void setup()  
    {
        fa[0] = 10;
        fa[1] = 4;
        float n = 0;
        float avg = 0;

        System.out.println(fa[0]);
        System.out.println(fa[2]);

        for(int i = 0; i < rainFall.length; i++)
        {
            System.out.println(months[i] + "\t" + rainFall[i]);
        }

        for(float f:rainFall)//For each loop
        {
            system.out.println(f);
        }
        float nMax = 0;
        float nMin = 0;

        for(int i = 0; i < rainFall.length; i++)//total
        {
            n = n + rainFall[i];
            nMax = max(rainFall);
            nMin = min(rainFall);
        }

        avg = n/(float)rainFall.length;
        System.out.println("Total" + "\t" + n);
        System.out.println("Average" + "\t" + avg);
        System.out.println("Max: " + nMax + " Min :" + nMin);
        
        float max = rainFall[0];
        int maxIndex = -1;
        for(int i = 0; i < rainFall.length; i++)
        {
            if(rainFall[i] > max)
            {
                max = rainFall[i];
                maxIndex = i;
            }
        }
        max = Float.MIN_VALUE;
    }

    public void draw()
    {
        colorMode(RGB);
        float h = height / (float) rainFall.length;
        for(int i = 0; i < rainFall.length; i++)
        {
            noStroke();
            rect(0, i * h, rainFall[i]*5, h);
            fill(random(0, 255), 255, 255);
            fill(0);
            float textY = i * h + (h * 0.5f);
            text("monnth[i]", 5, textY);
        }
    }
}
