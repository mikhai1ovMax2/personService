package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(schema = "person", name = "verification_statuses")
public class VerificationStatus {

    @Column("profile_type")
    private String profileType;

    @Column("details")
    private String details;

    @Column("verification_status")
    private String verificationStatus;

    @Column("profile_id")
    private Long profile_id;
}
