package br.utils;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class BaseEntity {

    @Id
    private Long id;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
