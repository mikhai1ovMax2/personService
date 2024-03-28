package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(schema = "person", name = "users")
public class User {

    @Id
    @Column("id")
    private UUID id;

    @Column("created")
    private LocalDateTime createdAt;

    @Column("updated")
    private LocalDateTime updatedAt;

    @Column("secret_key")
    private String secret_key;

    @Column("first_name")
    private String first_name;

    @Column("last_name")
    private String last_name;

    @Column("changed_values")
    private String changed_values;

    @Column("verified_at")
    private LocalDateTime verified_at;

    @Column("archived_at")
    private LocalDateTime archived_at;

    @Column("status")
    private String status;

    @Column("filled")
    private boolean filled;

    @Column("address_id")
    private UUID address_id;
}
