package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table(schema = "person", name = "addresses")
public class Address extends BaseModel{

    @Column("address")
    private String address;

    @Column("zip_code")
    private String zipCode;

    @Column("archived")
    private LocalDateTime archivedAt;

    @Column("city")
    private String city;

    @Column("state")
    private String state;

    @Column("country_id")
    private Long country_id;
}
