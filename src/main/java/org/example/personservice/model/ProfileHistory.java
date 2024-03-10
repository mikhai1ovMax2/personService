package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(schema = "person", name = "profile_history")
public class ProfileHistory {

    @Column("profile_type")
    private String profile_type;

    @Column("reason")
    private String reason;

    @Column("comment")
    private String comment;

    @Column("changed_values")
    private String changed_values;

    @Column("profile_id")
    private Long profile_id;
}
