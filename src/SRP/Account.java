package SRP;
import java.util.*;
import java.io.*;

public class Account {
    private String userName;
    private int accountNumber;
    private int totalAmount;

    public void addUserName(String userName){
        this.userName = userName;
    }

    public void addAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void addTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getUserName(){
        return this.userName;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getTotalAmount(){
         return this.totalAmount;
    }

}