package Classes;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class Fighter extends Hero {
    private ImageIcon fighterPic;
    private static final Random rand = new Random();

    public Fighter(String name, Weapon weapon) {
        super(name, weapon, 0, 0, 0, 0);
        this.fighterPic = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/Images/fighter.png")));
        rollStats();
    }

    @Override
    public void rollStats() {
        this.setHitPoints(rand.nextInt(30) + 10);
        this.setDefense(rand.nextInt(5) + 5);
        this.setAgility(rand.nextInt(3) + 3);
        this.setAttackMod(rand.nextInt(8) + 3);
    }

    public ImageIcon getFighterPic() {return fighterPic;}
    public void setFighterPic(ImageIcon fighterPic) {this.fighterPic = fighterPic;}

    @Override
    public ImageIcon getHeroImage() {
        return fighterPic;
    }

    @Override
    public String toString() {
        return String.format("Player : %-10s\n---------------------\n" +
                        "Class  : %-10s\n" +
                        "HP     : %-3d\tDefense : %-3d\tAgility : %-3d\t Attack Mod: +%-3d\n" +
                        "Weapon : %-13s\tWeight : %-3d\tDamage: %-3d" +
                        "\n\n",
                super.getName(),
                "Fighter",
                super.getHitPoints(),
                super.getDefense(),
                super.getAgility(),
                super.getAttackMod(),
                this.getWeapon().getWeaponName(),
                this.getWeapon().getWeight(),
                this.getWeapon().getDamage())
    ;}

    public static String getHeroInfo() {
        return "Noble warriors - perfect for first time players who just wanna hit stuff.";
    }
    public String getWeaponInfo() {
        return null;
    }
}
