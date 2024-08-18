package org.acme.recommender;

import jakarta.inject.Named;
import jakarta.inject.Singleton;
import org.acme.model.Course;

import java.util.List;

@Singleton
@Named("math-course-recommender")
public class MathCourseRecommender implements CourseRecommender{
    @Override
    public List<Course> recommendCourses() {
        return List.of(
                new Course("Math101","Intro to Math",6),
                new Course("Math201","Calculus I",8)
        );
    }
}
