package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table(schema = "person", name = "merchants")
public class Merchant {

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
    private Long creator_id;

    @Column("company_id")
    private Long company_id;

}
