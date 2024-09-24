package bonus.task.sourcery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

    UUID id;
    String title;
    Integer yearPublished;
    Double rating;
    String author;
    String genre;
    String bookLanguage;
}
