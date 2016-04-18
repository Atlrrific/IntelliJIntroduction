package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public float toCelsius() {

        return this.getValue();
    }

    @Override
    public float toFahrenheit() {
        return (float) (this.getValue()*1.8 + 32);
    }


    public String toString()
        {
            // TODO: Complete this method
            return "";
        }
}
