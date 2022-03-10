package edu.neumont.csc150.model.Potion;

public class BasicPotion extends Potion{

    public BasicPotion(int amountHealed, String name) {
        super(amountHealed, name);
    }


    @Override
    protected void setAmountHealed(int amountHealed) {
//20

    }

    @Override
    protected void setName(String name) {

    }
}
