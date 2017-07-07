package com.ppdai.tutorial;

/**
 * Created by qiankai02 on 2017/6/29.
 */
public class Bow extends Weapon {
    public Bow(double baseDamage, double baseDurability, int value, double weight) {
        super("bow", baseDamage, baseDurability, value, weight);
    }

    @Override
    public void polish() {
        double durabiModi = getDurabilityModifier();
        //新伤害修正值
        double newDurabiModifier = durabiModi + durabiModi * Weapon.MODIFIER_CHANGE_RATE;

        if (newDurabiModifier < 1) {
            setDurabilityModifier(newDurabiModifier);
        } else {
            //
            setDurabilityModifier(1);
        }
    }
}
