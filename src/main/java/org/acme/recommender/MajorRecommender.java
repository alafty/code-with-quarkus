package org.acme.recommender;

import org.acme.model.Major;

import java.util.List;

public interface MajorRecommender {
    List<Major> recommendMajors();
}
