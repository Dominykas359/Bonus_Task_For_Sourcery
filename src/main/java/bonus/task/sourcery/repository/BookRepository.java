package bonus.task.sourcery.repository;

import bonus.task.sourcery.model.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookRepository {

    // Filter by yearPublished
    @Select("SELECT * FROM app.books WHERE year_published = #{yearPublished}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "yearPublished", column = "year_published"),
            @Result(property = "author", column = "author"),
            @Result(property = "genre", column = "genre"),
            @Result(property = "bookLanguage", column = "book_language")
    })
    List<Book> filterByYear(@Param("yearPublished") Integer yearPublished);

    // Filter by author
    @Select("SELECT * FROM app.books WHERE author = #{author}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "yearPublished", column = "year_published"),
            @Result(property = "author", column = "author"),
            @Result(property = "genre", column = "genre"),
            @Result(property = "bookLanguage", column = "book_language")
    })
    List<Book> filterByAuthor(@Param("author") String author);

    // Filter by title
    @Select("SELECT * FROM app.books WHERE title = #{title}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "yearPublished", column = "year_published"),
            @Result(property = "author", column = "author"),
            @Result(property = "genre", column = "genre"),
            @Result(property = "bookLanguage", column = "book_language")
    })
    List<Book> filterByTitle(@Param("title") String title);

    // Filter by genre
    @Select("SELECT * FROM app.books WHERE genre = #{genre}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "yearPublished", column = "year_published"),
            @Result(property = "author", column = "author"),
            @Result(property = "genre", column = "genre"),
            @Result(property = "bookLanguage", column = "book_language")
    })
    List<Book> filterByGenre(@Param("genre") String genre);

    // Filter by bookLanguage
    @Select("SELECT * FROM app.books WHERE book_language = #{bookLanguage}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "yearPublished", column = "year_published"),
            @Result(property = "author", column = "author"),
            @Result(property = "genre", column = "genre"),
            @Result(property = "bookLanguage", column = "book_language")
    })
    List<Book> filterByLanguage(@Param("bookLanguage") String bookLanguage);

    //filtering by rating
    @Select("SELECT b.id, b.title, b.year_published, b.author, b.genre, b.book_language, " +
            "AVG(r.rating_value) AS average_rating " +
            "FROM app.books b " +
            "LEFT JOIN app.ratings r ON b.id = r.book_id " +
            "GROUP BY b.id, b.title, b.year_published, b.author, b.genre, b.book_language " +
            "HAVING AVG(r.rating_value) >= #{rating} " +
            "ORDER BY average_rating DESC")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "yearPublished", column = "year_published"),
            @Result(property = "author", column = "author"),
            @Result(property = "genre", column = "genre"),
            @Result(property = "bookLanguage", column = "book_language")
    })
    List<Book> filterByRating(@Param("rating") Double rating);

}
