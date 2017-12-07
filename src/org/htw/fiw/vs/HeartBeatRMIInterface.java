package org.htw.fiw.vs;

public interface HeartBeatRMIInterface extends java.rmi.Remote {
	
	public int setHeartBeatState(int heartBeat)
			throws java.rmi.RemoteException;

}
