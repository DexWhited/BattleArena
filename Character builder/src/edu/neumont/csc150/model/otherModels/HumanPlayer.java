package edu.neumont.csc150.model.otherModels;

import edu.neumont.csc150.model.character.Character;
import edu.neumont.csc150.view.BattleUI;

import java.io.IOException;


public class HumanPlayer extends Player {
    private final BattleUI ui = new BattleUI();

    public HumanPlayer(String name, Character character, String currency, String inventory) {
        super(name, character, currency, inventory);
    }

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public void takeTurn(Character character, Character battlingCharacter) throws IOException {
        boolean quit = false;

        while (!quit) {
            ui.battleMenu();
            int selection = ui.getUserInputAsInt(1, 2);
            switch (selection) {
                case 1:
                    boolean attackMenu = false;

                    while (!attackMenu) {
                        if (character.getHp() > 0 && battlingCharacter.getHp() > 0) {
                            ui.attackMenu();
                            int userAttack = ui.getUserInputAsInt(1, 2);

                            if (userAttack == 1) {
                                //player2 hp - player1 attack
                                System.out.println("Your opponents starting HP is: " + battlingCharacter.getHp());
                                int baseAttack = character.baseAttack();
                                System.out.println("your BaseAttack is: " + baseAttack);

                                // System.out.println("total damage: " + (battlingCharacter.getHp() - baseAttack));

                                battlingCharacter.adjustHP(battlingCharacter.getHp() - baseAttack);
                                System.out.println(battlingCharacter.getName() + "'s HP is now " + battlingCharacter.getHp());

                                attackMenu = true;
                            } else {

                                //player2 hp - player1 special attack
                                if (battlingCharacter.getSpecialAttackUsed() == false) {
                                    battlingCharacter.adjustHP(battlingCharacter.getHp() - character.specialAttack());
                                    System.out.println(battlingCharacter.getName() + "'s HP is now " + battlingCharacter.getHp());
                                    battlingCharacter.setSpecialAttackUsed(true);
                                    attackMenu = true;
                                } else {
                                    System.out.println("You cannot use the special attack!");
                                }
                            }
                        } else {
                            System.out.println("A character has fainted!");
                            quit = true;

                            break;
                        }
                    }
                    break;
                case 2:
                    ui.healMenu();
                    break;
                default:
                    throw new IllegalArgumentException("unknown number");
            }
        }
        System.out.println("PEACE BESTIES!");
    }

}