package org.htw.fiw.vs;

import java.rmi.RemoteException;

public class HeartBeatImpl extends java.rmi.server.UnicastRemoteObject implements HeartBeat, HeartBeatObserverInterface, HeartBeatSubjectInterface  {

	int heartbeat;
	List<HeartBeatObserver> observerList = new ArrayList<HeartBeatObserver>();
	
	protected HeartBeatImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getHeartBeat() throws RemoteException {
		return this.heartbeat;
	}
	
	//die funktion könnte von dem REST call aufgerufen werden? Und würde dann den state setzen und die beaobachter benachrichtigen?
	public void setHeartBeat(int heartbeat) {
		this.heartbeat = heartbeat;
		this.notifyObservers;
	}
	
	//das ist unklar. Die update Methode müsste doch eigentlich auf der anderen Seite implementiert werden, und nicht beide Interfaces in einer Klasse.
	@Override
	public void update() throws RemoteException {
		
		
	}
	
	@Override
	public void subscribeObject(HeartBeatObserver observer) throws RemoteException {
		this.observerList.add(observer);		
	}
	
	@Override
	public void removeObject(HeartBeatObserver observer) throws RemoteException {
		this.observerList.remove(observer);
		
	}
	@Override
	public void notifyObservers() throws RemoteException {
		for (HeartBeatObserver observer : observerList) {
			observer.update();
		}
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
	public void update(Object observable, int heartbeat) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	

}
