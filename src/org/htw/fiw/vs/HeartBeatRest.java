package org.htw.fiw.vs;

import java.io.InputStream;
import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/HeartBeat")
public class HeartBeatRest {
	
	//no GET request - only POST request: Gets heartbeat number from frontend
	
	@POST
	@Path("/HeartBeat")
	public int getHeartBeat(@PathParam("HeartBeat") int heartbeat) throws RemoteException {
		return new GetHeartBeat().setHeartBeatState(heartbeat);
	}
	
	/*@GET
	public String hello() {
		return "world!";
	}
	*/
	
	/*@GET
	@Produces({MediaType.TEXT_HTML})
	public InputStream viewHeartBeat() {
	File f = getFileFromSomewhere();
	return new FileInputStream(f);
	}
	*/

	

}
