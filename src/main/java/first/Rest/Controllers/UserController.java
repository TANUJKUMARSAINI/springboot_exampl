package first.Rest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import first.Rest.Entities.User;
import first.Rest.Services.User.UserService;

@RestController
public class UserController {
@Autowired
private UserService userService;
@PostMapping("/users")	
public User createUser(@RequestBody User user) {
User createdUser = userService.createUser(user);
return createdUser;
}

@GetMapping("/users/{userId}")
private User getUser(@PathVariable int userId) {
	User user = userService.getUser(userId);
	return user;
}

@GetMapping("/users")
private List<User> getAllUsers(){
List<User> allUser = userService.getAllUser();
return allUser;
}

@DeleteMapping("/users/{userId}")
private String deleteUser(@PathVariable  int userId) {
userService.deleteUser(userId);
return "User deleted seccessfully";
}

@PutMapping("/users/{userId}")
private User updateUser(@RequestBody User newUser,@PathVariable int userId) {
User updatedUser = userService.updateUser(newUser, userId);
return updatedUser;
}

}
