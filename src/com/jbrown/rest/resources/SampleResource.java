package com.jbrown.rest.resources;

import java.util.Calendar;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Resource;
import org.restlet.ext.spring.RestletFrameworkServlet;

public class SampleResource extends Resource {
	@Override
	public Representation handle() {
		String message = "Hello World!"+ getAttribute("name") + " \n\nTime of request is:"
				+ Calendar.getInstance().getTime().toString();

		return new StringRepresentation(message, MediaType.TEXT_PLAIN);
	}

	@Override
	public void setAttribute(String arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAttribute(String arg0) {
		return (String)this.getRequest().getAttributes().get(arg0);
	}
}