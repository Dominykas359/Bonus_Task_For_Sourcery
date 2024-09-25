package bonus.task.sourcery.controller;

import bonus.task.sourcery.dto.ratingDTOs.RatingRequestDto;
import bonus.task.sourcery.dto.ratingDTOs.RatingResponseDto;
import bonus.task.sourcery.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ratings")
public class RatingController {

    private final RatingService ratingService;

    @PostMapping
    public ResponseEntity<RatingResponseDto> postRating(
            @RequestBody RatingRequestDto ratingRequestDto
            ){
        return ResponseEntity.ok(ratingService.postRating(ratingRequestDto));
    }
}
