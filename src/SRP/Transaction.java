package SRP;

import java.util.HashMap;
import java.util.Map;

public class Transaction {
    Map<Integer , Account> accountList = new HashMap<Integer , Account>();

    public Transaction(Map<Integer, Account> accountList){
        this.accountList = accountList;
    }

    public void deposit(Account account, Integer amount){
        Account accountDetails = accountList.get(account.getAccountNumber());
        accountDetails.addTotalAmount(accountDetails.getTotalAmount() + amount);
        accountList.put(account.getAccountNumber(), accountDetails);
    }

    public void withdraw(Account account, int amount){
        Account accountDetail = accountList.get(account.getAccountNumber());
        accountDetail.addTotalAmount(amount);
        accountList.put(account.getAccountNumber(), accountDetail);
    }
}
