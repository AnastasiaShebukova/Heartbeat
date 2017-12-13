package org.htw.fiw.vs.implementation;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HeartBeatClient implements Remote {

	//hier Singleton mit GetHeartBeat!
	
		public HeartBeatClient() {
			try {
				HeartBeatImpl heartBeat = new HeartBeatImpl();
				Registry registry = LocateRegistry.createRegistry(8080);
				registry.bind("HeartBeat", heartBeat);
			} 
			catch (Exception e) { e.printStackTrace(); }
		}

		public static void main(String[] args) {
			new HeartBeatClient();

		}

	}

