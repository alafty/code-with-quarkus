package org.acme.service;

import jakarta.inject.Inject;
import org.acme.dto.CourseDTORequest;
import org.acme.dto.CourseDTOResponse;
import org.acme.dto.MajorResponseDTO;
import org.acme.mapper.CourseMapper;
import org.acme.model.Course;
import org.acme.recommender.CourseRecommender;
import org.acme.recommender.MajorRecommender;

import java.util.List;

public class CourseService {
    private final CourseRecommender courseRecommender;
    @Inject
    CourseMapper courseMapper;
    @Inject
    public CourseService(CourseRecommender courseRecommender) {
        this.courseRecommender = courseRecommender;
    }
    public List<CourseDTOResponse> getRecommendedCourses() {
        return courseRecommender.recommendCourses().stream()
                .map(major -> new CourseDTOResponse(major.getName(), major.getDescription(), major.getCredit()))
                .toList();
    }

    public void createCourse(CourseDTOResponse dto) {
        Course course = new Course();
        course.setName(dto.getName());
        course.setDescription(dto.getDescription());
        course.setCredit(dto.getCredit());
        Course.saveCourse(course);
    }

    public Course getCourseById(Long courseId) {
        return Course.findById(courseId);
    }
}
