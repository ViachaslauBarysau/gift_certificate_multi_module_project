package by.barysau.gift_certificates_repository.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Certificate {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate date_of_creation;
    private LocalDate date_of_modification;
    private Integer duration_in_days;
}
