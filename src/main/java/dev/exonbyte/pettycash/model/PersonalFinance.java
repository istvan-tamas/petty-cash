package dev.exonbyte.pettycash.model;

import dev.exonbyte.pettycash.interfaces.Finance;
import org.springframework.stereotype.Component;

@Component
public class PersonalFinance implements Finance {
    @Override
    public String getFinances(){
        return "financial statement: BROKE";
    }
}
