package edu.neumont.csc150.model.character;

public class Fighter extends Character {
    public final int MIN_HP = 100;
    public final int MAX_HP = 169;
    public final int MIN_SPEED = 10;
    public final int MAX_SPEED = 15;
    public final int MIN_DAMAGE = 22;
    public final int MAX_DAMAGE = 35;
    private String typeOfAttack;
    private int damageDone = 0;

    public Fighter() {
        setHp(baseAttack());
        setSpeed();
    }

    public Fighter(String name) {
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
        int special = 40;
        setDamageDone(damageDone + special);
        setTypeOfAttack("Special Attack: Strong Attack");
        return special;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" +
                "Uses [" + typeOfAttack + "]!" + "\r\n" +
                "Attack Damage: " + damageDone;
    }
}
