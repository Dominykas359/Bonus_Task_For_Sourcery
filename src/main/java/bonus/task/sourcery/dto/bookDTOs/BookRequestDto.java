package bonus.task.sourcery.dto.bookDTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class BookRequestDto {

    private String title;
    private Integer yearPublished;
    private String author;
    private String genre;
    private String bookLanguage;
}
