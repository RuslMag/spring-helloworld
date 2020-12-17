package hiber.dao;

import hiber.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
   void add(User user);
   List<User> listUsers();
   List<User> getUser(String model, int series);
}
