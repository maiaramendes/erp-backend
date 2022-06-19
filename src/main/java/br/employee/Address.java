package br.employee;

import br.utils.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "address")
public class Address extends BaseEntity {

    private String street;

    private String number;

    private String neighborhood;

    private String zipCode;

    private String city;

    private String state;

    private String complement;

    public String getAddressFormatted() {
        if (complement == null) {
            return String.format("%s, %s, %s, %s - %s", street, number, neighborhood, city, state);
        }
        return String.format("%s, %s - %s, %s, %s - %s", street, number, complement, neighborhood, city, state);
    }

}
