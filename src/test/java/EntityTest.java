import entity.Player;
import enums.ClassType;
import enums.Race;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/** Human Mage: 80 health, 3 defense, 100 mana. */
class EntityTest {

    private final Player mage = new Player("Test_Mage", Race.HUMAN, ClassType.MAGE);

    @ParameterizedTest(name = "Human {0} has {1} health after 15 damage")
    @CsvSource({"MAGE, 68", "WARRIOR, 108", "RANGER, 78"})
    void damageIsReducedByDefense(ClassType classType, int expectedHealth) {
        Player player = new Player("Test", Race.HUMAN, classType);
        player.takeDamage(15);
        assertEquals(expectedHealth, player.getCurrentHealth());
    }

    @Test
    void damageAtOrBelowDefenseDoesNothing() {
        mage.takeDamage(3);
        assertEquals(80, mage.getCurrentHealth());
    }

    @Test
    void healthNeverGoesBelowZero() {
        mage.takeDamage(1000);
        assertEquals(0, mage.getCurrentHealth());
        assertTrue(mage.isDead());
    }

    @Test
    void negativeDamageIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> mage.takeDamage(-1));
    }

    @Test
    void healRestoresHealth() {
        mage.takeDamage(15);
        mage.heal(10);
        assertEquals(78, mage.getCurrentHealth());
    }

    @Test
    void healNeverExceedsMax() {
        mage.takeDamage(15);
        mage.heal(1000);
        assertEquals(80, mage.getCurrentHealth());
    }

    @Test
    void healAtFullHealthChangesNothing() {
        mage.heal(10);
        assertEquals(80, mage.getCurrentHealth());
    }

    @Test
    void deadEntityCannotBeHealed() {
        mage.takeDamage(1000);
        mage.heal(50);
        assertEquals(0, mage.getCurrentHealth());
    }

    @Test
    void newEntityIsAlive() {
        assertFalse(mage.isDead());
    }

    @Test
    void spendManaReducesMana() {
        assertTrue(mage.spendMana(40));
        assertEquals(60, mage.getCurrentMana());
    }

    @Test
    void cannotSpendMoreManaThanAvailable() {
        assertFalse(mage.spendMana(101));
        assertEquals(100, mage.getCurrentMana());
    }

    @Test
    void canSpendExactlyAllMana() {
        assertTrue(mage.spendMana(100));
        assertEquals(0, mage.getCurrentMana());
    }

    @Test
    void deadEntityCannotSpendMana() {
        mage.takeDamage(1000);
        assertFalse(mage.spendMana(1));
    }

    @Test
    void negativeManaSpendIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> mage.spendMana(-50));
    }

    @Test
    void rejectsMissingFields() {
        assertThrows(IllegalArgumentException.class, () -> new Player(" ", Race.HUMAN, ClassType.MAGE));
        assertThrows(IllegalArgumentException.class, () -> new Player("Test", null, ClassType.MAGE));
        assertThrows(IllegalArgumentException.class, () -> new Player("Test", Race.HUMAN, null));
    }
}
