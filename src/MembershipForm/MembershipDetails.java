package MembershipForm;

public class MembershipDetails {
    public static String membershipNumber, membershipType;
    public static boolean membershipRenew, declaration;

    public static String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public void getMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public boolean isMembershipRenew() {
        return membershipRenew;
    }

    public void setMembershipRenew(boolean membershipRenew) {
        this.membershipRenew = membershipRenew;
    }

    public boolean isDeclaration() {
        return declaration;
    }

    public void setDeclaration(boolean declaration) {
        this.declaration = declaration;
    }
}
