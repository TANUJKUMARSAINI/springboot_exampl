package first.Rest.Services.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import first.Rest.Entities.User;
@Service
public class UserServiceImpl implements UserService{

	List<User> list=new ArrayList<>();
	
	
	@Override
	public User createUser(User user) {
		list.add(user);
		return user;
	}

	@Override
	public User getUser(int userId) {
		User user = list.stream().filter(e->e.getUserId()==userId).findFirst().get();
		return user;
	}

	@Override
	public List<User> getAllUser() {
		
		return list;
	}

	@Override
	public void deleteUser(int userId) {
	List<User> newList = list.stream().filter(e->e.getUserId()!=userId).collect(Collectors.toList());
	list=newList;
		
	}

	@Override
	public User updateUser(User newUser, int userId) {
	   List<User> updatedUser=list.stream().map(u->{
		   if(u.getUserId()==userId) {
			   u.setUserName(newUser.getUserName());
			   u.setUserAddress(newUser.getUserAddress());
			   u.setUserPincode(newUser.getUserPincode());
			   u.setUserEmail(newUser.getUserEmail());
			   u.setUserMobile(newUser.getUserMobile());
			   u.setUserPassword(newUser.getUserPassword());
			  return u;
			 
		   }else {
			   return u;
		   }
		   
	   }).collect(Collectors.toList());
	   list=updatedUser;
	   newUser.setUserId(userId);
	   return newUser;
	}

}
