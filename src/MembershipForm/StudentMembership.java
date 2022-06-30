package MembershipForm;

import java.sql.Date;

public class StudentMembership extends MembershipDetails{
    public static boolean studentConfirmation;
    public static String confirmationDate;

    public boolean isStudentConfirmation() {
        return studentConfirmation;
    }

    public void setStudentConfirmation(boolean studentConfirmation) {
        this.studentConfirmation = studentConfirmation;
    }

    public String getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(String confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public void getMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
