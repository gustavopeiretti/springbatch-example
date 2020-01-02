package dev.experto.demo.repository;

import dev.experto.demo.domain.CreditCardRisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRiskRespository extends JpaRepository<CreditCardRisk, Long> {
}
