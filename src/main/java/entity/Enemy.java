package entity;

import enums.ClassType;
import enums.Race;

public class Enemy extends Entity {


    public Enemy(String name, Race race, ClassType classType) {
        super(name, race, classType);
    }

    public String printEnemyStats() {
        return (
                "-------------------------\n" +
                "Name: " + this.getName() + "\n" +
                "Race: " + this.getRace().getRaceName() + "\n" +
                "Class: " + this.getClassType().getClassName() + "\n" +
                "-------------------------\n" +
                "Health:  " + this.getCurrentHealth() + " / " + this.getMaxHealth() + "\n"+
                "Stamina: " + this.getCurrentStamina() + " / " + this.getMaxStamina() + "\n" +
                "Mana:    " + this.getCurrentMana() + " / " + this.getMaxMana()+ "\n" +
                "Base Defense: " + this.getBaseDefense() + "\n" +
                "Total Defense: " + "TBD\n" +
                "-------------------------\n"
                );
    }
}
