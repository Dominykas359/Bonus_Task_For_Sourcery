package bonus.task.sourcery.dto.mapper;

import bonus.task.sourcery.dto.bookDTOs.BookRequestDto;
import bonus.task.sourcery.dto.bookDTOs.BookResponseDto;
import bonus.task.sourcery.model.Book;

import java.util.UUID;

public class BookMapper {

    public static BookResponseDto toDto(Book book){

        return BookResponseDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .yearPublished(book.getYearPublished())
                .author(book.getAuthor())
                .genre(book.getGenre())
                .bookLanguage(book.getBookLanguage())
                .build();
    }

    public static Book fromDto(BookRequestDto bookRequestDto){

        return Book.builder()
                .id(UUID.randomUUID())
                .title(bookRequestDto.getTitle())
                .yearPublished(bookRequestDto.getYearPublished())
                .author(bookRequestDto.getAuthor())
                .genre(bookRequestDto.getGenre())
                .bookLanguage(bookRequestDto.getBookLanguage())
                .build();
    }
}
