import entity.Player;
import enums.ClassType;
import enums.Race;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    Player humanMage = new Player("Test_Mage", Race.HUMAN, ClassType.MAGE);
    Player humanWarrior = new Player("Test_Warrior", Race.HUMAN, ClassType.WARRIOR);
    Player humanRanger = new Player("Test_Ranger", Race.HUMAN, ClassType.RANGER);

    @Test
    public void givenPlayerDamage_WhenAttacked_thenReturnCurrentHealthAfter() {
        humanMage.takeDamage(15);
        humanWarrior.takeDamage(15);
        humanRanger.takeDamage(15);

        int actualMageHealth = humanMage.getCurrentHealth();
        int expectedMageHealth = 68;
        int actualWarriorHealth = humanWarrior.getCurrentHealth();
        int expectedWarriorHealth = 108;
        int actualRangerHealth = humanRanger.getCurrentHealth();
        int expectedRangerHealth = 78;

        Assert.assertEquals(expectedMageHealth, actualMageHealth);
        Assert.assertEquals(expectedWarriorHealth, actualWarriorHealth);
        Assert.assertEquals(expectedRangerHealth, actualRangerHealth);
    }

    @Test
    public void ensurePlayerHealthIsHealed() {
        humanMage.takeDamage(15);
        humanMage.heal(10);
        int actualHeal = humanMage.getCurrentHealth();
        int expectedHeal = 78;
        Assert.assertEquals(expectedHeal, actualHeal);
    }

}
