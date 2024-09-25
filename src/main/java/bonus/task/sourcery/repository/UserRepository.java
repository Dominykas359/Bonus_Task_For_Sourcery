package bonus.task.sourcery.repository;

import bonus.task.sourcery.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Mapper
public interface UserRepository {

    @Insert("INSERT INTO app.users " +
            "(id, name) " +
            "VALUES (#{id}, #{name})")
    void insertUser(User user);

    @Delete("DELETE FROM app.users WHERE id = #{id}")
    void deleteUser(@Param("id") UUID id);
}
