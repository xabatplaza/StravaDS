package Servidor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ParteUsuario.usuario;
import window.Principal;
import window.registrarse;


public class ServidorRemoto extends UnicastRemoteObject implements IServidorRemoto {
	registrarse registrar;
	String line;
	String loginS;
	String line2;
	String result2;
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
		BufferedReader br2;
		result2 = "";
		try {
			br2 = new BufferedReader(new FileReader("usuarios.txt"));
			line2 = br2.readLine();
			while (line2 != null) {
				String data[] = line2.split(" ");
				System.out.println("Se ha logueado el usuadio con: "+"Email: "+data[4]+" , Contraseña: "+data[7]);
				result2 = "Se ha logueado el usuadio con: "+"Email: "+ data[4]+ " , Contraseña: "+data[7];
				return result2;
			}
			br2.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return result2;
	}
	public String registro() {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
			line = br.readLine();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Cliente con los datos: " + line);
		return line;
		
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
