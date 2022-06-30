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

public class SummaryDetailsGUI extends JFrame{
    private JPanel summaryPanel;
    private JPanel rightPanel;
    private JButton finishButton;
    private JLabel labelPic2;
    private JLabel labelPic;
    private JLabel labelMotto;
    private JLabel txtDob;
    private JProgressBar progressBar1;
    private JCheckBox chkAuthorisation;
    private JLabel txtTitle;
    private JLabel txtFullName;
    private JLabel txtAddress;
    private JLabel txtPostCode;
    private JLabel txtTelephone;
    private JLabel txtMobile;
    private JLabel txtWorkTel;
    private JLabel txtMarketing;
    private JLabel txtMembership;
    private JLabel txtMembershipNo;
    private JLabel txtLetter;
    private JLabel txtDate;
    private JLabel txtDeclaration;
    private JLabel txtCardHolder;
    private JLabel txtCardNumber;
    private JLabel txtSC;
    private JLabel txtAccountNo;
    private JLabel txtExpire;
    private JLabel txtCVV;
    private JLabel txtAnnualP;
    private JLabel txtFirstMonth;
    private JLabel txtDirectDeb;
    private JLabel txtFirstInstall;
    private JLabel txtDateJoined;
    private JButton goBackButton;
    private JLabel txtRenew;

    public SummaryDetailsGUI(String title) {

        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(summaryPanel);
        this.pack();

        //Personal Details
        txtTitle.setText(PersonalDetails.getTitle());
        txtFullName.setText(PersonalDetails.getFullName());
        txtAddress.setText(PersonalDetails.getAddress());
        txtPostCode.setText(PersonalDetails.getPostCode());
        txtTelephone.setText(PersonalDetails.getTelNo());
        txtMobile.setText(PersonalDetails.getMobile());
        txtWorkTel.setText(PersonalDetails.getWorkTel());
        txtDob.setText(PersonalDetails.dob);
        txtMarketing.setText(String.valueOf(PersonalDetails.isMarketingConsent()));

        //Membership Details
        txtMembership.setText(MembershipDetails.membershipType);
        txtMembershipNo.setText(MembershipDetails.getMembershipNumber());
        txtLetter.setText(String.valueOf(StudentMembership.studentConfirmation));
        txtDate.setText(StudentMembership.confirmationDate);
        txtDeclaration.setText(String.valueOf(Declaration.authorisation));
        txtRenew.setText(String.valueOf(MembershipDetails.membershipRenew));

        //Payment Details
        txtCardHolder.setText(PaymentDetails.cardName);
        txtCardNumber.setText(PaymentDetails.cardNumber);
        txtSC.setText(PaymentDetails.sortCode);
        txtAccountNo.setText((PaymentDetails.accountNumber));
        txtExpire.setText(PaymentDetails.expiryDate);
        txtCVV.setText(PaymentDetails.getCvv());
        txtAnnualP.setText("£255.00");
        txtFirstMonth.setText("£20");
        txtFirstInstall.setText("£35");
        txtDirectDeb.setText("£20p/m");
        txtDateJoined.setText(LocalDate.now().toString());

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

        //Upon clicking the Finish button
        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (chkAuthorisation.isSelected()) {
                    /*code will not progress unless customer has confirmed details*/

                    summaryPanel.setVisible(false);
                    JFrame frameMembership = new ThankYouPageGUI("Success!");
                    frameMembership.setSize(1650, 1080);
                    frameMembership.setVisible(true);

                    break;
                }
            }
        });

        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                summaryPanel.setVisible(false);
                JFrame framePayment = new PaymentDetailsGUI("Payment Details");
                framePayment.setSize(1650, 1080);
                framePayment.setVisible(true);

            }
        });
    }
}
