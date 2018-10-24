package se.pythagoras.rest;

import se.pythagoras.service.FloorService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/floor")
@Produces(MediaType.APPLICATION_JSON)
public class FloorAPI {

    @Inject
    private FloorService floorService;

    @GET
    @Path("/list")
    public Response listAllFloors() {
        return Response.ok(floorService.listAllFloors()).build();
    }
}
