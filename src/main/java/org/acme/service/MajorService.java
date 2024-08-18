package org.acme.service;

import org.acme.dto.MajorDTOResponse;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.acme.recommender.MajorRecommender;

import java.util.List;

@Singleton
public class MajorService {
    private final MajorRecommender majorRecommender;

    @Inject
    public MajorService(MajorRecommender majorRecommender) {
        this.majorRecommender = majorRecommender;
    }

public List<MajorDTOResponse> getRecommendedMajors() {
        return majorRecommender.recommendMajors().stream()
                .map(major -> new MajorDTOResponse(major.getName(), major.getDescription(), major.getCreditsRequired(), major.getDepartment()))
                .toList();
    }
}