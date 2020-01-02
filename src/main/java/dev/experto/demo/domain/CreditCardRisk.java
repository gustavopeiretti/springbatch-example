package dev.experto.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class CreditCardRisk {

    public static final int HIGH = 3;
    public static final int LOW = 2;
    public static final int NORMAL = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private int risk;

    @OneToOne(optional = false)
    private CreditCard creditCard;

    public CreditCardRisk() {
    }

    public CreditCardRisk(CreditCard creditCard, Date date, int risk) {
        this.creditCard = creditCard;
        this.date = date;
        this.risk = risk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "CreditCardRisk{" +
                "id=" + id +
                ", date=" + date +
                ", risk=" + risk +
                '}';
    }
}
