package Servidor;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ServidorRemoto extends UnicastRemoteObject implements IServidorRemoto {

	protected ServidorRemoto() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cont = 0;
	
	public String holaServidor(){
		cont++;
		System.out.println(" * Client number: " + cont);
		return "Hola mundo!";
	}
	public String login() {
		return "";
	}
	public String registrarse() {
		return "";
	}
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("usage: java [policy] [codebase] Servidor.ServidorRemoto [ip] [port] [name]");
			System.exit(0);
		}

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];

		try {		
			ServidorRemoto serviceObject = new ServidorRemoto();
			Naming.rebind(name, serviceObject);
			System.out.println("* Server '" + name + "' active and waiting...");
		} catch (Exception e) {
			System.err.println("- Exception running the server: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
