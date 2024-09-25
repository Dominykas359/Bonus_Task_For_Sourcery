package bonus.task.sourcery.dto.mapper;

import bonus.task.sourcery.dto.ratingDTOs.RatingRequestDto;
import bonus.task.sourcery.dto.ratingDTOs.RatingResponseDto;
import bonus.task.sourcery.model.Rating;

import java.util.UUID;

public class RatingMapper {

    public static RatingResponseDto toDto(Rating rating){

        return RatingResponseDto.builder()
                .id(rating.getId())
                .bookId(rating.getBookId())
                .userId(rating.getUserId())
                .ratingValue(rating.getRatingValue())
                .build();
    }

    public static Rating fromDto(RatingRequestDto ratingRequestDto){

        return Rating.builder()
                .id(UUID.randomUUID())
                .bookId(ratingRequestDto.getBookId())
                .userId(ratingRequestDto.getUserId())
                .ratingValue(ratingRequestDto.getRatingValue())
                .build();
    }
}
