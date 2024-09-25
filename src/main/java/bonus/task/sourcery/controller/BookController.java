package bonus.task.sourcery.controller;

import bonus.task.sourcery.dto.bookDTOs.BookResponseDto;
import bonus.task.sourcery.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    // Filter by yearPublished
    @GetMapping("/year/{year}")
    public List<BookResponseDto> filterByYear(@PathVariable(value = "year") Integer year) {
        return bookService.filterByYear(year);
    }

    // Filter by author
    @GetMapping("/author/{author}")
    public List<BookResponseDto> filterByAuthor(@PathVariable(value = "author") String author) {
        return bookService.filterByAuthor(author);
    }

    // Filter by title
    @GetMapping("/title/{title}")
    public List<BookResponseDto> filterByTitle(@PathVariable(value = "title") String title) {
        return bookService.filterByTitle(title);
    }

    // Filter by genre
    @GetMapping("/genre/{genre}")
    public List<BookResponseDto> filterByGenre(@PathVariable(value = "genre") String genre) {
        return bookService.filterByGenre(genre);
    }

    // Filter by bookLanguage
    @GetMapping("/language/{bookLanguage}")
    public List<BookResponseDto> filterByLanguage(@PathVariable(value = "bookLanguage") String bookLanguage) {
        return bookService.filterByLanguage(bookLanguage);
    }

    // Filter by rating
    @GetMapping("/rating/{rating}")
    public List<BookResponseDto> filterByRating(@PathVariable(value = "rating") Double rating) {
        return bookService.filterByRating(rating);
    }
}
