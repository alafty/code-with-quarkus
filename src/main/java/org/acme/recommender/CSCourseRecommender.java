package org.acme.recommender;

import jakarta.inject.Named;
import jakarta.inject.Singleton;
import org.acme.model.Course;

import java.util.List;

@Singleton
@Named("cs-course-recommender")
public class CSCourseRecommender implements CourseRecommender {
    @Override
    public List<Course> recommendCourses() {
        return List.of(
                new Course("CSEN101","Intro to CS",4,null),
                new Course("CSEN201","Object-oriented programming",6,null)
        );
    }
}
