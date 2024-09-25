package bonus.task.sourcery.dto.ratingDTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class RatingRequestDto {

    private UUID bookId;
    private UUID userId;
    private Integer ratingValue;
}
