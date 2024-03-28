package org.example.personservice.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@Table(schema = "person", name = "individuals")
public class Individual{

    @Id
    @Column("id")
    private UUID id;

    @Column("created")
    private LocalDateTime createdAt;

    @Column("updated")
    private LocalDateTime updatedAt;

    @Column("passport_number")
    private String passport_number;

    @Column("phone_number")
    private String phone_number;

    @Column("email")
    private String email;

    @Column("verified_at")
    private LocalDateTime verified_at;

    @Column("archived_at")
    private LocalDateTime archived_at;

    @Column("status")
    private String status;

    @Column("user_id")
    private UUID user_id;
}
