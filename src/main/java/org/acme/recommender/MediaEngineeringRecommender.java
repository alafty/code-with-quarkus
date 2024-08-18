package org.acme.recommender;

import jakarta.enterprise.inject.Default;
import jakarta.inject.Singleton;
import org.acme.model.Major;
import java.util.List;
import static org.acme.enumerator.Department.MEDIA_ENGINEERING;

@Singleton
@Default
public class MediaEngineeringRecommender implements MajorRecommender {
    @Override
    public List<Major> recommendMajors() {
        return List.of(
                new Major("Computer Science", "Computer Science is the study of computers and computing concepts.", 120, MEDIA_ENGINEERING),
                new Major("Digital Media", "Digital Media is the study of digital media and its applications.", 120, MEDIA_ENGINEERING)
        );
    }
}