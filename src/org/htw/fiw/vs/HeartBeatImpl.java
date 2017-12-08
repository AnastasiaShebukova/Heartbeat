package org.htw.fiw.vs;

import java.rmi.RemoteException;

public class HeartBeatImpl extends java.rmi.server.UnicastRemoteObject implements HeartBeat, HeartBeatObserverInterface, HeartBeatSubjectInterface  {

	int heartbeat;
	
	protected HeartBeatImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getHeartBeat() throws RemoteException {
		return this.heartbeat;
	}
	@Override
	public void update(int heartBeat) throws RemoteException {
		this.heartbeat = heartBeat;
		
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
