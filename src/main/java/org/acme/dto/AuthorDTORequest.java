package org.acme.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTORequest {

    @NotBlank(message = "Name cannot be empty")
    private String name;

}
