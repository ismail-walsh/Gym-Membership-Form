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

public class PaymentDetailsGUI extends JFrame {
    private JPanel mainPanel;
    private JPanel rightPanel;
    private JButton nextButton;
    private JCheckBox chkPayAddress;
    private JLabel labelPic;
    private JLabel labelPic2;
    private JProgressBar progressBar1;
    private JLabel visaLabel;
    private JPanel paymentPanel;
    private JTextField txtCardNumber;
    private JTextField txtCardName;
    private JTextField txtSC;
    private JTextField txtAccount;
    private JTextField txtExpire;
    private JTextField txtCVV;
    private JButton goBackButton;
    private JLabel errorLabel1;


    public PaymentDetailsGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        errorLabel1.setVisible(false);
        BufferedImage img = null;
        BufferedImage imglogo = null;
        BufferedImage visaimg = null;

        try {
            visaimg = ImageIO.read(new File("VISA.jpeg"));
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
        Image cimg = imglogo.getScaledInstance(600, 200,
                Image.SCALE_SMOOTH);
        Image eimg = visaimg.getScaledInstance(600, 100,
                Image.SCALE_SMOOTH);
        ImageIcon leftPage = new ImageIcon(dimg);
        labelPic.setIcon(leftPage);
        ImageIcon topLogo = new ImageIcon(cimg);
        labelPic2.setIcon(topLogo);
        ImageIcon visa = new ImageIcon(eimg);
        visaLabel.setIcon(visa);



        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean Entry = txtCardName.getText().isEmpty() && txtCardNumber.getText().isEmpty() && txtSC.getText().isEmpty() && txtExpire.getText().isEmpty() && txtCVV.getText().isEmpty() && txtAccount.getText().isEmpty();
                if (Entry == true){
                    errorLabel1.setVisible(true);
                }
                while (Entry == false) {

                    PaymentDetails.cardName = txtCardName.getText();
                    PaymentDetails.cardNumber = txtCardNumber.getText();
                    PaymentDetails.sortCode = txtSC.getText();
                    PaymentDetails.accountNumber = txtAccount.getText();
                    PaymentDetails.expiryDate = txtExpire.getText();
                    PaymentDetails.cvv = txtCVV.getText();

                    paymentPanel.setVisible(false);
                    JFrame frameMembership = new SummaryDetailsGUI("Summary");
                    frameMembership.setSize(1650, 1080);
                    frameMembership.setVisible(true);


                    //Test values are assigned
                    break;
                }
            }
        });

        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                paymentPanel.setVisible(false);
                JFrame frameMember = new MembershipDetailsGUI("Membership Details");
                frameMember.setSize(1650, 1080);
                frameMember.setVisible(true);

            }
        });
    }
}
