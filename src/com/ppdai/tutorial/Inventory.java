package com.ppdai.tutorial;

import com.ppdai.tutorial.inter.ItemComparator;

import java.util.ArrayList;

/**
 * The com.ppdai.tutorial.Inventory maintains a collection (that can be added to) of com.ppdai.tutorial.Item objects,
 * can sort them in various ways, and can display its contents.
 * 
 * @author Nicholas
 * @version 2016-09-22
 */
public class Inventory
{
    /**
     * Collection of fantasy Items.
     */
    private ArrayList<Item> items;

    /**
     * Initializes the ArrayList of Items.
     */
    public Inventory()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Adds the specified com.ppdai.tutorial.Item to this com.ppdai.tutorial.Inventory's collection.
     * 
     * @param item
     *            The com.ppdai.tutorial.Item to add to the com.ppdai.tutorial.Inventory.
     */
    public void addItem(Item item)
    {
        items.add(item);
    }

    /**
     * Sorts the com.ppdai.tutorial.Item objects in this com.ppdai.tutorial.Inventory's collection by their default
     * ordering defined by com.ppdai.tutorial.Item's implementation of Comparable.
     * 
     * In this case, sorts by value and then lexicographical ordering.
     */
    public void sort()
    {
        // TODO: complete implementation
    }

    /**
     * Sorts the com.ppdai.tutorial.Item objects in this com.ppdai.tutorial.Inventory's collection by the ordering
     * defined by the com.ppdai.tutorial.inter.ItemComparator.
     * 
     * @param comparator
     *            The com.ppdai.tutorial.inter.ItemComparator to use for sorting.
     */
    public void sort(ItemComparator comparator)
    {
        // TODO: complete implementation
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder(
                "You have the following items in your inventory:\n");

        for (Item item : items)
        {
            result.append(item.toString() + "\n");
        }

        return result.toString();
    }
}
