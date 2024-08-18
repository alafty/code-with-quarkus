package org.acme.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author extends PanacheEntity {

    @Column
    @NotBlank(message = "Name is required")
    private String name;

    @Column(unique = true)
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    private String email;

    private Date birthdate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "author_course",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses;

}
