package first.Rest.Services.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import first.Rest.Entities.User;
import first.Rest.dao.UserDao;
@Service
@Primary
public class UserDaoServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public User createUser(User user) {
		
		return userDao.createUser(user) ;
	}

	@Override
	public User getUser(int userId) {
		
		return userDao.getUser(userId);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public void deleteUser(int userId) {
    userDao.deleteUser(userId);
	}

	@Override
	public User updateUser(User newUser, int userId) {
	User updatedUser = userDao.updateUser(newUser, userId);
		return updatedUser;
	}

}
