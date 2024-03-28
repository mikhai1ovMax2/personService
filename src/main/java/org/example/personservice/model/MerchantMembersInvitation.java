package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(schema = "person", name = "merchant_members_invitations")
public class MerchantMembersInvitation {

    @Id
    @Column("id")
    private UUID id;

    @Column("created")
    private LocalDateTime createdAt;

    @Column("expires")
    private LocalDateTime expires;

    @Column("first_name")
    private String first_name;

    @Column("last_name")
    private String last_name;

    @Column("email")
    private String email;

    @Column("status")
    private String status;

    @Column("merchant_id")
    private UUID merchant_id;
}
