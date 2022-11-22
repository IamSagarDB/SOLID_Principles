import java.util.*;
import SRP.Account;

public class AccountManager {
    Map<int , Account> accountList = new HashMap<int , Account>();

    public void AddNewAccount(Account account){
        accountList.put(account.getAccountNumber(), account);
    }

    public void DeleteAccount(Account account){
        accountList.remove(account.getAccountNumber());
    }


    public void withdraw(Account account, int amount){
        Account 
    }
}