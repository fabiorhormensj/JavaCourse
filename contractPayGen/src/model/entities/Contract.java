package model.entities;

import java.time.LocalDate;

public class Contract {
    private Integer contractNumber;
    private LocalDate date;
    private Double totalValue;

    public Contract(Integer contractNumber, LocalDate date, Double totalValue) {
        this.contractNumber = contractNumber;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getContractNumber() {
        return contractNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }
}
