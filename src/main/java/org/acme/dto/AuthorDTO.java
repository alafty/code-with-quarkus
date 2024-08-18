package org.acme.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDTO {

    @NotNull(message = "Id cannot be null")
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;
}
