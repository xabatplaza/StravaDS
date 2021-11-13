package Servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServidorRemoto extends Remote {

	String holaServidor() throws RemoteException;
	
}
