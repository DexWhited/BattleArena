package edu.neumont.csc150.model.otherModels;

import edu.neumont.csc150.controller.Generator;
import edu.neumont.csc150.model.character.Character;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Player {

    private final ArrayList<Wallet> walList = new ArrayList<>();
    public ArrayList<Character> characters = new ArrayList<>();
    private String name;
    private Character character;
    private String currency;
    private String inventory;

    public Player() {
    }

    public Player(String name, Character character, String currency, String inventory) {
        setName(name);
        setCharacter(character);
        setCurrency(currency);
        setInventory(inventory);
    }

    public Player(String name) {
        setName(name);
    }
    public ArrayList<Wallet> getWalList() {
        return walList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public void addCharacters(Character characters) {
        this.characters.add(characters);
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public abstract void takeTurn(Character character, Character battlingCharacter) throws IOException;

//    public int takeTurn(){
//
//        int hp = character2.getHp();
//        int attack = character.baseAttack();
//
//        int battle = (hp- attack);
//
//
//        return battle;
      //  character2.getHp() - character2.baseAttack();
        }

    /*
    ----------Battle arena------------
    Turn based battle game with the ability to heal your character

    each character has a regular and strong attack.
    Strong attack can only be used once.
    player's turn is immediately followed but the computers turn.


    ---------character create------------------
    Choose name.
    choose class.
    randomly generate hp, speed, and health based on settings in class classes.
    Character is added to an array list.



    ---------battle----------
    Prompted with attack or view inventory
    if inventory is empty then display 0 potions
    attack has 2 options (strong or normal)
    turns are taken till a  character's hp = 0



    ---------betting-----------
    If your character wins,then five coins are added to your wallet
    else one coin is added





     */








