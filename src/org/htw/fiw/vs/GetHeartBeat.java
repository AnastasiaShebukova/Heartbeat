package org.htw.fiw.vs;

import java.rmi.RemoteException;

public class GetHeartBeat extends java.rmi.server.UnicastRemoteObject implements HeartBeatRMIInterface, HeartBeatObserverInterface, HeartBeatSubjectInterface  {

	protected GetHeartBeat() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int setHeartBeatState(int heartBeat) throws RemoteException {
		return heartBeat;
	}
	@Override
	public void update(int heartBeat) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void subscribeObject(Object object) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeObject(Object object) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notifyObservers() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	

}
