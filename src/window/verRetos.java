package window;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class verRetos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	public verRetos() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 789, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(730, 78, 17, 102);
		frame.getContentPane().add(scrollBar);
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		JList list = new JList(dlm);
		list.setBounds(24, 78, 723, 102);
		BufferedReader br2;
		String line2;
		try {
			br2 = new BufferedReader(new FileReader("retos.txt"));
			line2 = br2.readLine();
			while (line2 != null) {
				dlm.addElement(line2);
				//result2 = "Se ha logueado el usuario con: "+"Email: "+ data[4]+ " , Contraseña: "+data[7];
				line2 = br2.readLine();
			}
			br2.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frame.getContentPane().add(list);
		
		JButton btnAceptarReto = new JButton("Aceptar Reto");
		btnAceptarReto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(btnAceptarReto,
						"Vas a aceptar este reto." + ".\n              "
								+ "Estas seguro?",
						" data relation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (input == 0) {
					
					System.out.println("Reto aceptado");
				}
			}
		});
		btnAceptarReto.setBounds(24, 214, 132, 35);
		frame.getContentPane().add(btnAceptarReto);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
