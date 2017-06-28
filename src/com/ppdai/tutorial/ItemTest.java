package com.ppdai.tutorial;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ItemTest
{
    private static final double weight = 0.4527;
    private static final int valueMultiplier = 247;
    private static Item[] items;
    
    @BeforeClass
    public static void setup()
    {
        Item.reset();
        
        items = new Item[5];
        
        for (int i = 0; i < 5; i++)
        {
            items[i] = new Item(Integer.toString(i),
                i * valueMultiplier, i + weight)
            {   
                @Override
                public String use()
                {
                    return "You use the item, it is good.";
                }  
            };
        }
    }

    @Test
    public void itemConstructorTest()
    {
        Assert.assertEquals(items[2].getName(), "2");
        Assert.assertEquals(items[2].getValue(), 2 * valueMultiplier);
        Assert.assertEquals(items[2].getWeight(), 2 + weight, 0.001);
    }
    
    @Test
    public void getItemIdTest()
    {
        for (int i = 0; i < 5; i++)
        {
            Assert.assertEquals(i, items[i].getId());
        }
    }
    @Test
    public void compareItemToLesserItemTest()
    {
        Assert.assertTrue(items[1].compareTo(items[0]) > 0);
    }
    
    @Test
    public void compareItemToEqualItemTest()
    {
        Assert.assertTrue(items[1].compareTo(items[1]) == 0);
    }
    
    @Test
    public void compareItemToGreaterItemTest()
    {
        Assert.assertTrue(items[0].compareTo(items[1]) < 0);
    }
    
    @Test
    public void compareEqualItemsLexicographicallyTest()
    {
        Item lesser = new Item("a", items[1].getValue(),
            items[1].getWeight())
            {
                @Override
                public String use()
                {
                    // TODO Auto-generated method stub
                    return null;
                }
            };
            
        Item greater = new Item("b", items[1].getValue(),
            items[1].getWeight())
            {
                @Override
                public String use()
                {
                    // TODO Auto-generated method stub
                    return null;
                }
            };

        Assert.assertTrue(lesser.compareTo(greater) < 0);
    }
    
    @Test
    public void itemToStringTest()
    {
        Assert.assertEquals(String.format("%d -- Value: %d, Weight: %.2f",
            3, 3 * valueMultiplier, 3 + weight), items[3].toString());
    }
    
    @Test
    public void itemUseTest()
    {
        Assert.assertEquals("You use the item, it is good.",
            items[0].use());
    }
    
    @Test
    public void setItemNameTest()
    {
        items[0].setName("New Name");
        
        Assert.assertEquals("New Name", items[0].getName());
    }
    
    @Test
    public void setItemValueTest()
    {
        items[0].setValue(42);
        
        Assert.assertEquals(42, items[0].getValue());
    }
    
    @Test
    public void setItemWeightTest()
    {
        items[0].setWeight(5 + weight);
        
        Assert.assertEquals(5 + weight, items[0].getWeight(), 0.001);
    }
}
