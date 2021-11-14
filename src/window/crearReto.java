package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
	File file;
	FileWriter fw;
	PrintWriter pw;
	
	private JButton btnCrearReto = new JButton("Crear Reto");
	private JButton btnSalir = new JButton("Salir");
	
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
		 
		 acciones.setLayout(new GridLayout(1,2));
		 acciones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		 add(acciones, BorderLayout.NORTH);
		
		 acciones.add(btnCrearReto);
		 acciones.add(btnSalir);
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
		 
		 file = new File("retos.txt");
			try {
				fw = new FileWriter(file,true);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			pw = new PrintWriter(fw);
		 
	     
	    
	    
	    //Botones funcionamiento
	    
		 btnCrearReto.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                Reto retotest = new Reto();
	                retotest.setNombre(tnombre.getText());
	                retotest.setFechaInicio(tFechaInicio.getText());
	                retotest.setFechaFin(tFechaFin.getText());
	                retotest.setObjetivo(tObjetivo.getText());
	                retotest.setDeporte(tDeporte.getText());
	                crearReto(retotest);
	                
	            	
	            
	            }
	        });
		 
		 btnSalir.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	dispose();
	            	new Principal();
  
	            }
	        });
		 
		 
		 
	    
		setResizable(true);
		setVisible(true);
		
}
	public Reto crearReto(Reto reto) {
		
		reto.setNombre(tnombre.getText());
		reto.setFechaInicio(tFechaInicio.getText());
		reto.setFechaFin(tFechaFin.getText());
		reto.setObjetivo(tObjetivo.getText());
		reto.setDeporte(tDeporte.getText());
		System.out.println(reto.toString());
		System.out.println(reto.getNombre());
		pw.println("Nombre: "+reto.getNombre()+ " , Fecha Inicio: " + reto.getFechaInicio()+ " , Fecha Fin: "+ reto.getFechaFin() +" , Objetivo: " + reto.getObjetivo()+ " , Deporte: "+ reto.getDeporte());
		pw.flush();
		pw.close();
	return reto;
}

	}
	
