package org.acme.recommender;

import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import org.acme.model.Author;
import java.util.Calendar;
import java.util.Date;


@Singleton
@Default
@Named("mediaAuthorRecommender")
public class MediaAuthorRecommender implements AuthorRecommender{
    @Override
    public Author recommendAuthors() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1988);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date date = calendar.getTime();

        return new Author("Tamer Hosny","TH@gmail.com",date,null);
    }
}
