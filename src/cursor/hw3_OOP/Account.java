package cursor.hw3_OOP;

public class Account {
    protected String accountNumber;
    private Double accountBalance;
    BankClient bankClient;
    Bank bank;

    public Account(){
    }
    public Account(String accountNumber, Double accountBalace, BankClient bankClient, Bank bank){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalace;
        this.bankClient = bankClient;
        this.bank = bank;
    }

    public void withdraw(double amount){
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BankClient getBankClient() {
        return bankClient;
    }

    public void setBankClient(BankClient bankClient) {
        this.bankClient = bankClient;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Please see the Account Information. " +
                "Account Number: " + accountNumber +
                ", Account Balance: " + accountBalance +
                ", Bank Client: " + bankClient +
                ", bank: " + bank;
    }
}
