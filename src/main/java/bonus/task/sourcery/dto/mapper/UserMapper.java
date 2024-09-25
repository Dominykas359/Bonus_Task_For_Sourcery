package bonus.task.sourcery.dto.mapper;

import bonus.task.sourcery.dto.userDTOs.UserRequestDTO;
import bonus.task.sourcery.dto.userDTOs.UserResponseDTO;
import bonus.task.sourcery.model.User;

import java.util.UUID;

public class UserMapper {

    public static UserResponseDTO toDto(User user){

        return UserResponseDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .build();
    }

    public static User fromDto(UserRequestDTO userRequestDTO){

        return User.builder()
                .id(UUID.randomUUID())
                .name(userRequestDTO.getName())
                .build();
    }
}
