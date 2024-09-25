package bonus.task.sourcery.dto.userDTOs;

import bonus.task.sourcery.dto.userDTOs.UserRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class UserResponseDTO extends UserRequestDTO {

    private UUID id;
}
