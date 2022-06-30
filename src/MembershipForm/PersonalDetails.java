package MembershipForm;

public class PersonalDetails{
    public static String title, fullName, address, postCode, telNo, mobile, dob, workTel;
    public static boolean marketingConsent;

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        PersonalDetails.title = title;
    }

    public static String getFullName() {
        return fullName;
    }

    public static void setFullName(String fullName) {
        PersonalDetails.fullName = fullName;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        PersonalDetails.address = address;
    }

    public static String getPostCode() {
        return postCode;
    }

    public static void setPostCode(String postCode) {
        PersonalDetails.postCode = postCode;
    }

    public static String getTelNo() {
        return telNo;
    }

    public static void setTelNo(String telNo) {
        PersonalDetails.telNo = telNo;
    }

    public static String getMobile() {
        return mobile;
    }

    public static void setMobile(String mobile) {
        PersonalDetails.mobile = mobile;
    }

    public static String getDob() {
        return dob;
    }

    public static void setDob(String dob) {
        PersonalDetails.dob = dob;
    }

    public static String getWorkTel() {
        return workTel;
    }

    public static void setWorkTel(String workTel) {
        PersonalDetails.workTel = workTel;
    }

    public static boolean isMarketingConsent() {
        return marketingConsent;
    }

    public static void setMarketingConsent(boolean marketingConsent) {
        PersonalDetails.marketingConsent = marketingConsent;
    }
}
