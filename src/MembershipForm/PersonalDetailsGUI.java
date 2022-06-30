package MembershipForm;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PersonalDetailsGUI extends JFrame{
    private JPanel personalPanel;
    private JPanel rightPanel;
    private JTextField txtFullName;
    private JButton nextButton;
    private JCheckBox txtMarketingConsent;
    private JLabel labelPic;
    private JLabel labelPic2;
    private JLabel labelMotto;
    private JTextField txtAddress1;
    private JTextField txtAddress2;
    private JTextField txtAddress3;
    private JTextField txtpostCode;
    private JTextField txtTelephone;
    private JTextField txtMobile;
    private JTextField txtWorktel;
    private JTextField txtDob;
    private JCheckBox txtMr;
    private JCheckBox txtMrs;
    private JCheckBox txtMiss;
    private JProgressBar progressBar1;
    private JCheckBox chckTC;
    private JButton goBackButton;
    private JLabel backButton;


    public PersonalDetailsGUI(String title){
        super(title);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(personalPanel);
        this.pack();
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


        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (chckTC.isSelected()) {
                    PersonalDetails.fullName = txtFullName.getText();
                    PersonalDetails.address = txtAddress1.getText() + ",\n" + txtAddress2.getText() + ",\n" + txtAddress3.getText();
                    PersonalDetails.postCode = txtpostCode.getText();
                    PersonalDetails.telNo = txtTelephone.getText();
                    PersonalDetails.mobile = txtMobile.getText();
                    PersonalDetails.workTel = txtWorktel.getText();
                    PersonalDetails.dob = txtDob.getText();
                    if (txtMarketingConsent.isSelected()) {
                        PersonalDetails.marketingConsent = true;
                    } else {
                        PersonalDetails.marketingConsent = false;
                    }
                    if (txtMarketingConsent.isSelected()) {
                        PersonalDetails.marketingConsent = true;
                    } else {
                        PersonalDetails.marketingConsent = false;
                    }
                    if (txtMr.isSelected()) {
                        PersonalDetails.title = "Mr";
                    } else if (txtMrs.isSelected()) {
                        PersonalDetails.title = "Mrs";
                    } else if (txtMiss.isSelected()) {
                        PersonalDetails.title = "Miss";
                    } else {
                        PersonalDetails.title = "Error, title not given.";
                    }

                    personalPanel.setVisible(false);
                    JFrame frameMembership = new MembershipDetailsGUI("Capgemini Gym Membership");
                    frameMembership.setSize(1650, 1080);
                    frameMembership.setVisible(true);


                    //Test values are assigned
                    System.out.println(PersonalDetails.title);
                    System.out.println(PersonalDetails.fullName);
                    System.out.println(PersonalDetails.address);
                    break;
                }
            }
        });


        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    personalPanel.setVisible(false);
                    JFrame frameIntro = new IntroGUI("Welcome to MyGym!");
                    frameIntro.setSize(1650, 1080);
                    frameIntro.setVisible(true);

            }
        });
    }
}
