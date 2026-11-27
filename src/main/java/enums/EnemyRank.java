package enums;

public enum EnemyRank {
    NORMAL("Normal", 0, 0, 0),
    ELITE("Elite", 10,1,1),
    BOSS("Boss", 30,3,3)
    ;

    private final String enemyRankType;
    private final int startingHealthAddition;
    private final int expScalingAddition;
    private final int bonusDamageAddition;

    EnemyRank(String enemyRankType, int startingHealthAddition, int expScalingAddition,
              int bonusDamageAddition) {
        this.enemyRankType = enemyRankType;
        this.startingHealthAddition = startingHealthAddition;
        this.expScalingAddition = expScalingAddition;
        this.bonusDamageAddition = bonusDamageAddition;
    }

    public String getEnemyRankType() { return enemyRankType; }
    public int getStartingHealthAddition() { return startingHealthAddition; }
    public int getExpScalingAddition() { return expScalingAddition; }
    public int getBonusDamageAddition() { return bonusDamageAddition; }
}
