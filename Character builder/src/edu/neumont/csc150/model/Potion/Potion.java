package edu.neumont.csc150.model.Potion;

public abstract class Potion {
    protected int amountHealed;
    protected String name;
    public Potion(int amountHealed, String name) {
        setName(name);
        setAmountHealed(amountHealed);
    }

    public int getAmountHealed() {
        return amountHealed;
    }

    protected abstract void setAmountHealed(int amountHealed);

    public String getName() {
        return name;
    }

    protected abstract void setName(String name);
}
