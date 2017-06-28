package com.ppdai.tutorial;

/**
 * The abstract class com.ppdai.tutorial.Consumable describes items that can be
 * consumed by the player.  Consumables carry information
 * about whether or not they are spoiled, and if they have been consumed.
 *
 * @author Nicholas
 * @version 2016-09-22
 */
public abstract class Consumable extends Item {
    /**
     * Whether or not this com.ppdai.tutorial.Consumable has been "consumed".
     */
    private boolean consumed;

    /**
     * Whether or not this com.ppdai.tutorial.Consumable is "spoiled."
     */
    private boolean spoiled;

    /**
     * @return A String describing the consuming of this com.ppdai.tutorial.Consumable.
     */
    public abstract String eat();

    /**
     * @param name    The name of the com.ppdai.tutorial.Consumable.
     * @param price   The price of the com.ppdai.tutorial.Consumable.
     * @param weight  The weight of the com.ppdai.tutorial.Consumable.
     * @param spoiled Whether or not the com.ppdai.tutorial.Consumable is spoiled.
     */
    public Consumable(String name, int price, double weight, boolean spoiled) {
        super(name, price, weight);

        consumed = false;
        this.spoiled = spoiled;
    }

    /**
     * @return a descriptive String of the consumption of the com.ppdai.tutorial.Consumable.
     * @see Item#use()
     * <p>
     * The abstract method use() defined by the abstract com.ppdai.tutorial.Item class is
     * implemented here, where if the com.ppdai.tutorial.Consumable has not been consumed,
     * it is "eaten" and the description returned by eat() is returned
     * by use().
     * <p>
     * If the item is spoiled, then text describing the player
     * as becoming sick is appended to this returned string.
     * <p>
     * If the com.ppdai.tutorial.Consumable has already been consumed, then a string
     * informing the player of this is returned.
     */
    public String use() {
        String result = "";

        if (!this.consumed && !this.spoiled) {
            result = eat();
        } else if (this.consumed) {
            result = "There is nothing left of the " + this.getName() + " to consume.";
        } else if (this.spoiled) {
            result = eat() + "\n" + "You feel sick.";
        }

        return result;
    }

    /**
     * Consumed getter
     *
     * @return the consumed property
     */
    public boolean isConsumed() {
        return consumed;
    }

    /**
     * Consumed setter
     *
     * @param consumed the consumed to set
     */
    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    /**
     * Spoiled getter
     *
     * @return the spoiled
     */
    public boolean isSpoiled() {
        return spoiled;
    }

    /**
     * Describe the item.
     *
     * @return String describing the com.ppdai.tutorial.Consumable object.
     * @see Item#toString()
     */
    @Override
    public String toString() {
        return String.format("%s, Consumed: %b, Spoiled: %b\n",
                super.toString(), consumed, spoiled);
    }
}
