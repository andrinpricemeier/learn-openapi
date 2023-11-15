package org.ubunifu.coders.backend.openapi;

import org.ubunifu.coders.backend.openapi.model.Fruit;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/fruit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public interface ApplesApi {

    @GET
    @Produces({ "application/json" })
    Fruit getAllFruits();
}
