package org.acme.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="course")
@Entity
public class Course extends PanacheEntity {

    @NonNull
    private String name;

    @NonNull
    private String description;

    @NonNull
    private int credit;

    @ManyToMany(mappedBy = "courses", cascade = CascadeType.ALL)
    private Set<Author> authors;
}
