package org.acme.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.dto.CourseDTORequest;
import org.acme.dto.CourseDTOResponse;
import org.acme.model.Course;
@ApplicationScoped
public class CourseMapper {

    public CourseDTOResponse courseToDtoResponse(Course course) {
        CourseDTOResponse dto = new CourseDTOResponse();
        dto.setName(course.getName());
        dto.setDescription(course.getDescription());
        dto.setCredit(course.getCredit());
        return dto;
    }

    public Course dtoResponseToCourse(CourseDTOResponse dto) {
        Course course = new Course();
        course.setName(dto.getName());
        course.setDescription(dto.getDescription());
        course.setCredit(dto.getCredit());
        return course;
    }

    public Course mapDtoToEntity(CourseDTORequest dto) {
        Course course = new Course();
        course.setName(dto.getName());
        // Set other properties if needed
        return course;
    }
}

