package edu.neumont.csc150.model.Potion;

public class SuperPotion extends Potion{

    public SuperPotion(int amountHealed, String name) {
        super(amountHealed, name);
    }

    @Override
    protected void setAmountHealed(int amountHealed) {
//30
    }

    @Override
    protected void setName(String name) {

    }
}
