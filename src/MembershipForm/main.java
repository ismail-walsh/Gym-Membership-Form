package MembershipForm;

import javax.swing.*;

public class main {

    public static void main(String[] args) {

        JFrame frameIntro = new IntroGUI("Capgemini Gym Intro");
        JFrame framePersonal = new PersonalDetailsGUI("Capgemini Gym Personal");
        JFrame frameMembership = new MembershipDetailsGUI("Capgemini Gym Membership");
        JFrame framePayment = new MembershipDetailsGUI("Capgemini Gym Payment");
        JFrame frameSummary = new SummaryDetailsGUI("Summary");
        JFrame frameThanks = new ThankYouPageGUI("Summary");
        frameIntro.setSize(1650,1080);
        frameIntro.setVisible(true);
        framePersonal.setVisible(false);
        frameMembership.setVisible(false);
        framePayment.setVisible(false);
        frameSummary.setVisible(false);
        frameThanks.setVisible(false);




    }
}