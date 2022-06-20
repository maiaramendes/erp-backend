package br.employee.rescission;

import br.employee.Employee;
import br.employee.enums.RescissionReason;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "rescission")
public class Rescission {

    private RescissionReason rescissionReason;

    private Double amount;

    @OneToOne
    private Employee employee;

}
