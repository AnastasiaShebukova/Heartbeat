package org.htw.fiw.vs;

import java.rmi.RemoteException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/HeartBeat")
public class HeartBeatRest {
	
	//no GET request - only POST request: Gets heartbeat number from frontend
	
	@POST
	@Path("/HeartBeat")
	public void getHeartBeat(@PathParam("HeartBeat") int heartbeat) throws RemoteException {
		new HeartBeatImpl().update(heartbeat);
	}

}
