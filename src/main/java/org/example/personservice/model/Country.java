package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;


@Data
@Table(schema = "person", name = "countries")
public class Country{

    @Id
    @Column("id")
    private Long id;

    @Column("created")
    private LocalDateTime createdAt;

    @Column("updated")
    private LocalDateTime updatedAt;

    @Column("name")
    private String name;

    @Column("alpha2")
    private String alpha2;

    @Column("alpha3")
    private String alpha3;

    @Column("status")
    private String status;

    @Column("state")
    private String state;
}
