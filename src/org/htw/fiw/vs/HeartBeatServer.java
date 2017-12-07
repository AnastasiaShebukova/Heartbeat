package org.htw.fiw.vs;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HeartBeatServer implements Remote {

	//hier Singleton mit GetHeartBeat!
	
		public HeartBeatServer() {
			try {
				GetHeartBeat heartBeat = new GetHeartBeat();
				Registry registry = LocateRegistry.createRegistry(8080);
				registry.bind("HeartBeat", heartBeat);
			} 
			catch (Exception e) { e.printStackTrace(); }
		}

		public static void main(String[] args) {
			new HeartBeatServer();

		}

	}

