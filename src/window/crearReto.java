package window;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

import Servidor.Reto;

import java.awt.*;

public class crearReto extends JFrame{
	
	private JFrame frame;
	
	private JTextField tnombre = new JTextField();
	private JLabel lnombre = new JLabel("Nombre");
	private JTextField tFechaInicio = new JTextField();
	private JLabel lFechaInicio = new JLabel("Fecha Inicio");
	private JTextField tFechaFin = new JTextField();
	private JLabel lFechaFin = new JLabel("Fecha Fin");
	private JTextField tObjetivo = new JTextField();
	private JLabel lObjetivo = new JLabel("Objetivo");
	private JTextField tDeporte = new JTextField();
	private JLabel lDeporte = new JLabel("Deporte");
	
	private JButton btnCrearReto = new JButton("Crear Reto");
	
	JPanel panel = new JPanel();
	JPanel acciones = new JPanel();
	
	
	public crearReto() {
		setTitle("Crear Reto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(700, 400);
			
		setLocationRelativeTo(null);
		setLayout(new BorderLayout()); 
		
		 panel.setLayout(new GridLayout(5,2));
		 panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		 add(panel, BorderLayout.CENTER);
		 
		 acciones.setLayout(new GridLayout(1,1));
		 acciones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		 add(acciones, BorderLayout.NORTH);
		
		 acciones.add(btnCrearReto);
		 panel.add(lnombre);
		 panel.add(tnombre);
		 panel.add(lFechaInicio);
		 panel.add(tFechaInicio);
		 panel.add(lFechaFin);
		 panel.add(tFechaFin);
		 panel.add(lObjetivo);
		 panel.add(tObjetivo);
		 panel.add(lDeporte);
		 panel.add(tDeporte);
		 
	     
	    
	    
	    //Botones funcionamiento
	    
		 btnCrearReto.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                //Crear reto
	            	
	            
	            }
	        });
		 
	    
		setResizable(true);
		setVisible(true);
		
}
	public static void main(String[] args) {
		crearReto v1  = new crearReto();
		}
	}
	
