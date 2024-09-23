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
public class Rating {

    UUID id;
    UUID bookId;
    UUID userId;
    Integer value;
}
