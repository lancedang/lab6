package com.ppdai.tutorial.inter;

import com.ppdai.tutorial.Item;

import java.util.Comparator;

/**
 * Interface used by com.ppdai.tutorial.Item.sort(com.ppdai.tutorial.inter.ItemComparator comparator)
 * This ensures that Comparators passed into sort() compare
 * objects of type com.ppdai.tutorial.Item.
 * 
 * @author Nicholas
 * @version 2016-09-26
 */
public interface ItemComparator extends Comparator<Item>
{
}
