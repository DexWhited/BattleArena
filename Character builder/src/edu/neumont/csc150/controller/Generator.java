package edu.neumont.csc150.controller;

import edu.neumont.csc150.model.character.Character;
import edu.neumont.csc150.model.character.*;
import edu.neumont.csc150.model.otherModels.AIPlayer;
import edu.neumont.csc150.model.otherModels.HumanPlayer;
import edu.neumont.csc150.model.otherModels.Player;
import edu.neumont.csc150.utils.Console;
import edu.neumont.csc150.view.BattleUI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Generator {
    private final BattleUI ui = new BattleUI();
    // public static ArrayList<Character> charList = new ArrayList<>();
    private final ArrayList<String> names = new ArrayList<>();
    public ArrayList<Player> users = new ArrayList<>();
    Random random = new Random();

    public void run() throws IOException {
        int turn = 0;
        addNames(names);

        // Asking for name
        String name = Console.getString("What is your name: ");
        Player player = new HumanPlayer(name);

        // Add them to the arraylist
        users.add(player);

        // Create the AI
        player = new AIPlayer("Bobbert");
        users.add(player);


        boolean keepLooping = true;
        while (keepLooping) {
            ui.mainMenu(users.get(0));
            int selection = ui.getUserInputAsInt(1, 6);
            switch (selection) {
                case 1:
                    createCharacter(users.get(0), true);
                    createCharacter(users.get(1), false);
                    break;
                case 2:
                    charView(users.get(0));
                    break;
                case 3:
                    Character character = chooseCharacter(users.get(0));
                    Character battle = chooseBattle(users.get(1));


                    System.out.println("It is now " + users.get(0).getName() + "'s turn!");
                    users.get(0).takeTurn(character, battle);

                    System.out.println("It is now " + users.get(1).getName() + "'s turn!");
                    users.get(1).takeTurn(battle, character);

                    break;
                case 4:
                    keepLooping = false;
                    break;
                default:
                    throw new IllegalArgumentException("unknown number");
            }
        }
    }

    private void createCharacter(Player player, boolean isHuman) {
        Character character = null;
        int selection;
        if (isHuman) {
            System.out.println(" Choose a class! \r\n " + "\t1: Bard \r\n" + "\t2: Cleric \r\n" + "\t3: Druid \r\n" + "\t4: Elf \r\n" + "\t5: Fighter \r\n" + "\t6: Paladin \r\n" + "\t7: Ranger \r\n" + "\t8: Rouge \r\n" + "\t9: Sorcerer \r\n");
            selection = Console.getInteger("Please enter a number", 1, 9);
        } else {
            selection = random.nextInt(1, 9);
        }

        switch (selection) {
            case 1 -> character = new Bard();
            case 2 -> character = new Cleric();
            case 3 -> character = new Druid();
            case 4 -> character = new Elf();
            case 5 -> character = new Fighter();
            case 6 -> character = new Paladin();
            case 7 -> character = new Ranger();
            case 8 -> character = new Rouge();
            case 9 -> character = new Sorcerer();
        }

        if (isHuman) character.setName(Console.getString("Please enter a name"));
        else character.setName(names.get(random.nextInt(0, names.size())));


        player.addCharacters(character);

        System.out.println("My name is " + character.getName() + " my class is " + character.getClass().getSimpleName() + ". My hp is: " + character.getHp());


    }


    private void charView(Player player) {
        for (Character character : player.getCharacters()) {
            System.out.println(" My name is " + character.getName() + ". I am a " + character.getClass().getSimpleName() + ". My hp is: " + character.getHp());
        }
    }


    private void setStats(Character type) {
        type.setHp(type.baseAttack());
        type.setSpeed();
    }


    private Character chooseCharacter(Player player) {
        int i = 1;
        for (Character character : player.getCharacters()) {
            System.out.println(i + ": " + character.getName());
            i++;
        }

        int selection = Console.getInteger("Please choose a character to play as.");

        return player.getCharacters().get(--selection);
    }

    private Character chooseBattle(Player player) throws IOException {
        int i = 1;
        for (Character character : player.getCharacters()) {
            System.out.println(i + ": " + character.getName());
            i++;
        }

        int selection = Console.getInteger("Please choose a character to battle.");

        return player.getCharacters().get(--selection);

    }

    private void addNames(ArrayList<String> names) {
        names.add("Bob");
        names.add("Bobbert");
        names.add("Bobby");
        names.add("Bob Jr.");
        names.add("Bob's R us");
        names.add("Bobbert Jr.");
    }
}
