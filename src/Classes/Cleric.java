package Classes;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class Cleric extends Hero {
    private ImageIcon clericPic;
    private static final Random rand = new Random();

    public Cleric(String name, Weapon weapon) {
        super(name, weapon, 0, 0, 0, 0);
        this.clericPic = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/Images/cleric.png")));
        rollStats();
    }
    @Override
    public void rollStats() {
        this.setHitPoints(rand.nextInt(26) + 10);
        this.setDefense(rand.nextInt(8) + 5);
        this.setAgility(rand.nextInt(5) + 3);
        this.setAttackMod(rand.nextInt(5) + 3);
    }

    public ImageIcon getClericPic() {return clericPic;}
    public void setClericPic(ImageIcon clericPic) {this.clericPic = clericPic;}

    @Override
    public ImageIcon getHeroImage() {
        return clericPic;
    }

    @Override
    public String toString() {
        return String.format("Player : %-10s\n---------------------\n" +
                        "Class  : %-10s\n" +
                        "HP     : %-3d\tDefense : %-3d\tAgility : %-3d\t Attack Mod: +%-3d\n" +
                        "Weapon : %-13s\tWeight : %-3d\tDamage: %-3d\n" +
                        "\n\n",
                super.getName(),
                "Cleric",
                super.getHitPoints(),
                super.getDefense(),
                super.getAgility(),
                super.getAttackMod(),
                this.getWeapon().getWeaponName(),
                this.getWeapon().getWeight(),
                this.getWeapon().getDamage())
                ;}

    public static String getHeroInfo() {
        return "Clerics will blessed you with divine power... if you can get past their holier-than-thou attitudes.";
    }
    public String getWeaponInfo() {
        return null;
    }


}
