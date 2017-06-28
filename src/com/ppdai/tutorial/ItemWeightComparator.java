package com.ppdai.tutorial;

import com.ppdai.tutorial.inter.ItemComparator;

/**
 * Created by Dangdang on 2017/6/28.
 */
public class ItemWeightComparator implements ItemComparator {
    @Override
    public int compare(Item o1, Item o2) {
        if(o1.getWeight()> o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }else {
            return o1.compareTo(o2);
        }
    }
}
