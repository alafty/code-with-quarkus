package org.acme.mapper;

import org.acme.dto.MajorDTORequest;
import org.acme.dto.MajorDTOResponse;
import org.acme.model.Major;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MajorMapper {
    MajorMapper INSTANCE = Mappers.getMapper(MajorMapper.class);

    MajorDTORequest majorToMajorDTO(Major major);

    Major majorDTOToMajor(MajorDTOResponse majorDTO);
}
