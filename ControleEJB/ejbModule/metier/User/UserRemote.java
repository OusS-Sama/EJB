package metier.User;

import java.util.List;

import javax.ejb.Remote;



import metier.entities.User;

@Remote
public interface UserRemote {
	
	public User addUser(User us);
	public User getUser(int id);
	public List<User> listUser();
	public void updateUser(User us);
	public void deleteUser(int id);

	

}
