package edu.neumont.csc150.model.Potion;

public class FullHeal extends Potion{
    public FullHeal(int amountHealed, String name) {
        super(amountHealed, name);
    }

    @Override
    protected void setAmountHealed(int amountHealed) {
//max health
    }

    @Override
    protected void setName(String name) {

    }
}
