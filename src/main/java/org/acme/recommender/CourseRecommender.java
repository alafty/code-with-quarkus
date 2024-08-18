package org.acme.recommender;

import org.acme.model.Course;
import org.acme.model.Major;

import java.util.List;

public interface CourseRecommender {
    List<Course> recommendCourses();
}
