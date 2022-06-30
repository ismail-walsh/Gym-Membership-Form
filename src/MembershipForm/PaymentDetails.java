package MembershipForm;

import java.math.BigDecimal;
import java.sql.Date;

public class PaymentDetails{
    public static BigDecimal annualPayment, firstMonthPay, directDebitAmount;
    public static Date dateJoined, firstInstalment;
    public static String cardNumber, cardName, sortCode, accountNumber, expiryDate, cvv;

    public static String getCvv() {
        return cvv;
    }

    public static void setCvv(String cvv) {
        PaymentDetails.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public BigDecimal getAnnualPayment() {
        return annualPayment;
    }

    public void setAnnualPayment(BigDecimal annualPayment) {
        this.annualPayment = annualPayment;
    }

    public BigDecimal getFirstMonthPay() {
        return firstMonthPay;
    }

    public void setFirstMonthPay(BigDecimal firstMonthPay) {
        this.firstMonthPay = firstMonthPay;
    }

    public BigDecimal getDirectDebitAmount() {
        return directDebitAmount;
    }

    public void setDirectDebitAmount(BigDecimal directDebitAmount) {
        this.directDebitAmount = directDebitAmount;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Date getFirstInstalment() {
        return firstInstalment;
    }

    public void setFirstInstalment(Date firstInstalment) {
        this.firstInstalment = firstInstalment;
    }
}
