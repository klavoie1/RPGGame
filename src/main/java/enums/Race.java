package enums;

public enum Race {
    HUMAN("Human", 60, 3, 40, 60),
    ORC("Orc", 80, 4, 20, 50),
    ELF("Elf", 50, 2, 75, 45);

    private final String raceName;
    private final int innateHealth;
    private final int innateDefense;
    private final int innateMana;
    private final int innateStamina;

    Race(String raceName, int innateHealth, int innateDefense, int innateMana,
         int innateStamina) {
        this.raceName = raceName;
        this.innateHealth = innateHealth;
        this.innateDefense = innateDefense;
        this.innateMana = innateMana;
        this.innateStamina = innateStamina;
    }

    public String getRaceName() { return raceName; }
    public int getInnateHealth() { return innateHealth; }
    public int getInnateDefense() { return innateDefense; }
    public int getInnateMana() { return innateMana; }
    public int getInnateStamina() { return innateStamina; }
}
