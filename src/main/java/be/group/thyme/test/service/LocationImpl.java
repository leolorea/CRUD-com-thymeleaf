package be.group.thyme.test.service;

import java.util.List;

import be.group.thyme.test.model.Location;

public interface LocationImpl {

Location saveLocation(Location location);
	
	Location updateLocation(Location location);
	
	void deleteLocation(Location location);
	
	Location getLocationById(Long id);
	
	List<Location> getAllLocations ();
	
}
