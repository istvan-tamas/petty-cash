package dev.exonbyte.pettycash.controller;

import dev.exonbyte.pettycash.interfaces.Finance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class REST {

    private Finance myFinance;
    private Finance anotherFinance;

    @Autowired
    public REST(@Qualifier("personalFinance")  Finance theFinance, @Qualifier("personalFinance") Finance theOtherFinance){
        myFinance = theFinance;
        anotherFinance = theOtherFinance;
    }


    @GetMapping("/")
    public String test(){
        return "test";
    }

    @GetMapping("/balance")
    public String balance(){
        return "Your balance is $0";
    }

    @GetMapping("/check")
    public String account(){
        return "beans " + (anotherFinance == theOtherFinance) ;
    }

    @GetMapping("/personal-finance")
    public String getPersonalFinance(){
        return myFinance.getFinances();
    }
}
