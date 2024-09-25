package bonus.task.sourcery.repository;

import bonus.task.sourcery.model.Rating;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RatingRepository {

    @Insert("INSERT INTO app.ratings " +
            "(id, user_id, book_id, rating_value) " +
            "VALUES (#{id}, #{userId}, #{bookId}, #{ratingValue})")
    void postRating(Rating rating);
}
