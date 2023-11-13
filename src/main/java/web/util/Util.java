package web.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.model.User;
import web.service.UserService;

@Component
public class Util {
    private final UserService userService;

    @Autowired
    public Util(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public void fillDataBase() {
        User user1 = new User("Иван", "Петров", 20);
        User user2 = new User("Петр", "Сидоров", 30);
        User user3 = new User("John", "Travolta", 60);
        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
    }
}
