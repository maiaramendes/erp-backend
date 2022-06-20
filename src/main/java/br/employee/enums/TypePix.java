package br.employee.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypePix {
    CPF_CNPJ("CPF ou CNPJ"),
    EMAIL("E-mail"),
    CELULAR("Celular"),
    CHAVE_ALEATORIA("Chave Aleatória");

    private String label;
}
