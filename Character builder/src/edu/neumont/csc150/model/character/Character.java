package edu.neumont.csc150.model.character;

import java.util.Random;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int speed;
    protected boolean specialAttackUsed;
    Random random = new Random();


    public Character() {}

    public String getName() {return name;}

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        } else {
            this.name = name;
        }
    }

    public int getHp() {return hp;}

    public abstract void setHp(int i);

    public void adjustHP(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {return speed;}

    public abstract void setSpeed();

    public abstract int baseAttack();

    public abstract int specialAttack();

    @Override
    public String toString() {
        return name + "\r\n" +
                "HP: " + hp + "\r\n" +
                "Speed: " + speed;
    }

    public String toBaseAttack() {
        return "MY CHILDREN OVERWRITE ME";
    }

    public boolean getSpecialAttackUsed() {
        return specialAttackUsed;
    }
    public void setSpecialAttackUsed(boolean value) {
        this.specialAttackUsed = value;
    }
}
