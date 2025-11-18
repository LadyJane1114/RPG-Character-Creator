package GUI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Objects;

public class TitlePage extends JPanel {
    public TitlePage(MainFrame frame) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(255, 161, 130));

        JLabel title = new JLabel("Dungeons and Dragons!", SwingConstants.CENTER);
        title.setFont(new Font("Harrington", Font.BOLD, 40));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(50));
        add(title);

        JLabel titleImage = new JLabel();
        titleImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(20));
        add(titleImage);
        titleImage.setIcon(new ImageIcon(
                Objects.requireNonNull(getClass().getResource("/Images/startPage.jpg"))
        ));
        titleImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        Color borderMain = new Color(227, 115, 77);
        Color borderHighlight = new Color(255, 190, 168);
        Color borderShadow = new Color(140, 67, 42);
        titleImage.setBorder(BorderFactory.createCompoundBorder(
                new BevelBorder(BevelBorder.RAISED, borderHighlight, borderShadow),
                new LineBorder(borderMain, 20)
        ));

        JButton startButton = new JButton("Let's Roll!");
        startButton.setFont(new Font("Harrington", Font.BOLD, 22));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createVerticalStrut(30));
        add(startButton);

        startButton.addActionListener(e -> frame.showPage("HeroCreation"));
    }
}
