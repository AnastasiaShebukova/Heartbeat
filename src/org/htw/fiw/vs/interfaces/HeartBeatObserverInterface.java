package org.htw.fiw.vs.interfaces;



public interface HeartBeatObserverInterface extends java.rmi.Remote  {
	
	public void update(Object object) //hier kann irgendwie auch gleich setHeartBeatState() eingesetzt werden oder ähnliche. Das habe ich nicht richtig verstanden. 
			throws java.rmi.RemoteException;
 //update(HeartBeat Observable, Object updateMSG);
}
