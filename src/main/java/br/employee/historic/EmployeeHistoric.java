package br.employee.historic;

import br.employee.Employee;
import br.employee.department.Department;
import br.employee.enums.ContractType;
import br.employee.role.Role;
import br.utils.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "employee_historic")
public class EmployeeHistoric extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private ContractType contractType;

    private Double salary;

    @OneToOne
    private Department department;

    @OneToOne
    private Role role;

    @OneToOne
    private Employee employee;

}
