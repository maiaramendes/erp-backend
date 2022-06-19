package br.employee.payment;

import br.employee.Employee;
import br.employee.bank.Bank;
import br.employee.enums.TypePix;
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
@Table(name = "payment_detail")
public class PaymentDetail extends BaseEntity {

    @OneToOne
    private Bank bank;

    private String ag;

    private String cc;

    private String op;

    @OneToOne
    private Employee employee;

    private String pix;

    @Enumerated(EnumType.STRING)
    private TypePix typePix;

}
