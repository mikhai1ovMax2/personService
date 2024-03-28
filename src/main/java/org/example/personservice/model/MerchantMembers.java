package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(schema = "person", name = "merchant_members")
public class MerchantMembers {

    @Id
    @Column("id")
    private UUID id;

    @Column("created")
    private LocalDateTime createdAt;

    @Column("updated")
    private LocalDateTime updatedAt;

    @Column("member_role")
    private String memberRole;

    @Column("phone_number")
    private String phone_number;

    @Column("status")
    private String status;

    @Column("user_id")
    private UUID user_id;

    @Column("merchant_id")
    private UUID merchant_id;
}
