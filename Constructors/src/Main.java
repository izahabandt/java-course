    public class Main {

        public static void main(String[] args) {



//            BankAccount bobsAccount = new BankAccount();
//            BankAccount bobsAccount = new BankAccount("12345", 500.00,
//                    "Bob Brown", "bob@bob.com","222222");

            BankAccount bobsAccount = new BankAccount();

            System.out.println(bobsAccount.getAccountNumber());
            System.out.println(bobsAccount.getAccountBalance());

            bobsAccount.withdrawFunds(100);
            bobsAccount.depositFunds(100);

            BankAccount timsAccount = new BankAccount("Tim", "tim@tim.com", "12345");
            System.out.println("AccountNo: " + timsAccount.getAccountNumber() + "; name" + timsAccount.getCustomerName());
//
//            bobsAccount.setAccountNumber("111111");
//            bobsAccount.setAccountBalance(1000);
//            bobsAccount.setCustomerName("Bob");
//            bobsAccount.setEmail("bob@bob.com");
//            bobsAccount.setPhoneNumber("222222");
        }
    }

