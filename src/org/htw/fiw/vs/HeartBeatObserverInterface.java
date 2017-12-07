package org.htw.fiw.vs;

public interface HeartBeatObserverInterface extends java.rmi.Remote  {
	
	public void update(int heartBeat) //hier kann irgendwie auch gleich setHeartBeatState() eingesetzt werden oder ähnliche. Das habe ich nicht richtig verstanden. 
			throws java.rmi.RemoteException;

}
