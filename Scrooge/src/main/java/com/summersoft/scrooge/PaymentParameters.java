package com.summersoft.scrooge;

import java.util.Date;

public class PaymentParameters {

    private String operationType;
    private Date dateOfOperation;
    private double paymentSize;
    private String paymentCurrency;
    private String cardNumber;
    private double accountSize;
    private String accountCurrency;

    public PaymentParameters() {
        this.operationType = null;
        this.dateOfOperation = null;
        this.paymentSize = 0;
        this.paymentCurrency = null;
        this.cardNumber = null;
        this.accountSize = 0;
        this.accountCurrency = null;
    }

    /*public PaymentParameters(String operationType, Date dateOfOperation, double paymentSize,
                             String paymentCurrency, String cardNumber, double accountSize,
                             String accountCurrency) {
        this.operationType = operationType;
        this.dateOfOperation = dateOfOperation;
        this.paymentSize = paymentSize;
        this.paymentCurrency = paymentCurrency;
        this.cardNumber = cardNumber;
        this.accountSize = accountSize;
        this.accountCurrency = accountCurrency;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentParameters that = (PaymentParameters) o;

        if (Double.compare(that.accountSize, accountSize) != 0) return false;
        if (Double.compare(that.paymentSize, paymentSize) != 0) return false;
        if (accountCurrency != null ? !accountCurrency.equals(that.accountCurrency) : that.accountCurrency != null)
            return false;
        if (cardNumber != null ? !cardNumber.equals(that.cardNumber) : that.cardNumber != null)
            return false;
        if (dateOfOperation != null ? !dateOfOperation.equals(that.dateOfOperation) : that.dateOfOperation != null)
            return false;
        if (operationType != null ? !operationType.equals(that.operationType) : that.operationType != null)
            return false;
        /*if (paymentCurrency != null ? !paymentCurrency.equals(that.paymentCurrency) : that.paymentCurrency != null)
            return false;*/
        if (paymentCurrency == null)
            return that.paymentCurrency == null;
        else
            return paymentCurrency.equals(that.paymentCurrency);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = operationType != null ? operationType.hashCode() : 0;
        result = 31 * result + (dateOfOperation != null ? dateOfOperation.hashCode() : 0);
        temp = Double.doubleToLongBits(paymentSize);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (paymentCurrency != null ? paymentCurrency.hashCode() : 0);
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        temp = Double.doubleToLongBits(accountSize);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accountCurrency != null ? accountCurrency.hashCode() : 0);
        return result;
    }

    /*public String getOperationType() {
        return operationType;
    }

    public Date getDateOfOperation() {
        return dateOfOperation;
    }

    public double getPaymentSize() {
        return paymentSize;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAccountSize() {
        return accountSize;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }*/
}
