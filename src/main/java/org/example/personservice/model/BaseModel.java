package org.example.personservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Data
public class BaseModel {

    @Id
    @Column("id")
    private String id;

    @Column("created")
    private LocalDateTime createdAt;

    @Column("updated")
    private LocalDateTime updatedAt;

}
