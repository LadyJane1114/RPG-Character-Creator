package GUI;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeroCreationPage extends JPanel {
    private Weapon selectedWeapon;
    private Hero hero;


    public HeroCreationPage(MainFrame frame) {
        setLayout(null);
        setBackground(new Color(255, 161, 130));

        Font titleFont = new Font("Harrington", Font.BOLD,40);
        Font subtitleFont = new Font("Harrington", Font.BOLD, 24);
        Font optionFont = new Font("Harrington", Font.BOLD,22);
        Font infoFont = new Font("Bradley Hand ITC", Font.BOLD, 20);

        JLabel title = new JLabel("Hero Generator");
        title.setFont(titleFont);
        title.setBounds(50, 20, 500, 50);
        add(title);

        JLabel nameLabel = new JLabel("Enter your Name: ");
        nameLabel.setFont(subtitleFont);
        nameLabel.setBounds(50, 70, 300, 50);
        add(nameLabel);

        JTextField nameText = new JTextField();
        nameText.setFont(infoFont);
        nameText.setBounds(260, 70, 200, 50);
        nameText.setMargin(new Insets(0,5, 0,0));
        add(nameText);

        // LEFT SIDE OF PAGE

        //---hero class
        JLabel heroType = new JLabel("Choose your Class:");
        heroType.setFont(subtitleFont);
        heroType.setBounds(50, 120, 300, 50);
        add(heroType);

        // Hero selection radio buttons
        JRadioButton rdoFighter = new JRadioButton("Fighter");
        rdoFighter.setBounds(50, 160, 150, 50);
        rdoFighter.setOpaque(false);
        rdoFighter.setFont(optionFont);
        add(rdoFighter);

        JRadioButton rdoWizard = new JRadioButton("Wizard");
        rdoWizard.setBounds(50, 210, 150, 50);
        rdoWizard.setOpaque(false);
        rdoWizard.setFont(optionFont);
        add(rdoWizard);

        JRadioButton rdoCleric = new JRadioButton("Cleric");
        rdoCleric.setBounds(50, 260, 150, 50);
        rdoCleric.setOpaque(false);
        rdoCleric.setFont(optionFont);
        add(rdoCleric);

        ButtonGroup heroGroup = new ButtonGroup();
        heroGroup.add(rdoFighter);
        heroGroup.add(rdoWizard);
        heroGroup.add(rdoCleric);

        //Hero image and text field
        JLabel heroImage = new JLabel();
        heroImage.setBounds(300, 170, 150, 150);
        add(heroImage);

        JTextArea heroInfoText = new JTextArea();
        heroInfoText.setFont(infoFont);
        heroInfoText.setBounds(50, 310, 405, 80);
        heroInfoText.setLineWrap(true);
        heroInfoText.setWrapStyleWord(true);
        heroInfoText.setMargin(new Insets(5,5, 5,5));
        add(heroInfoText);

        //-- Weapon choice
        JLabel weaponLabel = new JLabel("Select your Weapon");
        weaponLabel.setFont(subtitleFont);
        weaponLabel.setBounds(50, 400, 300, 50);
        add(weaponLabel);

        //--- weapon radio buttons
        JRadioButton rdoDagger = new JRadioButton("Dagger");
        rdoDagger.setBounds(50, 440, 150, 50);
        rdoDagger.setOpaque(false);
        rdoDagger.setFont(optionFont);
        add(rdoDagger);

        JRadioButton rdoSword = new JRadioButton("Sword");
        rdoSword.setBounds(50, 490, 150, 50);
        rdoSword.setOpaque(false);
        rdoSword.setFont(optionFont);
        add(rdoSword);

        JRadioButton rdoHammer = new JRadioButton("Hammer");
        rdoHammer.setBounds(50, 540, 150, 50);
        rdoHammer.setOpaque(false);
        rdoHammer.setFont(optionFont);
        add(rdoHammer);

        ButtonGroup weaponGroup = new ButtonGroup();
        weaponGroup.add(rdoDagger);
        weaponGroup.add(rdoHammer);
        weaponGroup.add(rdoSword);

        // weapon image and text
        JLabel weaponImage = new JLabel();
        weaponImage.setBounds(300, 425, 150, 150);
        add(weaponImage);

        JTextArea weaponInfoText = new JTextArea();
        weaponInfoText.setFont(infoFont);
        weaponInfoText.setBounds(50, 590, 405, 80);
        weaponInfoText.setLineWrap(true);
        weaponInfoText.setWrapStyleWord(true);
        weaponInfoText.setMargin(new Insets(5,5, 5,5));
        add(weaponInfoText);

        //RIGHT SIDE OF PAGE
        //weapon stats label
        JLabel HeroStatsLabel = new JLabel("Hero Stats:");
        HeroStatsLabel.setFont(subtitleFont);
        HeroStatsLabel.setBounds(500, 120, 300, 50);
        add(HeroStatsLabel);

        //----hp
        JLabel heroHP = new JLabel("Hit Points:");
        heroHP.setFont(optionFont);
        heroHP.setBounds(500, 170, 300, 30);
        add(heroHP);

        JTextField HPLabel = new JTextField();
        HPLabel.setFont(infoFont);
        HPLabel.setBounds(660, 170, 40, 30);
        HPLabel.setMargin(new Insets(0,2, 0,0));
        add(HPLabel);

        //----defense
        JLabel heroAC = new JLabel("Defense:");
        heroAC.setFont(optionFont);
        heroAC.setBounds(500, 205, 300, 30);
        add(heroAC);

        JTextField ACLabel = new JTextField();
        ACLabel.setFont(infoFont);
        ACLabel.setBounds(660, 205, 40, 30);
        ACLabel.setMargin(new Insets(0,2, 0,0));
        add(ACLabel);

        //---- agility
        JLabel heroINIT = new JLabel("Agility:");
        heroINIT.setFont(optionFont);
        heroINIT.setBounds(500, 240, 300, 30);
        add(heroINIT);

        JTextField INITLabel = new JTextField();
        INITLabel.setFont(infoFont);
        INITLabel.setBounds(660, 240, 40, 30);
        INITLabel.setMargin(new Insets(0,2, 0,0));
        add(INITLabel);

        //----attack mod
        JLabel heroAttack = new JLabel("Attack Bonus:");
        heroAttack.setFont(optionFont);
        heroAttack.setBounds(500, 275, 300, 30);
        add(heroAttack);

        JTextField AttackLabel = new JTextField();
        AttackLabel.setFont(infoFont);
        AttackLabel.setBounds(660, 275, 40, 30);
        AttackLabel.setMargin(new Insets(0,2, 0,0));
        add(AttackLabel);

        //reroll stats button
        JButton rerollStats = new JButton("Reroll!");
        rerollStats.setBounds(500, 320, 200, 50);
        rerollStats.setFont(optionFont);
        add(rerollStats);

        //-- Weapon Stats
        JLabel weaponStats = new JLabel("Weapon Stats:");
        weaponStats.setFont(subtitleFont);
        weaponStats.setBounds(500, 400, 300, 50);
        add(weaponStats);

        //--- weight
        JLabel weaponWeight = new JLabel("Weight: ");
        weaponWeight.setFont(optionFont);
        weaponWeight.setBounds(500, 460, 290, 30);
        add(weaponWeight);

        JTextField weightLabel = new JTextField();
        weightLabel.setFont(infoFont);
        weightLabel.setBounds(660, 460, 40, 30);
        weightLabel.setMargin(new Insets(0,2, 0,0));
        add(weightLabel);


        //--- damage
        JLabel weaponDMG = new JLabel("Damage: ");
        weaponDMG.setFont(optionFont);
        weaponDMG.setBounds(500, 500, 300, 30);
        add(weaponDMG);

        JTextField DMGLabel = new JTextField();
        DMGLabel.setFont(infoFont);
        DMGLabel.setBounds(660, 500, 40, 30);
        DMGLabel.setMargin(new Insets(0,2, 0,0));
        add(DMGLabel);


        // start battle button
        JButton startBattleButton = new JButton("Start Battle!");
        startBattleButton.setBounds(500, 600, 200, 60);
        startBattleButton.setFont(subtitleFont);
        add(startBattleButton);



        // ACTION LISTENERS
        startBattleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hero == null) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Stop! You can't go to battle without a hero!"
                    );
                    return;
                }
                frame.showBattlePage(hero);
            }
        });
        // heroes
        rdoFighter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rdoWizard.setSelected(false);
                rdoCleric.setSelected(false);

                selectedWeapon = new Sword();
                hero = new Fighter(nameText.getText(), selectedWeapon);
                BattlePage battlePage = new BattlePage(frame, hero);
                frame.add(battlePage);
                frame.repaint();
                heroImage.setIcon(((Fighter) hero).getFighterPic());
                heroInfoText.setText(Fighter.getHeroInfo());

                hero.rollStats();
                HPLabel.setText(""+ hero.getHitPoints());
                ACLabel.setText(""+ hero.getDefense());
                INITLabel.setText(""+ hero.getAgility());
                AttackLabel.setText("+"+hero.getAttackMod());
            }
        });

        rdoWizard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rdoFighter.setSelected(false);
                rdoCleric.setSelected(false);

                selectedWeapon = new Dagger();
                hero = new Wizard(nameText.getText(), selectedWeapon);
                BattlePage battlePage = new BattlePage(frame, hero);
                frame.add(battlePage);
                frame.repaint();
                heroImage.setIcon(((Wizard) hero).getWizardPic());
                heroInfoText.setText(Wizard.getHeroInfo());

                hero.rollStats();
                HPLabel.setText(""+ hero.getHitPoints());
                ACLabel.setText(""+ hero.getDefense());
                INITLabel.setText(""+ hero.getAgility());
                AttackLabel.setText("+"+hero.getAttackMod());
            }
        });

        rdoCleric.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rdoWizard.setSelected(false);
                rdoFighter.setSelected(false);

                selectedWeapon = new Hammer();
                hero = new Cleric(nameText.getText(), selectedWeapon);
                BattlePage battlePage = new BattlePage(frame, hero);
                frame.add(battlePage);
                frame.repaint();
                heroImage.setIcon(((Cleric) hero).getClericPic());
                heroInfoText.setText(Cleric.getHeroInfo());

                hero.rollStats();
                HPLabel.setText(""+ hero.getHitPoints());
                ACLabel.setText(""+ hero.getDefense());
                INITLabel.setText(""+ hero.getAgility());
                AttackLabel.setText("+"+ hero.getAttackMod());
            }
        });

        //Weapons
        rdoDagger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rdoHammer.setSelected(false);
                rdoSword.setSelected(false);

                Dagger weapon = new Dagger();
                weaponImage.setIcon(((Dagger) weapon).getDaggerPic());
                weaponInfoText.setText(Dagger.getWeaponInfo());

                weapon.rollStats();
                weightLabel.setText("" + weapon.getWeight());
                DMGLabel.setText("" + weapon.getDamage());

            }
        });

        rdoHammer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rdoDagger.setSelected(false);
                rdoSword.setSelected(false);

                Hammer weapon = new Hammer();
                weaponImage.setIcon(weapon.getHammerPic());
                weaponInfoText.setText(Hammer.getWeaponInfo());

                weapon.rollStats();
                weightLabel.setText("" + weapon.getWeight());
                DMGLabel.setText("" + weapon.getDamage());
            }
        });

        rdoSword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rdoDagger.setSelected(false);
                rdoHammer.setSelected(false);

                Sword weapon = new Sword();
                weaponImage.setIcon(weapon.getSwordPic());
                weaponInfoText.setText(Sword.getWeaponInfo());
                weightLabel.setText("" + weapon.getWeight());
                DMGLabel.setText("" + weapon.getDamage());

                weapon.rollStats();
            }
        });

        rerollStats.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hero != null && selectedWeapon != null) {
                    hero.rollStats();
                    HPLabel.setText(""+ hero.getHitPoints());
                    ACLabel.setText(""+ hero.getDefense());
                    INITLabel.setText(""+ hero.getAgility());
                    AttackLabel.setText("+"+ hero.getAttackMod());
                }

                if (selectedWeapon != null) {
                    selectedWeapon.rollStats();
                    weightLabel.setText("" + selectedWeapon.getWeight());
                    DMGLabel.setText("" + selectedWeapon.getDamage());
                }
            }
        });
    }

}
