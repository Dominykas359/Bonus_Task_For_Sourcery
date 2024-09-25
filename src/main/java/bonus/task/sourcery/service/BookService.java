package bonus.task.sourcery.service;

import bonus.task.sourcery.dto.bookDTOs.BookResponseDto;
import bonus.task.sourcery.dto.mapper.BookMapper;
import bonus.task.sourcery.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    // Filter by yearPublished
    public List<BookResponseDto> filterByYear(Integer year) {
        return bookRepository.filterByYear(year)
                .stream()
                .map(BookMapper::toDto)
                .toList();
    }

    // Filter by author
    public List<BookResponseDto> filterByAuthor(String author) {
        return bookRepository.filterByAuthor(author)
                .stream()
                .map(BookMapper::toDto)
                .toList();
    }

    // Filter by title
    public List<BookResponseDto> filterByTitle(String title) {
        return bookRepository.filterByTitle(title)
                .stream()
                .map(BookMapper::toDto)
                .toList();
    }

    // Filter by genre
    public List<BookResponseDto> filterByGenre(String genre) {
        return bookRepository.filterByGenre(genre)
                .stream()
                .map(BookMapper::toDto)
                .toList();
    }

    // Filter by bookLanguage
    public List<BookResponseDto> filterByLanguage(String bookLanguage) {
        return bookRepository.filterByLanguage(bookLanguage)
                .stream()
                .map(BookMapper::toDto)
                .toList();
    }

    // Filter by rating
    public List<BookResponseDto> filterByRating(Double rating) {
        return bookRepository.filterByRating(rating)
                .stream()
                .map(BookMapper::toDto)
                .toList();
    }
}
