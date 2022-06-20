package br.user;

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
@Table(name = "users")
public class User extends BaseEntity {

    private String login;

    private String password;

    @OneToOne
    private Employee employee;

    @OneToOne
    private Permission permission;
}
