package br.employee.bank;

import br.utils.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "bank")
public class Bank extends BaseEntity {

    private String description;
}
