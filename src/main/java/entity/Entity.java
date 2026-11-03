package entity;

import enums.ClassType;
import enums.Race;

public abstract class Entity {

    private final String name;
    private final ClassType classType;
    private final Race race;
    private int currentHealth;
    private int maxHealth;
    private final int baseDefense;
    private int currentMana;
    private int maxMana;
    private int currentStamina;
    private int maxStamina;

    protected Entity(String name, Race race, ClassType classType) {

        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be null or blank!");
        if (race == null) throw new IllegalArgumentException("Race cannot be null!");
        if (classType == null) throw new IllegalArgumentException("ClassType cannot be null!");

        this.name = name;
        this.race = race;
        this.classType = classType;
        this.maxHealth = race.getInnateHealth() + classType.getStartingHealth();
        this.currentHealth = maxHealth;
        this.baseDefense = race.getInnateDefense();
        this.maxStamina = race.getInnateStamina() + classType.getStartingStamina();
        this.currentStamina = maxStamina;
        this.maxMana = race.getInnateMana() + classType.getStartingMana();
        this.currentMana = maxMana;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getCurrentStamina() {
        return currentStamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public ClassType getClassType() {
        return classType;
    }

    public Race getRace() {
        return race;
    }

    private void setCurrentHealth(int currentHealth) {
        this.currentHealth = Math.clamp(currentHealth, 0, maxHealth);
    }

    private void setCurrentMana(int currentMana) {
        this.currentMana = Math.clamp(currentMana, 0, maxMana);
    }

    private void setCurrentStamina(int currentStamina) {
        this.currentStamina = Math.clamp(currentStamina, 0, maxStamina);
    }

    private void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    private void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    private void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public void takeDamage(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Damage must be at least 0!");
        int damage = Math.max((amount - getBaseDefense()), 0);
        setCurrentHealth(currentHealth - damage);
    }

    public void heal(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount healed needs to be at least 0!");
        if (currentHealth == maxHealth) {
            System.out.println(getName() + " is at max health!");
        } else if (isDead()) {
            System.out.println(getName() + " is already dead!");
        } else setCurrentHealth(amount + currentHealth);
    }

    // Death method to keep track of Entities dead or not. Once an entity reaches currentHealth 0, then they are dead.
    // Something like the undead are considered "alive" by the backend, so they're not dead until currentHealth this 0.
    public boolean isDead() {
        return currentHealth == 0;
    }

    public boolean spendMana(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot spend negative mana!");

        if (isDead()) return false;

        if (getCurrentMana() < amount) {
            return false;
        } else {
            setCurrentMana(getCurrentMana() - amount);
            return true;
        }
    }
}
