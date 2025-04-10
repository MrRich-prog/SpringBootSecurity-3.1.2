package springBootSecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import springBootSecurity.models.Role;
import springBootSecurity.models.User;

import java.util.List;
import java.util.Set;

public interface UserService extends UserDetailsService {

    boolean saveUser(User user);

    void removeUserById(Long id);

    List<User> getAllUsers();

    void cleanUsersTable();

    User getUserById(Long id);

    User getUserByUsername(String username);

    boolean updateUser(User user);

    Set<Role> getRoles(String roleName);
}