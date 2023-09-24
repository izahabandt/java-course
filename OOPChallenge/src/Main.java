public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();

        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(100);

        bobsAccount.setAccountNumber("111111");
        bobsAccount.setAccountBalance(1000);
        bobsAccount.setCustomerName("Bob");
        bobsAccount.setEmail("bob@bob.com");
        bobsAccount.setPhoneNumber("222222");
    }
}