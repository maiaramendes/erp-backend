package br.employee.payment;

import br.employee.Employee;
import br.utils.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "payments")
public class Payment extends BaseEntity {

    @OneToOne
    private Employee employee;

    private Double amount;

}
