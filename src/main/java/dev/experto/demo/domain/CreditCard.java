package dev.experto.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cardNumber;
    private Date lastPay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getLastPay() {
        return lastPay;
    }

    public void setLastPay(Date lastPay) {
        this.lastPay = lastPay;
    }


    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", lastPay=" + lastPay +
                '}';
    }
}
