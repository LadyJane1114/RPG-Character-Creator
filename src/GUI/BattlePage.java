package GUI;

import Classes.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Objects;
import java.util.Random;

public class BattlePage extends JPanel {
    private JLabel heroImageLabel, monsterImageLabel;
    private JTextArea displayText;
    private Monster monster;
    private Hero hero;

    public BattlePage(MainFrame frame, Hero hero) {
        this.hero = hero;
        setLayout(null);
        setBackground(new Color(255, 161, 130));

        Font titleFont = new Font("Harrington", Font.BOLD,40);
        Font subtitleFont = new Font("Harrington", Font.BOLD, 24);
        Font infoFont = new Font("Bradley Hand ITC", Font.BOLD, 20);

        Color borderMain = new Color(227, 115, 77);
        Color borderHighlight = new Color(255, 190, 168);
        Color borderShadow = new Color(140, 67, 42);

        JLabel title = new JLabel("Roll Initiative!");
        title.setFont(titleFont);
        title.setBounds(270, 20, 400, 50);
        add(title);

        heroImageLabel = new JLabel();
        heroImageLabel.setBounds(200, 125, 150, 150);
        add(heroImageLabel);

        monsterImageLabel = new JLabel();
        monsterImageLabel.setBounds(500, 125,150, 150);
        add(monsterImageLabel);

        displayText = new JTextArea();
        displayText.setBounds(40, 320, 750, 375);
        displayText.setFont(infoFont);
        displayText.setLineWrap(true);
        displayText.setWrapStyleWord(true);
        displayText.setBorder(BorderFactory.createCompoundBorder(
                new BevelBorder(BevelBorder.RAISED, borderHighlight, borderShadow),
                new LineBorder(borderMain, 20)
        ));
        add(displayText);

        JButton backButton = new JButton("Back to Character Selection");
        backButton.setBounds(200, 710, 400, 50);
        backButton.setFont(subtitleFont);
        add(backButton);

        backButton.addActionListener(e -> frame.showPage("HeroCreation"));

        generateBattleText();
    }

    private void generateBattleText() {
        if (hero == null) {
            displayText.setText("No hero has been created yet!");
            return;
        }

        Random rand = new Random();
        int monsterIndex = rand.nextInt(3);

        switch (monsterIndex) {
            case 0:
                monster = new Monster(
                        "Beholder",
                        180,
                        18,
                        5);
                monsterImageLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/monster1.jpg"))));
                break;
            case 1:
                monster = new Monster(
                        "Displacer Beast",
                        85,
                        13,
                        6);
                monsterImageLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/monster2.jpg"))));
                break;
            case 2:
                monster = new Monster(
                        "Owlbear",
                        59,
                        13,
                        7);
                monsterImageLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/monster3.jpg"))));
                break;
        }

        heroImageLabel.setIcon(hero.getHeroImage());

        displayText.setText(hero.toString());
        displayText.append("\n" + String.format("""
                                Monster Name : %-10s
                                ---------------------
                                HP: %-3d\tDefence: %-3d\tAttack Mod: +%-3d
                                
                                Prepare for battle!""",
                monster.getMonName(),
                monster.getMonHP(),
                monster.getMonAC(),
                monster.getMonAtt()));
    }
}
