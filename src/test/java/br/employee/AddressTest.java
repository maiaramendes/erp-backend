package br.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressTest {

    @Test
    public void shouldReturnFullAddress() {
        final Address address = new Address();
        address.setCity("São José dos Campos");
        address.setState("São Paulo");
        address.setNeighborhood("Morumbi");
        address.setNumber("1134");
        address.setStreet("Rua Alves Teixeira");

        final String result = address.getAddressFormatted();

        assertEquals("Rua Alves Teixeira, 1134, Morumbi, São José dos Campos - São Paulo", result);
    }

    @Test
    public void shouldReturnFullAddressWithComplement() {
        final Address address = new Address();
        address.setCity("São José dos Campos");
        address.setState("São Paulo");
        address.setNeighborhood("Morumbi");
        address.setNumber("1134");
        address.setStreet("Rua Alves Teixeira");
        address.setComplement("casa 2");

        final String result = address.getAddressFormatted();

        assertEquals("Rua Alves Teixeira, 1134 - casa 2, Morumbi, São José dos Campos - São Paulo", result);
    }
}
