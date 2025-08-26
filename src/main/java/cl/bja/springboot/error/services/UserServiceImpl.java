package cl.bja.springboot.error.services;

import cl.bja.springboot.error.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;


    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {

//        User user = null;
//        for (User user1 : users) {
//            if (user1.getId().equals(id)) {
//                user = user1;
//                break;
//            }
//        }
//        return Optional.ofNullable(user);

        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

}
