package org.bloblines.data.game;

import java.util.ArrayList;
import java.util.List;

import org.bloblines.data.map.Location;
import org.bloblines.utils.XY;

public class Player {

	public String name;
	public List<Blob> blobs;
	public Location location;
	public XY pos;

	public Player(String playerName, Location startPos) {
		name = playerName;
		location = startPos;
		pos = new XY(location.pos);
		blobs = new ArrayList<>();
		Blob b1 = new Blob();
		b1.name = "Bobby";
		b1.age = 32;
		b1.lifeCurrent = 41;
		b1.lifeMax = 57;
		Blob b2 = new Blob();
		b2.name = "Jean-Blob";
		b2.age = 27;
		b2.lifeCurrent = 51;
		b2.lifeMax = 52;
		blobs.add(b1);
		blobs.add(b2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
