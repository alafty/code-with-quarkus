package org.acme.model;

import org.acme.enumerator.Department;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Major extends PanacheEntity {
    private String name;
    private String description;
    private int creditsRequired;
    private Department department;
}
