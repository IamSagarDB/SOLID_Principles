package SRP;

import java.util.*;
import SRP.Account;

public class AccountManager {
    Map<Integer , Account> accountList = new HashMap<Integer , Account>();

    public void AddNewAccount(Account account){
        accountList.put(account.getAccountNumber(), account);
    }

    public void DeleteAccount(Account account){
        accountList.remove(account.getAccountNumber());
    }


    public void withdraw(Account account, int amount){
        Account accountDetail = accountList.get(account.getAccountNumber());
        accountDetail.addTotalAmount(amount);
        accountList.put(account.getAccountNumber(), accountDetail);
    }
}