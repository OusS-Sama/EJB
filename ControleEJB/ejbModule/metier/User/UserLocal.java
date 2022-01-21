package metier.User;

import java.util.List;

import javax.ejb.Local;

import metier.entities.User;

@Local
public interface UserLocal {
	
	public User addUser(User us);
	public User getUser(int id);
	public List<User> listUser();
	public void updateUser(User us);
	public void deleteUser(int id);

}
