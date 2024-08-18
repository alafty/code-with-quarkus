package org.acme.dto;

import org.acme.enumerator.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MajorDTORequest {
    private String name;
    private String description;
    private Department department;
}