package org.acme.recommender;

import org.acme.model.Course;
import org.acme.model.Major;

import java.util.List;

import static org.acme.enumerator.Department.MEDIA_ENGINEERING;

public class ComputerCourse implements CourseRecommender{
    @Override
    public List<Course> recommendCourses() {
        return List.of(
                new Course("cs","desc",5)
        );
    }
}
