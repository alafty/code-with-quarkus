package org.acme.service;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import org.acme.dto.CourseDTOResponse;
import org.acme.recommender.CourseRecommender;

import java.util.List;

@Singleton
public class CourseService {

    @Inject
    @Named("cs-course-recommender")
    CourseRecommender courseRecommender;

    public List<CourseDTOResponse> getRecommendedCourses() {
        return courseRecommender.recommendCourses().stream()
                .map(course -> new CourseDTOResponse(course.getName(), course.getDescription(), course.getCredit()))
                .toList();
    }

}
