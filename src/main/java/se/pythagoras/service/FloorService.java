package se.pythagoras.service;

import se.pythagoras.dao.FloorDAO;
import se.pythagoras.model.entity.Building;
import se.pythagoras.model.entity.Floor;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@Startup
@Stateless
public class FloorService {
    private Logger logger = Logger.getLogger(FloorService.class.getName());
    @Inject
    private FloorDAO floorDAO;

    public List<Floor> listAllFloors() {
        logger.info(() -> "Fetching all floors");
        return floorDAO.getAll();
    }

    @PostConstruct
    public void init() {
        logger.info(() -> "Initializing database with dummy values");
        Building buildingA = new Building();
        buildingA.setId(UUID.randomUUID().toString());
        buildingA.setName("Building A");
        Floor first = new Floor();
        first.setId(UUID.randomUUID().toString());
        first.setArea(42);
        first.setName("First floor");
        first.setParent(buildingA);
        floorDAO.save(first);
        Floor second = new Floor();
        second.setId(UUID.randomUUID().toString());
        second.setArea(21);
        second.setName("second floor");
        second.setParent(buildingA);
        floorDAO.save(second);
        logger.info(() -> "Initial database config done");
    }
}
