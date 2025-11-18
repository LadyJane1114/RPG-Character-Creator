package Classes;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class Hammer extends Weapon{
    private ImageIcon hammerPic;
    private static final Random rand = new Random();

    public Hammer() {
        super("Hammer",0, 0);  // Initial values, replaced by rollStats()
        this.hammerPic = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/Images/hammer.png")));
        rollStats(); // Set initial randomized stats
    }

    @Override
    public void rollStats() {
        this.setWeight(rand.nextInt(3) + 2);
        this.setDamage(rand.nextInt(2) + 6);
    }


    public ImageIcon getHammerPic() {return hammerPic;}
    public void setHammerPic(ImageIcon hammerPic) {this.hammerPic = hammerPic;}

    public static String getWeaponInfo() {
        return "A hammer is good for way more for just building a house..." +
                "It's also good for tearing one down.";
    }
}
