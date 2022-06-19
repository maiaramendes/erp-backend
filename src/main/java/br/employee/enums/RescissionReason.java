package br.employee.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RescissionReason {
    COM_JUSTA_CAUSA("Justa causa"),
    SEM_JUSTA_CAUSA("Sem justa causa"),
    PELO_FUNCIONARIO("Pelo funcionário"),
    ACORDO_ENTRE_PARTES("Acordo entre partes"),
    DEMISSAO_CONSENSUAL("Demissão consensual");

    private String label;
}
