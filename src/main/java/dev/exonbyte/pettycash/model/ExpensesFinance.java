package dev.exonbyte.pettycash.model;

import dev.exonbyte.pettycash.interfaces.Finance;

public class ExpensesFinance implements Finance{

    public ExpensesFinance(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getFinances() {
        return "You are broke";
    }
}
