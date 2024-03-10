package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(schema = "person", name = "merchant_members")
public class MerchantMembers {

    @Column("member_role")
    private String memberRole;

    @Column("phone_number")
    private String phone_number;

    @Column("status")
    private String status;

    @Column("user_id")
    private Long user_id;

    @Column("merchant_id")
    private Long merchant_id;
}
