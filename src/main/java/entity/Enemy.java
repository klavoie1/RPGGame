package entity;

import enums.*;

public class Enemy extends Entity {
    public Enemy(String name, Race race, ClassType classType, EnemyRank enemyRank) {
        super(name, race, classType, healthFor(enemyRank));
    }

    /**
     * The health that the enemy adds to its base maxHealth. Checked here because it runs before super().
     */
    private static int healthFor(EnemyRank enemyRank) {
        if (enemyRank == null) throw new IllegalArgumentException("Enemy must have a Rank!");
        return enemyRank.getStartingHealthAddition();
    }
}
