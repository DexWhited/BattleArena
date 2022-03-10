package edu.neumont.csc150.model.Potion;

public class HyperPotion extends Potion{
    public HyperPotion(int amountHealed, String name) {
        super(amountHealed, name);
    }

    @Override
    protected void setAmountHealed(int amountHealed) {
//50
    }

    @Override
    protected void setName(String name) {

    }
}
