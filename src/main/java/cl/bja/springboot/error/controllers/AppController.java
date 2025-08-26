package cl.bja.springboot.error.controllers;


import cl.bja.springboot.error.exceptions.UserNotFoundException;
import cl.bja.springboot.error.models.domain.User;
import cl.bja.springboot.error.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {


    private final UserService userService;

    public AppController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index() {

        //int value = 100 / 0;
        int value = Integer.parseInt("10");

        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable Long id) {
        User user = userService.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
        System.out.println("user.getLastName() = " + user.getLastName());
        return user;
    }

}
