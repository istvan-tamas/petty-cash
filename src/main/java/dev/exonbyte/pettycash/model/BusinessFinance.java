package dev.exonbyte.pettycash.model;

import dev.exonbyte.pettycash.interfaces.Finance;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BusinessFinance implements Finance {
    @Override
    public String getFinances() {
        return "Business balance: BROKE";
    }
}
