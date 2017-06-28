package com.ppdai.tutorial;

/**
 * Created by Dangdang on 2017/6/28.
 */
public class Sword extends Weapon {
    public Sword(double baseDamage, double baseDurability, int value, double weight) {
        super("sword", baseDamage, baseDurability, value, weight);
    }

    @Override
    public void polish() {
        double tmpBaseDamage = getBaseDamage() * 0.25;
        double damageModi = getDamageModifier();
        //新伤害修正值
        double newDamageModifier = damageModi + damageModi * Weapon.MODIFIER_CHANGE_RATE;

        if (newDamageModifier < tmpBaseDamage) {
            setDamageModifier(newDamageModifier);
        } else {
            //增加到1.5倍
            setDamageModifier(getBaseDamage() * 0.25);
        }
    }
}
