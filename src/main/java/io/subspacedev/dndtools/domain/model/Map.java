package io.subspacedev.dndtools.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String name;

    @Column
    @Size(max = 1000)
    private String description;

    @Column(nullable = false)
    @NotNull
    @Size(min = 1, max = 255)
    private String imageUrl;
}
