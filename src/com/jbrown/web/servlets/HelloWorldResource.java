package com.jbrown.web.servlets;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
   
public class HelloWorldResource extends ServerResource {
 
@ Get   
public String represent () {
return   "Hello, world";
}
 
} 