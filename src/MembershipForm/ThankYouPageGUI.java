package MembershipForm;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class ThankYouPageGUI extends JFrame {
    private JPanel thanksPanel;
    private JPanel rightPanel;
    private JButton nextButton;
    private JLabel labelPic2;
    private JLabel labelPic;
    private JLabel labelMotto;
    private JProgressBar progressBar1;
    private JLabel txtDateJoined;

    public ThankYouPageGUI(String title) {

        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(thanksPanel);
        this.pack();

        //Importing images into JLabels
        BufferedImage img = null;
        BufferedImage imglogo = null;

        try {
            img = ImageIO.read(new File("Capgemini sheet logo.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            imglogo = ImageIO.read(new File("Cap.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert img != null;
        Image dimg = img.getScaledInstance(600, 1024,
                Image.SCALE_SMOOTH);
        Image cimg = imglogo.getScaledInstance(600, 200,
                Image.SCALE_SMOOTH);
        ImageIcon leftPage = new ImageIcon(dimg);
        labelPic.setIcon(leftPage);
        ImageIcon topLogo = new ImageIcon(cimg);
        labelPic2.setIcon(topLogo);

        //Upon clicking the Next User button
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                thanksPanel.setVisible(false);
                JFrame frameMembership = new IntroGUI("Welcome to MyGym");
                frameMembership.setSize(1650, 1080);
                frameMembership.setVisible(true);

                Client.getMembershipDetails();
                Client.getPersonalDetails();
            }
        });
    }

}
