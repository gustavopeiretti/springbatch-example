package dev.experto.demo.job;

import dev.experto.demo.domain.CreditCard;
import dev.experto.demo.domain.CreditCardRisk;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class CreditCardItemProcessor implements ItemProcessor<CreditCard, CreditCardRisk> {

    @Override
    public CreditCardRisk process(CreditCard item) {

        LocalDate today = LocalDate.now();
        LocalDate lastDate = item.getLastPay().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        long daysBetween = DAYS.between(today, lastDate);

        int risk;
        if (daysBetween >= 20) {
            risk = CreditCardRisk.HIGH;
        } else if (daysBetween > 10) {
            risk = CreditCardRisk.LOW;;
        }else {
            risk = CreditCardRisk.NORMAL;;
        }

        CreditCardRisk creditCardRisk = new CreditCardRisk(item, new Date(), risk);
        return creditCardRisk;
    }
}
