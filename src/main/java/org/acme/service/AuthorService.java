package org.acme.service;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import lombok.Setter;
import org.acme.recommender.AuthorRecommender;

@Singleton
@Setter
public class AuthorService {
    @Inject
    @Named("mediaAuthorRecommender")
    AuthorRecommender authorRecommender;
}
