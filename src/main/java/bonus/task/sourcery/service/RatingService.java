package bonus.task.sourcery.service;

import bonus.task.sourcery.dto.mapper.RatingMapper;
import bonus.task.sourcery.dto.ratingDTOs.RatingRequestDto;
import bonus.task.sourcery.dto.ratingDTOs.RatingResponseDto;
import bonus.task.sourcery.model.Rating;
import bonus.task.sourcery.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RatingService {

    private final RatingRepository ratingRepository;

    @Transactional
    public RatingResponseDto postRating(RatingRequestDto ratingRequestDto){
        Rating rating = RatingMapper.fromDto(ratingRequestDto);
        ratingRepository.postRating(rating);

        return RatingMapper.toDto(rating);
    }
}
