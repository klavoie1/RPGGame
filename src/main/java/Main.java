import entity.Enemy;
import entity.Player;
import enums.EnemyRank;
import item.Weapon;
import ui.Prompts;

import java.util.Scanner;

import static enums.ClassType.WARRIOR;
import static enums.ItemRarity.COMMON;
import static enums.ItemRarity.LEGENDARY;
import static enums.Race.ORC;
import static enums.WeaponType.SWORD;

class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Weapon weapon = new Weapon(COMMON, SWORD);
        Player player = new Player(
                Prompts.playerEnterName(scanner),
                Prompts.playerSelectCharacterRace(scanner),
                Prompts.playerSelectCharacterClass(scanner)
        );
        Enemy enemy = new Enemy("Orc Boss", ORC, WARRIOR, EnemyRank.BOSS);
        Enemy enemy1 = new Enemy("Orc Warrior", ORC, WARRIOR, EnemyRank.NORMAL);
        Weapon enemyWeapon = new Weapon(LEGENDARY, SWORD);

        player.takeDamage(weapon.weaponDamage());

        System.out.println(player.getStatsDisplay());

        System.out.println(player);

        System.out.println(weapon.weaponDamage());

        System.out.println(player.getStatsDisplay());

        System.out.println(weapon);

        Prompts.givePlayerSwordNameFromPlayer(scanner, weapon);

        System.out.println(weapon);
        System.out.println(weapon.weaponDamage());

        System.out.println(enemy.getStatsDisplay());
        System.out.println(enemy1.getStatsDisplay());

        System.out.println(enemyWeapon);
        System.out.println(enemyWeapon.weaponDamage());
    }
}
