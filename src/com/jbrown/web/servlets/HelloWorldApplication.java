package com.jbrown.web.servlets;
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class HelloWorldApplication extends Application {

  @Override
  public synchronized Restlet createInboundRoot() {
    Router router = new Router(getContext());
    router.attach("/hello", HelloWorldResource.class);
    return router;
  }
}
