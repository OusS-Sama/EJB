package metier.Position;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Position;

@Remote
public interface PositionRemote {
	
	public Position addPosition(Position po);
	public Position getPosition(int id);
	public List<Position> listPosition();
	public void updatePosition (Position po, int id);
	public void deletePosition(int id);
	
}
