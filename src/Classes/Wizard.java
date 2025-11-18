package Classes;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class Wizard extends Hero {
    private ImageIcon wizardPic;
    private static final Random rand = new Random();

    public Wizard(String name, Weapon weapon) {
        super(name, weapon, 0, 0, 0, 0);
        this.wizardPic = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/Images/wizard.png")));
        rollStats();
    }
    @Override
    public void rollStats() {
        this.setHitPoints(rand.nextInt(16) + 10);
        this.setDefense(rand.nextInt(7) + 5);
        this.setAgility(rand.nextInt(5) + 3);
        this.setAttackMod(rand.nextInt(5) + 3);
    }

    public ImageIcon getWizardPic() {return wizardPic;}
    public void setWizardPic(ImageIcon wizardPic) {this.wizardPic = wizardPic;}

    @Override
    public ImageIcon getHeroImage() {
        return wizardPic;
    }

    @Override
    public String toString() {
        return String.format("Player : %-10s\n---------------------\n" +
                        "Class  : %-10s\n" +
                        "HP     : %-3d\tDefense : %-3d\tAgility : %-3d\t Attack Mod: +%-3d\n" +
                        "Weapon : %-13s\tWeight : %-3d\tDamage: %-3d" +
                        "\n\n",
                super.getName(),
                "Wizard",
                super.getHitPoints(),
                super.getDefense(),
                super.getAgility(),
                super.getAttackMod(),
                this.getWeapon().getWeaponName(),
                this.getWeapon().getWeight(),
                this.getWeapon().getDamage())
                ;}

    public static String getHeroInfo() {
        return "What wizards lack in hit points, they make up for in FIREBALLS.";
    }
    public String getWeaponInfo() {
        return null;
    }
}
