package metier.User;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.Position.PositionLocal;
import metier.Position.PositionRemote;
import metier.Smartphone.SmartphoneLocal;
import metier.Smartphone.SmartphoneRemote;
import metier.entities.Position;
import metier.entities.Smartphone;
import metier.entities.User;
@Stateless(name="CEJB")
public class UserEJBImp implements UserLocal, UserRemote,SmartphoneLocal,SmartphoneRemote,PositionRemote,PositionLocal {
	@PersistenceContext
	private EntityManager em;
	@Override
	public User addUser(User us) {
		em.persist(us);
		return us;
	}

	@Override
	public User getUser(int id) {
		User us=em.find(User.class, id);
		if (us==null) throw new RuntimeException("User introuvable");
		return us ;
	}

	@Override
	public List<User> listUser() {
		Query req=em.createQuery("select u from User u ");
		return req.getResultList();
		
	}


	@Override
	public void deleteUser(int id) {
		User cp=em.find(User.class, id);
		em.remove(cp);
		
	}

	@Override
	public void updateUser(User us) {
		
		em.merge(us);
		
	}

	@Override
	public Smartphone addSmartphone(Smartphone sm) {
		em.persist(sm);
		return sm;
	}

	@Override
	public Smartphone getSmartphone(int id) {
		Smartphone sm=em.find(Smartphone.class, id);
		if (sm==null) throw new RuntimeException("Smartphone introuvable");
		return sm ;
	}

	@Override
	public List<Smartphone> listSmartphone() {
		
			Query req=em.createQuery("select s from Smartphone s");
			return req.getResultList();
	}

	@Override
	public void updateSmartphone(Smartphone sm, int id) {
		Smartphone smartphone= getSmartphone(id);
		sm.setImei(sm.getImei());
		em.merge(sm);
	}

	@Override
	public void deleteSmartphone(int id) {
		Smartphone sm=getSmartphone(id);
		em.remove(sm);
		
	}

	@Override
	public Position addPosition(Position po) {
		em.persist(po);
		return po;
	}

	@Override
	public Position getPosition(int id) {
		Position po=em.find(Position.class, id);
		if (po==null) throw new RuntimeException("Smartphone introuvable");
		return po ;
	}

	@Override
	public List<Position> listPosition() {
		Query req=em.createQuery("select ps from Position p");
		return req.getResultList();
	}

	@Override
	public void updatePosition(Position po, int id) {
		Position position= getPosition(id);
		po.setLatitude(po.getLatitude());
		po.setLongitude(po.getLongitude());
		po.setDate(new Date());
		em.merge(po);
		
	}

	@Override
	public void deletePosition(int id) {
		Position po=getPosition(id);
		em.remove(po);
		
	}
	
	

}
