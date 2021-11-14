package window;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class crearSesion extends JFrame {
	

	private JFrame frame;
	
	private JTextField tTitulo = new JTextField();
	private JLabel lTitulo = new JLabel("Titulo");
	private JTextField tFechaInicio = new JTextField();
	private JLabel lFechaInicio = new JLabel("Fecha Inicio");
	private JTextField tDistancia = new JTextField();
	private JLabel lDistancia = new JLabel("Distancia");
	private JTextField tDuracion = new JTextField();
	private JLabel lDuracion = new JLabel("Duración");
	private JTextField tDeporte = new JTextField();
	private JLabel lDeporte = new JLabel("Deporte");
	private JTextField tHora = new JTextField();
	private JLabel lHora = new JLabel("Hora de Inicio");
	
	private JButton btnCrearSesion = new JButton("Crear Sesion");
	
	JPanel panel = new JPanel();
	JPanel acciones = new JPanel();
	
	public crearSesion() {
		setTitle("Crear Sesion de Entrenamiento");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(700, 400);
			
		setLocationRelativeTo(null);
		setLayout(new BorderLayout()); 
		
		 panel.setLayout(new GridLayout(6,2));
		 panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		 add(panel, BorderLayout.CENTER);
		 
		 acciones.setLayout(new GridLayout(1,1));
		 acciones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		 add(acciones, BorderLayout.NORTH);
		
		 acciones.add(btnCrearSesion);
		 panel.add(lTitulo);
		 panel.add(tTitulo);
		 panel.add(lDeporte);
		 panel.add(tDeporte);
		 panel.add(lDistancia);
		 panel.add(tDistancia);
		 panel.add(lFechaInicio);
		 panel.add(tFechaInicio);
		 panel.add(lHora);
		 panel.add(tHora);
		 panel.add(lDuracion);
		 panel.add(tDuracion);
		 
		 
	    //Botones funcionamiento
	    
		 btnCrearSesion.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                //Crear sesion
	            	
	            
	            }
	        });
		 
	    
		setResizable(true);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		crearSesion v2  = new crearSesion();
		}
	}




