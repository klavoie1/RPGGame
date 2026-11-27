package entity;

import enums.EnemyType;
import enums.ItemRarity;
import item.NamePool;

import java.util.Map;

final class EnemyNames {
    static final NamePool<EnemyType> ENEMYNAMEPOOL = new NamePool<>(Map.of(
            EnemyType.BANDIT, Map.of(
                    ItemRarity.COMMON, new String[]{
                            "Bandit Recruit",
                            "Bandit Member"
                    }
            )
    ));
}
