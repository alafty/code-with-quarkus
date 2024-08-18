package org.acme.recommender;

import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import org.acme.model.Author;
import java.util.Calendar;
import java.util.Date;


@Singleton
@Default
@Named("networksAuthorRecommender")
public class NetworksAuthorRecommender implements AuthorRecommender{
    @Override
    public Author recommendAuthors() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1960);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DAY_OF_MONTH, 29);
        Date date = calendar.getTime();

        return new Author("Amr Diab","AD@gmail.com",date,null);
    }
}
