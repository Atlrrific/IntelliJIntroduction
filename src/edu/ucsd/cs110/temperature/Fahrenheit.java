package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public float toCelsius() {
        return (float) ((this.getValue()-32)/1.8);
    }

    @Override
    public float toFahrenheit() {
        return this.getValue();
    }


    public String toString()
    {
        // TODO: Complete this method
        return "";
    }
}

