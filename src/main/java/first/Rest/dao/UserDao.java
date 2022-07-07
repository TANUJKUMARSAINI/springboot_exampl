package first.Rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import first.Rest.Entities.User;

@Repository
public class UserDao {
@Autowired
private JdbcTemplate jdbcTemplate;
	//creating user in db
	public User createUser(User user) {
		String query="insert into user(user_name,user_email,user_password,user_mobile,user_pincode,user_address) values(?,?,?,?,?,?)";
		int update = jdbcTemplate.update(query,user.getUserName(),user.getUserEmail(),user.getUserPassword(),user.getUserMobile(),user.getUserPincode(),user.getUserAddress());
		System.out.println(update+"rows affected for save user");
		return user;
	}

	//getting single user by given userId
	public User getUser(int userId) {
		String query="select * from user where user_id=?";
		User user = jdbcTemplate.queryForObject(query, (rs,rowNum)->{
			User u=new User();
		    u.setUserId(rs.getInt("user_id"));
		    u.setUserName(rs.getString("user_name"));
		    u.setUserEmail(rs.getString("user_email"));
		    u.setUserPassword(rs.getString("user_password"));
		    u.setUserMobile(rs.getLong("user_mobile"));
		    u.setUserPincode(rs.getInt("user_pincode"));
		    u.setUserAddress(rs.getString("user_address"));
			return u;
	
		},userId);
		System.out.println(user+" rows affected for delete user");
		return user;
	}

	//getting alll user from db
	public List<User> getAllUser() {
		String query="select * from user";
		List<User> users = jdbcTemplate.query(query, (rs,rowNum)->{
			User u=new User();
		    u.setUserId(rs.getInt("user_id"));
		    u.setUserName(rs.getString("user_name"));
		    u.setUserEmail(rs.getString("user_email"));
		    u.setUserPassword(rs.getString("user_password"));
		    u.setUserMobile(rs.getLong("user_mobile"));
		    u.setUserPincode(rs.getInt("user_pincode"));
		    u.setUserAddress(rs.getString("user_address"));
			return u;
		});
		return users;
	}

	//delete user from db
	public void deleteUser(int userId) {
		String query="delete from user where user_id=?";
		int update = jdbcTemplate.update(query,userId);
		System.out.println(update+"rows affected for delete user");
	}

	//update user in db
	public User updateUser(User newUser, int userId) {
		String query="update user set user_name=?,user_email=?,user_password=?,user_mobile=?,user_pincode=?,user_address=? where user_id=?";
		int update = jdbcTemplate.update(query,newUser.getUserName(),newUser.getUserEmail(),newUser.getUserPassword(),newUser.getUserMobile(),newUser.getUserPincode(),newUser.getUserAddress(),userId);	
        System.out.println(update+"rows affected for update user");
	    newUser.setUserId(userId);
	    return newUser;
	}

}
