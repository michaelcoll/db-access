package fr.crobert;


import fr.crobert.domain.User;
import fr.crobert.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserMapperTest extends AbstractTest {


    @Test
    public void getByEmail() {
        // GIVEN
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        // WHEN
        User user = mapper.getByEmail("test@crobert.fr");
        // THEN
        assertThat(user).isNotNull();
    }

}
