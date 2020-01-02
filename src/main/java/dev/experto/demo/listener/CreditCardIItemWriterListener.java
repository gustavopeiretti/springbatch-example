package dev.experto.demo.listener;

import dev.experto.demo.domain.CreditCardRisk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

public class CreditCardIItemWriterListener implements ItemWriteListener<CreditCardRisk> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreditCardIItemWriterListener.class);

    @Override
    public void beforeWrite(List<? extends CreditCardRisk> list) {
        LOGGER.info("beforeWrite");
    }


    @Override
    public void afterWrite(List<? extends CreditCardRisk> list) {
        for (CreditCardRisk creditCardRisk : list) {
            LOGGER.info("afterWrite :" + creditCardRisk.toString());
        }
    }

    @Override
    public void onWriteError(Exception e, List<? extends CreditCardRisk> list) {
        LOGGER.info("onWriteError");
    }
}
