package com.wheresmymoney.model.enuns;

public enum TypeExpense {
    GAS("Combustivel"),
    MARKET("Alimentação"),
    CHEERS("Saúde"),
    LEISURE("Lazer"),
    OTHER("Outros");

    private String description;

    TypeExpense(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
