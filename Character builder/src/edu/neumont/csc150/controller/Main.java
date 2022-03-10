package edu.neumont.csc150.controller;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Generator controller = new Generator();
        controller.run();


        //--------------------TO DO---------------------
        //1: Make it so special attacks can only be used once
        //2: Finish attack method and make one for special attacks
        //3: Make wallet and coins






        //Character classes ( Rouge, Bard, ect.)  -----Done---------
        //Ability to create a character
            //Chose name
            //
        //An array of characters to choose from to have fight each other
        //Randomly generated characters
        //randomly assigned hp, attack, and speed
        //coins added when your character wins
        //choose how much to bet on a character
        //betting on who will win so you get more coins for guessing right? yeah maybe lol just make it a betting thing lol
        //wallet array list? could also be int?

        //lol, it should display that your character has fainted when they lose. and at the start it should be "Go, insert character name here"

        //region CHARACTER CLASSES
        //
        //Classes: Rouge, Bard, Elf, cleric, druid, fighter, paladin, ranger, sorcerer.
        //
        //endregion


        //Character: name, hp, speed, baseAttack
        //everyone else extends and has own specials

        //Gamble or Betting class? would have the math for betting and coin system
        //hmmmmm, I think we'd have to do a parent and children classes cause each item has different uses.
        //We could do this?:
        //Healing Items: Name, amount healed, number of uses?
        //and have like the potions in pokemon: Potion, Super Potion, Hyper Potion, Full Heal.
        //I think it'd be simpler to just do seperate classes :P

        //What should I call it?

        //hmmm, I think either would work. but which would stick with proper conventions?
        //Item class to add the different items?hmmm
        //idk what would all of them have in common, name?
        //would that be better as parent child or one class?
        //hold on i got like six things going all of a sudden lolaaaa
        //cause we can either use potion as the parent becuase it's just a basic potion
        //oof yeah we could make one and make one for the character classes so it doesn't look like a lot lol
        //uhh just potions and then characters maybe? idk or potion and character

        //can choose which characters to fight each other?
        //show "battle" and who won
        //show their stats as they attack, maybe show who attacking too

        //Include a way to allow the character to manually take turns? Like, enter a key to take turns. yeah.
        //have an auto or turns option

        //oh so like we give attack options and stuff. we making full on game now lol, wait when is the last day to sign up
        //if we can finish it then i'd be ok with it
        //we could also have a not button but idk like what you said, to enable or disable auto mode.yesss
        //"Turn-based gladiator arena" idk lol

        //oh wait this just idea, what if we make it like pokemon where your character keeps
        //their health after the battle and then you can heal it?

        //that'd be cool! soo, add healing items? like, theres a random chance you get one. if we have the time, yeah!

        //you can get coins for the battles and then use them to buy healing items? maybe? coool

        //controller
        //model
        //view

        //run method from controller
    }
}
