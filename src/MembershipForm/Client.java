package MembershipForm;

public class Client{
    public static PersonalDetails personalDetails;
    private PaymentDetails paymentDetails;
    public static MembershipDetails membershipDetails;


    public static PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public static MembershipDetails getMembershipDetails() {
        return membershipDetails;
    }

    public void setMembershipDetails(MembershipDetails membershipDetails) {
        this.membershipDetails = membershipDetails;
    }
}
