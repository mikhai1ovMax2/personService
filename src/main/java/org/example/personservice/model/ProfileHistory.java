package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(schema = "person", name = "profile_history")
public class ProfileHistory {

    @Id
    @Column("id")
    private UUID id;

    @Column("created")
    private LocalDateTime createdAt;

    @Column("profile_type")
    private String profile_type;

    @Column("reason")
    private String reason;

    @Column("comment")
    private String comment;

    @Column("changed_values")
    private String changed_values;

    @Column("profile_id")
    private UUID profile_id;
}
