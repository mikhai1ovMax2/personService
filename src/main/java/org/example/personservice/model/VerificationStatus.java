package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(schema = "person", name = "verification_statuses")
public class VerificationStatus {


    @Id
    @Column("id")
    private UUID id;

    @Column("created")
    private LocalDateTime createdAt;

    @Column("updated")
    private LocalDateTime updatedAt;

    @Column("profile_type")
    private String profileType;

    @Column("details")
    private String details;

    @Column("verification_status")
    private String verificationStatus;

    @Column("profile_id")
    private UUID profile_id;
}
