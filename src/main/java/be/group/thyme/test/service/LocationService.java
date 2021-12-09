package be.group.thyme.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.group.thyme.test.model.Location;
import be.group.thyme.test.repository.LocationRepository;

@Service
public class LocationService implements LocationImpl{

	
	@Autowired
	private LocationRepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
	  repository.delete(location);
		
	}

	@Override
	public Location getLocationById(Long id) {
		
		return repository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocations() {
	
		return repository.findAll();
	}

}
