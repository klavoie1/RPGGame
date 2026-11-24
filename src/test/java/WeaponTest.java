import enums.ItemRarity;
import enums.WeaponType;
import item.Weapon;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @ParameterizedTest(name = "{1} {0} deals {2}")
    @CsvSource({
            "SWORD, COMMON,    5", "SWORD, UNCOMMON,  6", "SWORD, RARE,      7", "SWORD, LEGENDARY, 8",
            "AXE,   COMMON,    3", "AXE,   UNCOMMON,  4", "AXE,   RARE,      5", "AXE,   LEGENDARY, 6",
            "BOW,   COMMON,    4", "BOW,   UNCOMMON,  5", "BOW,   RARE,      6", "BOW,   LEGENDARY, 7"
    })
    void damageIsBasePlusRarityBonus(WeaponType type, ItemRarity rarity, int expected) {
        assertEquals(expected, new Weapon(rarity, type).weaponDamage());
    }

    @Test
    void commonSwordGetsARandomName() {
        String name = new Weapon(ItemRarity.COMMON, WeaponType.SWORD).getWeaponName();
        assertNotNull(name);
        assertTrue(name.endsWith("Sword"), name);
    }

    @Test
    void uncommonSwordGetsAnUncommonName() {
        String name = new Weapon(ItemRarity.UNCOMMON, WeaponType.SWORD).getWeaponName();
        assertTrue(List.of("Steel Sword", "Silver Sword", "Refined Steel Sword").contains(name), name);
    }

    @Test
    void weaponWithoutNameListFallsBackToTypeName() {
        assertEquals("Axe", new Weapon(ItemRarity.LEGENDARY, WeaponType.AXE).getWeaponName());
    }

    @ParameterizedTest
    @CsvSource({"SWORD, Sword", "AXE, Axe", "BOW, Bow"})
    void labelComesFromWeaponType(WeaponType type, String expectedLabel) {
        assertEquals(expectedLabel, new Weapon(ItemRarity.COMMON, type).getLabel());
    }

    @Test
    void canBeRenamed() {
        Weapon weapon = new Weapon(ItemRarity.COMMON, WeaponType.SWORD);
        weapon.setWeaponName("Excalibur");
        assertEquals("Excalibur", weapon.getWeaponName());
    }

    @Test
    void rejectsMissingFields() {
        assertThrows(IllegalArgumentException.class, () -> new Weapon(null, WeaponType.SWORD));
        assertThrows(IllegalArgumentException.class, () -> new Weapon(ItemRarity.COMMON, null));
    }
}
