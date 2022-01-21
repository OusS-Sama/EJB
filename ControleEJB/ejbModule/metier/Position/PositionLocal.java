package metier.Position;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Position;

@Local
public interface PositionLocal {
	public Position addPosition(Position po);
	public Position getPosition(int id);
	public List<Position> listPosition();
	public void updatePosition (Position po, int id);
	public void deletePosition(int id);
}
