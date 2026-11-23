import enums.ItemRarity;
import enums.WeaponType;
import item.Weapon;

import org.junit.Assert;
import org.junit.Test;

public class InitialWeaponDamageOnCreationTest {

    @Test
    public void givenCommonSword_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponSword = new Weapon("Test Sword", ItemRarity.COMMON, WeaponType.SWORD);
        int actualDamage = weaponSword.weaponDamage();
        int expectedDamage = 5;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenUncommonSword_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponSword = new Weapon("Test Sword", ItemRarity.UNCOMMON, WeaponType.SWORD);
        int actualDamage = weaponSword.weaponDamage();
        int expectedDamage = 6;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenRareSword_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponSword = new Weapon("Test Sword", ItemRarity.RARE, WeaponType.SWORD);
        int actualDamage = weaponSword.weaponDamage();
        int expectedDamage = 7;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenLegendarySword_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponSword = new Weapon("Test Sword", ItemRarity.LEGENDARY, WeaponType.SWORD);
        int actualDamage = weaponSword.weaponDamage();
        int expectedDamage = 8;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenCommonAxe_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponAxe = new Weapon("Test Axe", ItemRarity.COMMON, WeaponType.AXE);
        int actualDamage = weaponAxe.weaponDamage();
        int expectedDamage = 3;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenUncommonAxe_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponAxe = new Weapon("Test Axe", ItemRarity.UNCOMMON, WeaponType.AXE);
        int actualDamage = weaponAxe.weaponDamage();
        int expectedDamage = 4;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenRareAxe_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponAxe = new Weapon("Test Axe", ItemRarity.RARE, WeaponType.AXE);
        int actualDamage = weaponAxe.weaponDamage();
        int expectedDamage = 5;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenLegendaryAxe_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponAxe = new Weapon("Test Axe", ItemRarity.LEGENDARY, WeaponType.AXE);
        int actualDamage = weaponAxe.weaponDamage();
        int expectedDamage = 6;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenCommonBow_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponBow = new Weapon("Test Bow", ItemRarity.COMMON, WeaponType.BOW);
        int actualDamage = weaponBow.weaponDamage();
        int expectedDamage = 4;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenUncommonBow_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponBow = new Weapon("Test Bow", ItemRarity.UNCOMMON, WeaponType.BOW);
        int actualDamage = weaponBow.weaponDamage();
        int expectedDamage = 5;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenRareBow_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponBow = new Weapon("Test Bow", ItemRarity.RARE, WeaponType.BOW);
        int actualDamage = weaponBow.weaponDamage();
        int expectedDamage = 6;
        Assert.assertEquals(expectedDamage, actualDamage);
    }

    @Test
    public void givenLegendaryBow_WhenSpawned_ThenCorrectDamage() {
        Weapon weaponBow = new Weapon("Test Bow", ItemRarity.LEGENDARY, WeaponType.BOW);
        int actualDamage = weaponBow.weaponDamage();
        int expectedDamage = 7;
        Assert.assertEquals(expectedDamage, actualDamage);
    }
}
