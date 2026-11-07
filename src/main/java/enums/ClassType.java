package enums;

public enum ClassType {
    MAGE("Mage",20, 60, 20),
    WARRIOR("Warrior", 60, 10, 30),
    RANGER("Ranger", 30,  20, 50);

    private final String className;
    private final int startingHealth;
    private final int startingMana;
    private final int startingStamina;


    /*
     * Returns the type of class that the @Entity is
     */
    ClassType(String className, int startingHealth, int startingMana, int startingStamina) {
        this.className = className;
        this.startingHealth = startingHealth;
        this.startingMana = startingMana;
        this.startingStamina = startingStamina;
    }

    public String getClassName() { return className; }
    public int getStartingHealth() { return startingHealth; }
    public int getStartingMana() { return startingMana; }
    public int getStartingStamina() { return startingStamina; }
}

