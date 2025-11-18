package Classes;
import javax.swing.*;
import java.util.Random;

public abstract class Hero {
    private String name;
    private Weapon weapon;
    private int hitPoints;
    private int defense;
    private int agility;
    private int attackMod;
    private static final Random rand = new Random();

    public Hero(String name, Weapon weapon, int hitPoints, int defense, int agility, int attackMod) {
        this.name = name;
        this.weapon = weapon;
        this.hitPoints = hitPoints;
        this.defense = defense;
        this.agility = agility;
        this.attackMod = attackMod;
    }

    public abstract void rollStats();
//    public void rollStats() {
//        this.hitPoints = rand.nextInt(20) + 10;
//        this.defense = rand.nextInt(6) + 5;
//        this.agility = rand.nextInt(5) + 3;
//        this.attackMod = rand.nextInt(5) + 2;
//    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public Weapon getWeapon() {return weapon;}
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public int getHitPoints() {return hitPoints;}
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    public int getDefense() {return defense;}
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
    public int getAttackMod() {return attackMod;}
    public void setAttackMod(int attackMod) {
        this.attackMod = attackMod;
    }
    public abstract ImageIcon getHeroImage();
}
