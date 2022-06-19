package br.employee.timesheet;

import br.employee.Employee;
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
@Table(name = "time_sheet")
public class TimeSheet extends BaseEntity {

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

    private Long duration;

    @OneToOne
    private Employee employee;

    private Double discount;

    private Double amount;

}
