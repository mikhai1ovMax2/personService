package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(schema = "person", name = "merchants")
public class Merchant {


    @Id
    @Column("id")
    private UUID id;

    @Column("created")
    private LocalDateTime createdAt;

    @Column("updated")
    private LocalDateTime updatedAt;

    @Column("company_name")
    private String company_name;

    @Column("email")
    private String email;

    @Column("phone_number")
    private String phone_number;

    @Column("verified_at")
    private LocalDateTime verified_at;

    @Column("archived_at")
    private LocalDateTime archived_at;

    @Column("status")
    private String status;

    @Column("filled")
    private boolean filled;

    @Column("creator_id")
    private UUID creator_id;

    @Column("company_id")
    private Long company_id;
}
