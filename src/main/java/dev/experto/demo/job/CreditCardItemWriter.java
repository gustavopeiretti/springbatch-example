package dev.experto.demo.job;

import dev.experto.demo.domain.CreditCardRisk;
import dev.experto.demo.repository.CreditCardRiskRespository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CreditCardItemWriter implements ItemWriter<CreditCardRisk> {

    @Autowired
    private CreditCardRiskRespository respository;

    @Override
    public void write(List<? extends CreditCardRisk> list) throws Exception {
        respository.saveAll(list);
    }
}
