package org.example;

import java.util.Random;
import java.util.Scanner;

class Player {
    String name;
    int health;
    int strength;
    int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public void updateStat(String stat, int value) {
        switch (stat.toLowerCase()) {
            case "health":
                this.health = value;
                break;
            case "strength":
                this.strength = value;
                break;
            case "attack":
                this.attack = value;
                break;
            default:
                System.out.println("Invalid stat");
        }
    }

    public void printStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Attack: " + attack);
    }
}

public class MagicalArena {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static boolean manualRolls = false;

    public static int getRoll(String playerName, String rollType) {
        if (manualRolls) {
            System.out.print(playerName + " " + rollType + " roll: ");
            return scanner.nextInt();
        } else {
            return random.nextInt(6) + 1;
        }
    }

    public static void fight(Player attacker, Player defender) {
        int attackRoll = getRoll(attacker.name, "attack");
        int defenseRoll = getRoll(defender.name, "defense");

        int attackDamage = attacker.attack * attackRoll;
        int defenseStrength = defender.strength * defenseRoll;

        int damageTaken = Math.max(0, attackDamage - defenseStrength);
        defender.health -= damageTaken;

        System.out.println(attacker.name + " rolls " + attackRoll + ", " + defender.name + " rolls " + defenseRoll);
        System.out.println("Attack damage: " + attackDamage + ", Defense strength: " + defenseStrength);
        System.out.println(defender.name + " health reduced by " + damageTaken + " to " + defender.health + "\n");
    }

    public static Player createPlayer(String playerName) {
        System.out.println("\nEnter stats for " + playerName + ":-> ");
        System.out.print("\s\sHealth: ");
        int health = scanner.nextInt();
        System.out.print("\s\sStrength: ");
        int strength = scanner.nextInt();
        System.out.print("\s\sAttack: ");
        int attack = scanner.nextInt();

        return new Player(playerName, health, strength, attack);
    }

    public static void updatePlayerStats(Player player) {
        while (true) {
            System.out.println("\nDo you want to change full stats or any specific stat of " + player.name + "? (full/specific/none): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("full")) {
                System.out.print("Health: ");
                player.health = scanner.nextInt();
                System.out.print("Strength: ");
                player.strength = scanner.nextInt();
                System.out.print("Attack: ");
                player.attack = scanner.nextInt();
                break;
            } else if (choice.equalsIgnoreCase("specific")) {
                System.out.print("Which stat do you want to change? (health/strength/attack): ");
                String stat = scanner.next();
                System.out.print("Enter new value for " + stat + ": ");
                int value = scanner.nextInt();
                player.updateStat(stat, value);
                break;
            } else if (choice.equalsIgnoreCase("none")) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter full, specific, or none.");
            }
        }
    }

    public static void main(String[] args) {
        Player playerA = createPlayer("Player A");
        Player playerB = createPlayer("Player B");

        while (true) {
            System.out.println("\nChoose roll mode:-> \n\s\s1 for Auto-random \n\s\s2 for Manual \nEnter your choice (1 or 2):-> ");
            int choice = scanner.nextInt();
            manualRolls = (choice == 2);

            while (playerA.health > 0 && playerB.health > 0) {
                if (playerA.health < playerB.health) {
                    fight(playerA, playerB);
                    if (playerB.health <= 0) {
                        System.out.println(playerA.name + " wins!");
                        break;
                    }
                    fight(playerB, playerA);
                    if (playerA.health <= 0) {
                        System.out.println(playerB.name + " wins!");
                        break;
                    }
                } else {
                    fight(playerB, playerA);
                    if (playerA.health <= 0) {
                        System.out.println(playerB.name + " wins!");
                        break;
                    }
                    fight(playerA, playerB);
                    if (playerB.health <= 0) {
                        System.out.println(playerA.name + " wins!");
                        break;
                    }
                }
            }

            System.out.println("Do you want to change Player A's stats? (yes/no): ");
            if (scanner.next().equalsIgnoreCase("yes")) {
                updatePlayerStats(playerA);
            }
            System.out.println("Do you want to change Player B's stats? (yes/no): ");
            if (scanner.next().equalsIgnoreCase("yes")) {
                updatePlayerStats(playerB);
            }

            System.out.println("Do you want to exit the game? (yes/no): ");
            String exitResponse = scanner.next();
            if (exitResponse.equalsIgnoreCase("yes")) {
                System.out.println("Exiting...");
                break;
            }
        }
        scanner.close();
    }
}
