package enums;

public enum EnemyType implements ItemType {
    BANDIT("Bandit"),
    PIRATE("Pirate"),
    WOLF("Wolf"),
    BEAR("Bear"),
    SMUGGLER("Smuggler"),
    THIEF("Thief"),
    ASSASSIN("Assassin")
    ;

    private final String enemyTypeName;

    EnemyType(String enemyTypeName) {
        this.enemyTypeName = enemyTypeName;
    }

    @Override
    public String getTypeName() {
        return enemyTypeName;
    }
}

