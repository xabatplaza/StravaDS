package window;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ParteUsuario.usuario;

import javax.swing.JButton;

public class registrarse {

	private JFrame frame;
	public JTextField tNombre;
	private JTextField tEmail;
	private JTextField tPeso;
	private JTextField tAltura;
	private JTextField tFrecCardMax;
	private JTextField tFrecCardReposo;
	private JTextField tContrasenya;
	private JTextField tRepetirContrasenya;
	public usuario usuarioDefinitivo;
	File file;
	FileWriter fw;
	PrintWriter pw;
	/**
	 * Create the application.
	 */
	public registrarse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 682, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		file = new File("usuarios.txt");
		try {
			fw = new FileWriter(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		pw = new PrintWriter(fw);
		JLabel lNombre = new JLabel("Nombre:");
		lNombre.setBounds(37, 44, 184, 25);
		frame.getContentPane().add(lNombre);
		
		tNombre = new JTextField();
		tNombre.setBounds(35, 82, 171, 25);
		frame.getContentPane().add(tNombre);
		tNombre.setColumns(10);
		
		JLabel lEmail = new JLabel("Email:");
		lEmail.setBounds(39, 121, 184, 25);
		frame.getContentPane().add(lEmail);
		
		tEmail = new JTextField();
		tEmail.setColumns(10);
		tEmail.setBounds(37, 159, 171, 25);
		frame.getContentPane().add(tEmail);
		
		JLabel lFechaNac = new JLabel("Fecha de Nacimiento:");
		lFechaNac.setBounds(37, 208, 184, 25);
		frame.getContentPane().add(lFechaNac);
		
		JLabel lPeso = new JLabel("Peso(kg):");
		lPeso.setBounds(39, 296, 184, 25);
		frame.getContentPane().add(lPeso);
		
		tPeso = new JTextField();
		tPeso.setColumns(10);
		tPeso.setBounds(37, 334, 171, 25);
		frame.getContentPane().add(tPeso);
		
		JLabel lAltura = new JLabel("Altura(cm):");
		lAltura.setBounds(39, 384, 184, 25);
		frame.getContentPane().add(lAltura);
		
		tAltura = new JTextField();
		tAltura.setColumns(10);
		tAltura.setBounds(37, 422, 171, 25);
		frame.getContentPane().add(tAltura);
		
		JLabel lFrecCardMax = new JLabel("Frecuencia Cardíaca Máxima:");
		lFrecCardMax.setBounds(310, 44, 184, 25);
		frame.getContentPane().add(lFrecCardMax);
		
		tFrecCardMax = new JTextField();
		tFrecCardMax.setColumns(10);
		tFrecCardMax.setBounds(308, 82, 171, 25);
		frame.getContentPane().add(tFrecCardMax);
		
		JLabel lFrecCardReposo = new JLabel("Frecuencia Cardíaca en Reposo:");
		lFrecCardReposo.setBounds(312, 121, 230, 25);
		frame.getContentPane().add(lFrecCardReposo);
		
		tFrecCardReposo = new JTextField();
		tFrecCardReposo.setColumns(10);
		tFrecCardReposo.setBounds(310, 159, 171, 25);
		frame.getContentPane().add(tFrecCardReposo);
		
		JLabel lContrasenya = new JLabel("Contraseña:");
		lContrasenya.setBounds(310, 208, 184, 25);
		frame.getContentPane().add(lContrasenya);
		
		tContrasenya = new JTextField();
		tContrasenya.setColumns(10);
		tContrasenya.setBounds(308, 246, 171, 25);
		frame.getContentPane().add(tContrasenya);
		
		JLabel lRepetirContrasenya = new JLabel("Repetir Contraseña:");
		lRepetirContrasenya.setBounds(310, 296, 184, 25);
		frame.getContentPane().add(lRepetirContrasenya);
		
		tRepetirContrasenya = new JTextField();
		tRepetirContrasenya.setColumns(10);
		tRepetirContrasenya.setBounds(308, 334, 171, 25);
		frame.getContentPane().add(tRepetirContrasenya);
		
		JButton btnRegistrar = new JButton("Registrarse");
		btnRegistrar.setBounds(341, 408, 104, 23);
		frame.getContentPane().add(btnRegistrar);
		
		usuarioDefinitivo = new usuario();
		btnRegistrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				crearRegistro(usuarioDefinitivo);
				
			}
		});
		
		JButton btnRegisGoogle = new JButton("Registrarse con Google");
		btnRegisGoogle.setBounds(341, 453, 201, 23);
		frame.getContentPane().add(btnRegisGoogle);
		
		JButton btnRegisFacebook = new JButton("Registrarse con Facebook");
		btnRegisFacebook.setBounds(341, 498, 201, 23);
		frame.getContentPane().add(btnRegisFacebook);
		
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		

	}
	public usuario crearRegistro(usuario user) {
		if (tContrasenya.getText().equals(tRepetirContrasenya.getText())) {
			user.setNombre(tNombre.getText());
			user.setEmail(tEmail.getText());
			user.setContrasenya(tContrasenya.getText());
			Integer peso = Integer.parseInt(tPeso.getText());
			float fPeso = peso.floatValue();
			user.setPeso(fPeso);
			Integer altura = Integer.parseInt(tAltura.getText());
			float fAltura = altura.floatValue();
			user.setAltura(fAltura);
			user.setFrecCardMax(Integer.parseInt(tFrecCardMax.getText()));
			user.setFrecCardRepo(Integer.parseInt(tFrecCardReposo.getText()));
			System.out.println(user.toString());
			System.out.println(user.getNombre());
			pw.println("Nombre: "+user.getNombre()+ " , Email: " + user.getEmail()+ " , Contraseña: "+ user.getContrasenya() +" , Peso: " + user.getPeso()+ " , Altura: "+ user.getAltura()+ " , Frecuencia Cardiaca Maxima: "+ user.getFrecCardMax()+ " , Frecuencia Cardiaca en Reposo: "+ user.getFrecCardRepo());
			pw.flush();
			pw.close();
		}else {
			System.out.println("Error. La contraseña no es igual");
		}
		return user;
	}
	
	

}
