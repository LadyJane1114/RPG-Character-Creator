package Classes;

import java.util.Random;

public abstract class Weapon {
    private String weaponName;
    private int weight;
    private int damage;
    private static final Random rand = new Random();


    public Weapon(String weaponName,int weight, int damage) {
        this.weaponName = weaponName;
        this.weight = weight;
        this.damage = damage;
    }
    public abstract void rollStats();

    public String getWeaponName() {return weaponName;}
    public void setWeaponName(String weaponName) {this.weaponName = weaponName;}
    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}
    public int getDamage() {return damage;}
    public void setDamage(int damage) {this.damage = damage;}
    //public abstract String getHeroInfo();
}
