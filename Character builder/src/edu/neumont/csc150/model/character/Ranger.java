package edu.neumont.csc150.model.character;

public class Ranger extends Character {
    public final int MIN_HP = 100;
    public final int MAX_HP = 169;
    public final int MIN_SPEED = 20;
    public final int MAX_SPEED = 25;
    public final int MIN_DAMAGE = 20;
    public final int MAX_DAMAGE = 30;
    private String typeOfAttack;
    private int damageDone = 0;

    public Ranger() {
        setHp(baseAttack());
        setSpeed();
    }

    public Ranger(String name) {
        setName(name);
        setHp(baseAttack());
        setSpeed();
    }

    public String getTypeOfAttack() {
        return typeOfAttack;
    }

    public void setTypeOfAttack(String typeOfAttack) {
        this.typeOfAttack = typeOfAttack;
    }

    public int getDamageDone() {
        return damageDone;
    }

    public void setDamageDone(int damageDone) {
        this.damageDone = damageDone;
    }

    @Override
    public void setHp(int i) {
        this.hp = random.nextInt(MIN_HP, MAX_HP) + 1;
    }

    @Override
    public void setSpeed() {
        this.speed = random.nextInt(MIN_SPEED, MAX_SPEED) + 1;
    }

    @Override
    public int baseAttack() {
        return  random.nextInt(MIN_DAMAGE, MAX_DAMAGE) + 1;
    }

    public String toBaseAttack() {
        baseAttack();
        return getTypeOfAttack() + " and I deal " +  getDamageDone() + " damage";
    }


    public int specialAttack() {
        int special = 37;
        setDamageDone(damageDone + special);
        setTypeOfAttack("Special Attack: Two Weapons");
        return special;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" +
                "Uses [" + typeOfAttack + "]!" + "\r\n" +
                "Attack Damage: " + damageDone;
    }
}
