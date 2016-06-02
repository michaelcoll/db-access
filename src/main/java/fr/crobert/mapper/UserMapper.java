package fr.crobert.mapper;

import fr.crobert.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getByEmail(String email);

}
