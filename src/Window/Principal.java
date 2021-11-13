import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;


	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 864, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCrearReto = new JButton("Crear Reto");
		btnCrearReto.setBounds(10, 72, 169, 45);
		frame.getContentPane().add(btnCrearReto);
		
		JButton btnCrearEntrenamiento = new JButton("Crear Entrenamiento");
		btnCrearEntrenamiento.setBounds(218, 72, 169, 45);
		frame.getContentPane().add(btnCrearEntrenamiento);
		
		JButton btnObtenerReto = new JButton("Ver los retos");
		btnObtenerReto.setBounds(437, 72, 169, 45);
		frame.getContentPane().add(btnObtenerReto);
		
		JButton btnAceptarReto = new JButton("Aceptar Reto");
		btnAceptarReto.setBounds(657, 72, 169, 45);
		frame.getContentPane().add(btnAceptarReto);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(678, 207, 89, 33);
		frame.getContentPane().add(btnLogout);
		
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new login();
				frame.dispose();
			}
		});
		
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
}