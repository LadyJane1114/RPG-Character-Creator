package GUI;

import Classes.Hero;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private TitlePage titlePage;
    private HeroCreationPage heroCreationPage;
    private BattlePage battlePage;
    private Hero hero;

    public MainFrame() {
        setTitle("D&D Hero Creator");
        setSize(850,850);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        setContentPane(mainPanel);

        titlePage = new TitlePage(this);
        heroCreationPage = new HeroCreationPage(this);
        battlePage = new BattlePage(this, hero);

        mainPanel.add(titlePage, "Title");
        mainPanel.add(heroCreationPage, "HeroCreation");
        mainPanel.add(battlePage, "Battle");

        showPage("Title");
    }

    public void showBattlePage(Hero selectedHero) {
        if (selectedHero == null) {
            System.out.println("Error: Tried to start battle with null hero!");
            return;
        }

        this.hero = selectedHero;  // Store hero
        battlePage = new BattlePage(this, hero);
        mainPanel.add(battlePage, "Battle");
        cardLayout.show(mainPanel, "Battle");
    }

    public void showPage(String pageName) {
        cardLayout.show(mainPanel, pageName);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
