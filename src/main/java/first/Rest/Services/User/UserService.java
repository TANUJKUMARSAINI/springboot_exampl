package first.Rest.Services.User;

import java.util.List;

import first.Rest.Entities.User;

public interface UserService {
public User createUser(User user); 
public User getUser(int userId);
public List<User> getAllUser();
public void deleteUser(int userId);
public User updateUser(User newUser,int userId);

}
