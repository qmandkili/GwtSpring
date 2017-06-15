package com.gwt.startpoint.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("frontend/FrontEnd/test")
public class WorkerResource {
	
	@GET
	public int get() {
		return 12345;
	}

}
