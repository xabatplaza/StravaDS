package window;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tEmail;
	private JLabel lContrasenya;
	private JTextField tContrasenya;
	private JButton btnIniciarGoogle;
	private JButton btnIniciarFacebook;
	private JButton btnRegistrarse;
	String line;
	String emailContra;
	public boolean log;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 562, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lEmail = new JLabel("Email");
		lEmail.setBounds(156, 29, 203, 35);
		frame.getContentPane().add(lEmail);
		
		tEmail = new JTextField();
		tEmail.setBounds(156, 75, 203, 30);
		frame.getContentPane().add(tEmail);
		tEmail.setColumns(10);
		
		lContrasenya = new JLabel("Contraseña");
		lContrasenya.setBounds(156, 116, 203, 35);
		frame.getContentPane().add(lContrasenya);
		
		tContrasenya = new JTextField();
		tContrasenya.setColumns(10);
		tContrasenya.setBounds(156, 162, 203, 30);
		frame.getContentPane().add(tContrasenya);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesión");
		btnIniciarSesion.setBounds(75, 247, 146, 23);
		frame.getContentPane().add(btnIniciarSesion);
		
		btnIniciarSesion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				comprobarEmail();
				frame.dispose();
				
			}
		});
		
		btnIniciarGoogle = new JButton("Iniciar sesión con Google");
		btnIniciarGoogle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnIniciarGoogle.setBounds(273, 225, 196, 23);
		frame.getContentPane().add(btnIniciarGoogle);
		
		btnIniciarFacebook = new JButton("Iniciar sesión con Facebook");
		btnIniciarFacebook.setBounds(273, 272, 196, 23);
		frame.getContentPane().add(btnIniciarFacebook);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(376, 344, 162, 23);
		frame.getContentPane().add(btnRegistrarse);
		btnRegistrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new registrarse();
				frame.dispose();
			}
		});
	}
	public String comprobarEmail() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("usuarios.txt"));
			line = br.readLine();
			while (line != null) {
				String data[] = line.split(" ");
				if(data[4].equals(tEmail.getText()) && data[7].equals(tContrasenya.getText())) {
					emailContra = tEmail.getText()+" "+tContrasenya.getText();
					new Principal();
					log = true;
					line = br.readLine();
				}
				else {
					System.out.println("La contraseña o email no coinciden");
					line = br.readLine();
				}
			}
			br.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return emailContra;
	}
}
