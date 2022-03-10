package edu.neumont.csc150.model.otherModels;

import edu.neumont.csc150.controller.Generator;
import edu.neumont.csc150.model.character.Character;
import edu.neumont.csc150.view.BattleUI;

import java.io.IOException;
import java.util.Random;

public class AIPlayer extends Player {
    public AIPlayer(String name, Character character, String currency, String inventory) {
        super(name, character, currency, inventory);
    }

    private final BattleUI ui = new BattleUI();

    public AIPlayer(String name) {
        super(name);
    }

    @Override
    public void takeTurn(Character character, Character battlingCharacter) throws IOException {

        int range = (character.getSpecialAttackUsed() == true) ? 1 : 2;


        System.out.println("Ayooo!");
        int AIAttack = new Random().nextInt(range);
        if (AIAttack == 1) {
            //player2 hp - player1 attack
            System.out.println("Your starting HP is: " + battlingCharacter.getHp());
            int baseAttack = character.baseAttack();
            System.out.println("your opponents BaseAttack is: " + baseAttack);

            // System.out.println("total damage: " + (battlingCharacter.getHp() - baseAttack));

            battlingCharacter.adjustHP(character.getHp() - baseAttack);
            System.out.println(character.getName() + "'s HP is now " + character.getHp());
        } else {

            //player2 hp - player1 special attack
            if (character.getSpecialAttackUsed() == false) {
                character.adjustHP(character.getHp() - battlingCharacter.specialAttack());
                System.out.println(character.getName() + "'s HP is now " + character.getHp());
                character.setSpecialAttackUsed(true);

            }

            System.out.println("hello");

        }
    }
}