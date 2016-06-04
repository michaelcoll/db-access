package fr.crobert.mapper;

import fr.crobert.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getByEmail(@Param("email") String email);

}
