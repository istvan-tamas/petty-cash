package dev.exonbyte.pettycash.model;

import dev.exonbyte.pettycash.interfaces.Finance;
import org.springframework.stereotype.Component;

@Component
public class BusinessFinance implements Finance {
    @Override
    public String getFinances() {
        return "Business balance: BROKE";
    }
}
