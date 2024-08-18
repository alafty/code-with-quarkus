package org.acme.mapper;

import org.acme.dto.AuthorDTORequest;
import org.acme.dto.AuthorDTOResponse;
import org.acme.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorDTORequest authorToAuthorDTO(Author author);

    Author authorDTOToAuthor(AuthorDTOResponse authorDTO);
}
