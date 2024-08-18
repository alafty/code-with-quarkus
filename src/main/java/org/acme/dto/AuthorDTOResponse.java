package org.acme.dto;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDTOResponse {

    private Long id;

    private String name;
}
