package com.gwt.startpoint.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

@Path("/test")
public interface WorkerClient extends RestService {

	@GET
	public void get(MethodCallback<Integer> callback);

}
