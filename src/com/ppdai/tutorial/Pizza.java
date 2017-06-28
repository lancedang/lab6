package com.ppdai.tutorial;

/**
 * The com.ppdai.tutorial.Pizza class extends the com.ppdai.tutorial.Consumable class, implementing
 * the eat() method, which returns a descriptive String about
 * the eating of the com.ppdai.tutorial.Pizza, and increases the number of slices
 * eaten until this equals the number of total slices,
 * at which point the com.ppdai.tutorial.Pizza becomes "consumed".
 * 
 * @author Nicholas
 * @version 2016-09-22
 */
public class Pizza extends Consumable
{
    /**
     * The total number of slices the full com.ppdai.tutorial.Pizza has.
     */
    private int numberOfSlices;

    /**
     * The number of slices of the com.ppdai.tutorial.Pizza that have been eaten.
     */
    private int slicesEaten;
    
    /**
     * @param numberOfSlices The number of slices that can be eaten
     * before the com.ppdai.tutorial.Pizza has been consumed.
     * @param spoiled Whether or not the com.ppdai.tutorial.Pizza is spoiled.
     */
    public Pizza(int numberOfSlices, boolean spoiled)
    {
        super("pizza", 50, 2, spoiled);
        
        this.numberOfSlices = numberOfSlices;
        slicesEaten = 0;
    }
    
    /* (non-Javadoc)
     * @see com.ppdai.tutorial.Consumable#eat()
     */
    @Override
    public String eat()
    {
        if (slicesEaten < numberOfSlices)
        {            
            slicesEaten++;
            
            if (slicesEaten >= numberOfSlices)
            {
                setConsumed(true); // All gone!
            }
            
            return "You eat a slice of the pizza.";
        }
        else
        {
            /* There is no description returned if the com.ppdai.tutorial.Pizza
             * is consumed since we are only interacting with
             * class instances through the API defined by com.ppdai.tutorial.Item,
             * which does not expose eat().
             * 
             * com.ppdai.tutorial.Consumable's implementation of use() will display
             * an appropriate message if the player tries to "use"
             * a consumed com.ppdai.tutorial.Consumable.
             */
            return "";
        }        
    }
}
