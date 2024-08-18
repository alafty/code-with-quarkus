package org.acme.mapper;

import org.acme.dto.CourseDTORequest;
import org.acme.dto.CourseDTOResponse;
import org.acme.model.Course;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    CourseDTORequest courseToCourseDTO(Course course);

    Course courseDTOToCourse(CourseDTOResponse courseDTO);
}