package metier.Smartphone;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Smartphone;


@Remote

public interface SmartphoneRemote {
	
	public Smartphone addSmartphone(Smartphone sm);
	public Smartphone getSmartphone(int id);
	public List<Smartphone> listSmartphone();
	public void updateSmartphone(Smartphone us,int id);
	public void deleteSmartphone(int id);
}
