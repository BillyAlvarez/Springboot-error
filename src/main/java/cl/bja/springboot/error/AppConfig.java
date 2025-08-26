package cl.bja.springboot.error;

import cl.bja.springboot.error.models.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<User> UserList() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "John", "Doe"));
        users.add(new User(2L, "Jane", "Doe2"));
        users.add(new User(3L, "Jack", "Doe3"));
        users.add(new User(4L, "Jane", "Doe4"));
        users.add(new User(5L, "Dick", "Doe5"));
        return users;
    }

}
