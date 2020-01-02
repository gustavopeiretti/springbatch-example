package dev.experto.demo.listener;

import dev.experto.demo.domain.CreditCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemReadListener;

public class CreditCardIItemReaderListener implements ItemReadListener<CreditCard> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreditCardIItemReaderListener.class);

    @Override
    public void beforeRead() {
        LOGGER.info("beforeRead");
    }

    @Override
    public void afterRead(CreditCard creditCard) {
        LOGGER.info("afterRead: " + creditCard.toString());
    }

    @Override
    public void onReadError(Exception e) {
        LOGGER.info("onReadError");
    }
}
