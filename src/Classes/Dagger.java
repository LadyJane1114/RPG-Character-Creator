package Classes;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class Dagger extends Weapon{
    private ImageIcon daggerPic;
    private static final Random rand = new Random();

    public Dagger() {
        super("Dagger",0, 0);  // Initial values, replaced by rollStats()
        this.daggerPic = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/Images/dagger.png")));
        rollStats(); // Set initial randomized stats
    }

    @Override
    public void rollStats() {
        this.setWeight(rand.nextInt(3) + 2);
        this.setDamage(rand.nextInt(2) + 2);
    }


    public ImageIcon getDaggerPic() {return daggerPic;}
    public void setDaggerPic(ImageIcon daggerPic) {this.daggerPic = daggerPic;}

    public static String getWeaponInfo() {
        return "A dagger is a light and fast weapon. " +
                "Perfect for those who want to sneak around..." +
                "Or those who have very weak arms.";
    }
}
