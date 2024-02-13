package dev.exonbyte.pettycash.config;

import dev.exonbyte.pettycash.interfaces.Finance;
import dev.exonbyte.pettycash.model.ExpensesFinance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FinanceConfig {
    @Bean
    public Finance expensesFinance(){
        return new ExpensesFinance();
    }
}
