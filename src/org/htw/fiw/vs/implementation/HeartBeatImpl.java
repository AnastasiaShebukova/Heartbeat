package org.htw.fiw.vs.implementation;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.htw.fiw.vs.interfaces.HeartBeat;
import org.htw.fiw.vs.interfaces.HeartBeatObserverInterface;
import org.htw.fiw.vs.interfaces.HeartBeatSubjectInterface;

public class HeartBeatImpl extends java.rmi.server.UnicastRemoteObject implements HeartBeat, HeartBeatObserverInterface, HeartBeatSubjectInterface  {

	int heartbeat;
	
	List<Object> observerList = new ArrayList<Object>();
	
	protected HeartBeatImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getHeartBeat() throws RemoteException {
		return this.heartbeat;
	}
	
	//die funktion k�nnte von dem REST call aufgerufen werden? Und w�rde dann den state setzen und die beaobachter benachrichtigen?
	public void setHeartBeat(int heartbeat) throws RemoteException {
		this.heartbeat = heartbeat;
		notifyObservers();
	}
	
	//das ist unklar. Die update Methode m�sste doch eigentlich auf der anderen Seite implementiert werden, und nicht beide Interfaces in einer Klasse.
	@Override
	public void update(Object observer) throws RemoteException {
	}
	
	@Override
	public void subscribeObject(Object observer) throws RemoteException {
		this.observerList.add(observer);		
	}
	
	@Override
	public void removeObject(Object observer) throws RemoteException {
		this.observerList.remove(observer);
		
	}
	@Override
	public void notifyObservers() throws RemoteException {
		for (Object observer : this.observerList) {
			update(observer);
		}
	}
}
