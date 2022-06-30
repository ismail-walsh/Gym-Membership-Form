package MembershipForm;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MembershipDetailsGUI extends JFrame {
    private JPanel mainPanel;
    private JPanel rightPanel;
    private JButton nextButton;
    private JCheckBox txtStandard;
    private JLabel labelPic2;
    private JLabel labelPic;
    private JLabel labelMotto;
    private JProgressBar progressBar1;
    private JPanel membershipPanel;
    private JTextField txtDateReceived;
    private JCheckBox txtStudent;
    private JCheckBox txtStudentConfirmation;
    private JCheckBox txtAuthorisation;
    private JButton goBackButton;


    public MembershipDetailsGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
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
                while (txtAuthorisation.isSelected()) {
                    StudentMembership.confirmationDate = txtDateReceived.getText();

                    if (txtStandard.isSelected()) {
                        MembershipDetails.membershipType = "Standard";
                        MembershipDetails.membershipNumber = "STAN1234";
                    }
                    if (txtStudent.isSelected()) {
                        MembershipDetails.membershipType = "Student";
                        MembershipDetails.membershipNumber = "STU1234";
                    } else {
                        MembershipDetails.membershipType = "Standard";
                        MembershipDetails.membershipNumber = "DEF1234";
                    }
                    if (txtStudentConfirmation.isSelected()) {
                        StudentMembership.studentConfirmation = true;
                    } else {
                        StudentMembership.studentConfirmation = false;
                    }
                    if (txtAuthorisation.isSelected()) {
                        Declaration.authorisation = true;
                    } else {
                        Declaration.authorisation = false;

                    }

                    membershipPanel.setVisible(false);
                    JFrame frameMembership = new PaymentDetailsGUI("Capgemini Gym Payment");
                    frameMembership.setSize(1650, 1080);
                    frameMembership.setVisible(true);


                    //Test values are assigned
                    System.out.println(MembershipDetails.membershipNumber);
                    System.out.println(MembershipDetails.membershipType);
                    break;
                }
            }
        });

        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                membershipPanel.setVisible(false);
                JFrame framePersonal = new PersonalDetailsGUI("Personal Details");
                framePersonal.setSize(1650, 1080);
                framePersonal.setVisible(true);

            }
        });
    }
}
