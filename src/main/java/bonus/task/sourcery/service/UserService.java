package bonus.task.sourcery.service;

import bonus.task.sourcery.dto.userDTOs.UserRequestDTO;
import bonus.task.sourcery.dto.userDTOs.UserResponseDTO;
import bonus.task.sourcery.dto.mapper.UserMapper;
import bonus.task.sourcery.model.User;
import bonus.task.sourcery.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponseDTO createUser(UserRequestDTO userRequestDTO){

        User user = UserMapper.fromDto(userRequestDTO);
        userRepository.insertUser(user);

        return UserMapper.toDto(user);
    }

    @Transactional
    public void deleteUser(UUID id){
        userRepository.deleteUser(id);
    }
}
