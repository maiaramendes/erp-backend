package br.employee.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ContractType {
    CLT("CLT"),
    ESTAGIARIO("Estagiário"),
    MENOR_APRENDIZ("Menor Aprendiz"),
    TEMPORARIO("Temporário"),
    PRESTADOR_SERVICOS("Prestador de Serviços");

    private String label;
}
