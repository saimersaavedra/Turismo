package API;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


@ApplicationPath("/api")
public class RestApplication extends Application{

 @Override
    public Set<Class<?>> getClasses() {
       Set<Class<?>> classes = new HashSet<>();
        classes.add(CorsFilter.class);
        classes.add(TuristaResource.class);
        classes.add(SitioTuristicoResource.class);
        // Agrega aquí tus clases de recursos (endpoints) adicionales
        return classes;
    }
    

}
