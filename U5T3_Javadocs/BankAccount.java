package test;

/** 
 * This class represents a BankAccount object
 * 
 * @author Cherine Soewignjo
 */

public class BankAccount{
    /** The type of account BankAccount is */
    private String accountType;
    /** The balance of the BankAccount */
    private double balance;

    /** Instantiates a BankAccount object
     * 
     * @param accountType the type of account
     * @param balance the balance of the account
     */
    public BankAccount(String accountType, double balance) {
      this.accountType = accountType;
      this.balance = balance;
    }

    /**
     * Returns the current balance of the account, rounded to the nearest hundredth
     * 
     * @return the current balance of the account
     */
    public double getBalance() {
      return roundToHundredth(balance);
    }

    /**
     * Deposits an amount into the account object (rounded to the nearest hundredth)
     * 
     * @param amount the amount being deposited
     */
    public void deposit(double amount) {
      balance += roundToHundredth(amount);
    }

    /**
     * Withdraws an amount from the account object (rounded to the nearest hundredth),
     * should not withdraw an amount into the account if the account is overdrawn
     * 
     * @param amount the amount being withdrawn
     */
    public void withdraw(double amount) {
      balance -= roundToHundredth(amount);
    }

    /**
     * Returns a given number rounded to the nearest hundredth 
     * 
     * @param round number that needs to be rounded to the nearest hundredth
     * @return number rounded to the nearest hundredth
     */
    public double roundToHundredth(double round) {
      round = Math.round(round * 100.0) / 100.0;
      return round;
    }
}