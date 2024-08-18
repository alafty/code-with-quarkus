package org.acme.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.*;

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

    public static void saveCourse(Course course) {
        course.persist();
    }

    public static Course findById(Long id) {
        return find("id", id).firstResult();
    }
}
