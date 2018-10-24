package se.pythagoras.rest;

import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;

@ApplicationPath("/api")
public class RestApplication extends Application {

    @Override
    public Map<String, Object> getProperties() {
        String classnames = JacksonFeature.class.getName();
        Map<String, Object> props = new HashMap<>();
        props.put("jersey.config.server.provider.classnames", classnames);
        props.put("jersey.config.disableMoxyJson", true);
        return props;
    }
}