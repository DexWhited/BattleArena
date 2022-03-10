package edu.neumont.csc150.view;


import edu.neumont.csc150.model.otherModels.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BattleUI {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //anything interacting with the user
    //System.out.println(();
    public int getUserInputAsInt(int min, int max) throws IOException {
        int input = 0;
        do {
            String line = br.readLine();
            try {
                input = Integer.parseInt(line);
                if (input < min || input > max) {
                    throw new NumberFormatException("out of range");
                }
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Input invalid. You must ender a number between " + min + " and " + max);

            }
        } while (true);


        return input;
    }

    public void mainMenu(Player player) { //2

        System.out.println("What would you like to do? \r\n" +
                "\t1: Generate a character\r\n" +
                "\t2: View characters\r");

        if(player.getCharacters().size() >= 2) {
            System.out.println(                "\t3: Engage in battle\r\n" +
                    "\t4: End simulation\r\n");
        }
    }

    public void characterMenu(){ //display after engage in battle
        System.out.println("Choose a character to bet on\r\n");
    }

    public void characterMenu2(){ //display after engage in battle
        System.out.println("Choose a character to fight\r\n");
    }

    public void battleMenu(){ //display after character menu
        System.out.println("Choose an action \r\n" +
                "\t1: Attack \r\n" +
                "\t2: View inventory\r\n");
    }

    public void attackMenu(){//display after battle menu
        System.out.println("Choose an attack type. \r\n" +
                "\t1: Base attack \r\n" +
                "\t2: Special attack (can only be used once)\r\n");
    }

    public void healMenu(){ //this would display after clicking view inventory, but only if you have a potion
        System.out.println("What would you like to do? \r\n" +
                "\t1: use potion \r\n");
    }

    public void displayStore(){ //display after view store
        System.out.println("What would you like to do? \r\n" +
                "\t1: Buy basic potion \r\n" +
                "\t1: Buy super potion \r\n" +
                "\t1: Buy Hyper potion \r\n" +
                "\t1: Buy full heal \r\n");
    }


}

