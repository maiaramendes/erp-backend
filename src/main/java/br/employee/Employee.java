package br.employee;

import br.utils.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "employees")
public class Employee extends BaseEntity {

    private String name;

    private Long age;

    private LocalDateTime birthdayAt;

    @OneToOne
    private Address address;

    private String rg;

    private String cpf;

    private String cnpj;

    private LocalDateTime joinedAt;

    private Boolean status;

}
