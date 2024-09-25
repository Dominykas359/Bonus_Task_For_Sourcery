package bonus.task.sourcery.controller;

import bonus.task.sourcery.dto.userDTOs.UserRequestDTO;
import bonus.task.sourcery.dto.userDTOs.UserResponseDTO;
import bonus.task.sourcery.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(
            @RequestBody UserRequestDTO userRequestDTO
    ){
        return ResponseEntity.ok(userService.createUser(userRequestDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") UUID id){
        userService.deleteUser(id);
    }
}
