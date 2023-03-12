package cursor.hw3_OOP;

public class Bank {
    private String bankName;
    private String bankCode;
    private Double moneyAmount;
    public static int amountOfAccounts = 0;


    public Bank(String bankName,String bankCode, final Double moneyAmount){
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.moneyAmount = 4000.00;


    }

    public void getMoneyInfo(){
        System.out.println("Total amount of money in " + this.bankName + " is " + this.moneyAmount);
    }
    static void getTotalAmountOfClients(BankClient bankClient){
        System.out.println("The total amount of clients is " + amountOfAccounts);
    }
    public void deleteAccount(Account account) {
        if (account.getAccountBalance() < 0){
            System.out.println("Account can not be removed. This client has a credit.");
            return;
        }
            moneyAmount = moneyAmount - account.getAccountBalance();
            amountOfAccounts --;
            System.out.println("Account was removed " + account.accountNumber);
    }

    public void addAccount(Account account){
        amountOfAccounts ++;
        moneyAmount = moneyAmount + account.getAccountBalance();
        System.out.println("Account was added " + " '" + account.accountNumber + "'");
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public static int getAmountOfAccounts() {
        return amountOfAccounts;

    }

    public static void setAmountOfAccounts(int amountOfAccounts) {
        Bank.amountOfAccounts = amountOfAccounts;
    }

    @Override
    public String toString() {
        return "Please see the bank info: " +
                "Bank Name: " + bankName +
                ", Bank Dode: " + bankCode +
                ", Money Amount: " + moneyAmount;
    }
}
