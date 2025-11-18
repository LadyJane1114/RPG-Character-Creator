package Classes;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class Sword extends Weapon{
    private ImageIcon swordPic;
    private static final Random rand = new Random();

    public Sword() {
        super("Sword",0, 0);  // Initial values, replaced by rollStats()
        this.swordPic = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/Images/sword.png")));
        rollStats(); // Set initial randomized stats
    }

    @Override
    public void rollStats() {
        this.setWeight(rand.nextInt(3) + 2);
        this.setDamage(rand.nextInt(2) + 3);
    }

    public ImageIcon getSwordPic() {return swordPic;}
    public void setSwordPic(ImageIcon swordPic) {this.swordPic = swordPic;}

    public static String getWeaponInfo() {
        return "The sword is a classic weapon. Just remember to stick 'em with the pointy end.";
    }
}
