package MembershipForm;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class IntroGUI extends JFrame {
    private JPanel introPanel;
    private JPanel rightPanel;
    private JButton renewButton;
    private JTextField txtMemberNo;
    private JCheckBox txtMarketingConsent;
    private JLabel labelPic2;
    private JLabel labelPic;
    private JLabel labelMotto;
    private JProgressBar progressBar1;
    private JLabel txtUsername;
    private JButton signUp;
    private JLabel gymIcon;
    private JLabel errorLabel1;


    public IntroGUI(String title){
        super(title);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(introPanel);
        this.pack();
        errorLabel1.setVisible(false);

        BufferedImage img = null;
        BufferedImage imglogo = null;
        BufferedImage gym = null;

        try {
            gym = ImageIO.read(new File("dumbell3.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        Image eimg = gym.getScaledInstance(75, 75,
                Image.SCALE_SMOOTH);
        Image cimg = imglogo.getScaledInstance(600, 200,
                Image.SCALE_SMOOTH);
        ImageIcon leftPage = new ImageIcon(dimg);
        labelPic.setIcon(leftPage);
        ImageIcon topLogo = new ImageIcon(cimg);
        labelPic2.setIcon(topLogo);
        ImageIcon dumbell = new ImageIcon(eimg);
        gymIcon.setIcon(dumbell);


        renewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean Entry = txtMemberNo.getText().isEmpty();
                if (Entry == true){
                    errorLabel1.setVisible(true);
                }
                while (Entry == false){
                    errorLabel1.setVisible(true);
                    MembershipDetails.membershipRenew = true;
                    introPanel.setVisible(false);
                    JFrame framePersonal = new PersonalDetailsGUI("Capgemini Gym Personal");
                    framePersonal.setSize(1650,1080);
                    framePersonal.setVisible(true);

                    //Test values are assigned
                    System.out.println(MembershipDetails.membershipRenew);
                    break;
                }
            }
        });
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MembershipDetails.membershipRenew = false;
                introPanel.setVisible(false);
                JFrame framePersonal = new PersonalDetailsGUI("Capgemini Gym Personal");
                framePersonal.setSize(1650,1080);
                framePersonal.setVisible(true);

                //Test values are assigned
                System.out.println(MembershipDetails.membershipRenew);
            }
        });
    }
}




