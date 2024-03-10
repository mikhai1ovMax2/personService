package org.example.personservice.model;


import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;


@Data
@Table(schema = "person", name = "individuals")
public class Individual extends BaseModel{

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
    private Long user_id;
}
