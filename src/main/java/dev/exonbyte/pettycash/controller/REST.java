package dev.exonbyte.pettycash.controller;

import dev.exonbyte.pettycash.interfaces.Finance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class REST {

    private Finance myFinance;

    @Autowired
    public REST(Finance theFinance){
        myFinance = theFinance;
    }

    @GetMapping("/")
    public String test(){
        return "test";
    }

    @GetMapping("/balance")
    public String balance(){
        return "Your balance is $0";
    }

    @GetMapping("/account")
    public String account(){
        return "Your account info:";
    }

    @GetMapping("/personal-finance")
    public String getPersonalFinance(){
        return myFinance.getFinances();
    }
}
