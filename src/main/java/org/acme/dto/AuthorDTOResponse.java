package org.acme.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDTOResponse {

    @NotNull(message = "Id cannot be null")
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;
}
