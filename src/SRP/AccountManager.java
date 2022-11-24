package SRP;

import java.util.*;
import SRP.Account;

public class AccountManager {
    Map<Integer , Account> accountList = new HashMap<Integer , Account>();

    public AccountManager(Map<Integer, Account> accountList){
        this.accountList = accountList;
    }
    public void AddNewAccount(Account account){
        accountList.put(account.getAccountNumber(), account);
    }

    public void DeleteAccount(Account account){
        accountList.remove(account.getAccountNumber());
    }

    /**
     This function should not be part of Account .
     as this is part of Transaction

     this will violate SRP
     */
    public void withdraw(Account account, int amount){
        Account accountDetail = accountList.get(account.getAccountNumber());
        accountDetail.addTotalAmount(amount);
        accountList.put(account.getAccountNumber(), accountDetail);
    }
}