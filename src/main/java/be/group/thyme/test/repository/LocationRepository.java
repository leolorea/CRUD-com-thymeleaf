package be.group.thyme.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.group.thyme.test.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
