package entity;

import enums.ClassType;
import enums.Race;

public class Player extends Entity {
     public Player(String name, Race race, ClassType classType) {
         super(name, race, classType);
     }

     public String playerStats() {
         return (
                 "-------------------------\n" +
                 "Name: " + this.getName() + "\n" +
                 "Race: " + this.getRace() + "\n" +
                 "Class: " + this.getClassType() + "\n" +
                 "-------------------------\n" +
                 "Health:  " + this.getCurrentHealth() + " / " + this.getMaxHealth() + "\n"+
                 "Stamina: " + this.getCurrentStamina() + " / " + this.getMaxStamina() + "\n" +
                 "Mana:    " + this.getCurrentMana() + " / " + this.getMaxMana()+ "\n" +
                 "Base Defense: " + this.getBaseDefense() + "\n" +
                 "Total Defense: " + "TBD"
                 );
     }
}

