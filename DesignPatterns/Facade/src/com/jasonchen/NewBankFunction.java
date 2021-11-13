package com.jasonchen;

public class NewBankFunction {
    private OldBankFunction oldBankFunction;

    public NewBankFunction(){
        oldBankFunction = new OldBankFunction();
    }
    public float getBalance(String accountNumber, String phoneNumber){
        if (phoneNumber == ""){
            return 0.0f;
        }
        return oldBankFunction.getBalance(accountNumber);
    }
    public void addMoney(String accountNumber, String phoneNumber, float money){
        if (phoneNumber == ""){
            return;
        }
        oldBankFunction.getBalance(accountNumber);
    }
    public void removeMoney(String accountNumber, String phoneNumber, float money){
        if (phoneNumber == ""){
            return;
        }
        oldBankFunction.getBalance(accountNumber);
    }
}
