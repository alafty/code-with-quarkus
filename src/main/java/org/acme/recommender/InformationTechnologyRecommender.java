package org.acme.recommender;

import org.acme.model.Major;

import java.util.List;

import static org.acme.enumerator.Department.INFORMATION_TECHNOLOGY;

public class InformationTechnologyRecommender implements MajorRecommender {
    @Override
    public List<Major> recommendMajors() {
        return List.of(
            new Major("Electronics", "Electronics is the study of electronic circuits and systems.", 120, INFORMATION_TECHNOLOGY),
            new Major("Communications", "Communications is the study of communication systems and networks.", 120, INFORMATION_TECHNOLOGY),
            new Major("Networks", "Networks is the study of computer networks and network security.", 120, INFORMATION_TECHNOLOGY)
        );
    }
}
