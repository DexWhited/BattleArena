package edu.neumont.csc150.model.character;

public class Elf extends Character {
    public final int MIN_HP = 100;
    public final int MAX_HP = 169;
    public final int MIN_SPEED = 22;
    public final int MAX_SPEED = 25;
    public final int MIN_DAMAGE = 19;
    public final int MAX_DAMAGE = 27;
    private String typeOfAttack;
    public int damageDone = 0;

    public Elf() {
        setHp(baseAttack());
        setSpeed();
    }

    public Elf(String name) {
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
        int special = 32;
        setDamageDone(damageDone + special);
        setTypeOfAttack("Special Attack: Magic");
        return special;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" +
                "Uses [" + typeOfAttack + "]!" + "\r\n" +
                "Attack Damage: " + damageDone;
    }
}
