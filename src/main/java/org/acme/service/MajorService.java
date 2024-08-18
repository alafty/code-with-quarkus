package org.acme.service;

import org.acme.dto.MajorResponseDTO;
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

    public List<MajorResponseDTO> getRecommendedMajors() {
        return majorRecommender.recommendMajors().stream()
                .map(major -> new MajorResponseDTO(major.getName(), major.getDescription(), major.getCreditsRequired(), major.getDepartment()))
                .toList();
    }
}