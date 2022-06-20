package br.employee.department;

import br.utils.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "departments")
public class Department extends BaseEntity {

    private String description;
}
