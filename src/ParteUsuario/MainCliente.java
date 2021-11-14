package ParteUsuario;

import Servidor.IServidorRemoto;
import window.login;
public class MainCliente {
	public static login clog;
	public static void main(String[] args) {
		
		if (args.length != 3) {
			System.out.println("uso: java [policy] [codebase] ParteUsuario.MainCliente [ip] [port] [name]");
			System.exit(0);
		}

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		try {
			String name = "//" + args[0] + ":" + args[1] + "/" + args[2];
			IServidorRemoto serviceStub = (IServidorRemoto) java.rmi.Naming.lookup(name);
			System.out.println("* Message comming from the server: '" + serviceStub.holaServidor() + "'");
			System.out.println("* Datos clientes: '" + serviceStub.registro() + "'");
			System.out.println("* Datos login: '" + serviceStub.login() + "'");

		} catch (Exception e) {
			System.err.println("- Exception running the client: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
