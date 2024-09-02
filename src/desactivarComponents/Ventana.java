package desactivarComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {
	private JPanel miPanel;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JLabel txtFrase;
	private JButton btnAceptar;
	private JButton btnActivar;
	private JButton btnDesactivar;
	
	public Ventana() {
		iniciarComponentes();
		setTitle("Desactivar Componentes");
	    setSize(400, 400);
	    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	    
	    
	       	
	}
	
	private void iniciarComponentes() {
		miPanel= new JPanel();
		miPanel.setLayout(null); 
		
		 txtNombre= new JTextField();
		    txtCiudad= new JTextField();
		    txtFrase= new JLabel("Respuesta");
		    btnAceptar= new JButton("Aceptar");
		    btnActivar= new JButton("Activar");
		    btnDesactivar= new JButton("Desactivar");
		    
		    txtNombre.setBounds(20, 20, 100, 25);
	    	txtCiudad.setBounds(20, 50, 100, 25);
	    	txtFrase.setBounds(20, 100, 300, 25);
	    	
	    	btnAceptar.setBounds(7, 290, 150, 30);
	    	btnAceptar.addActionListener(this);
	    	
	    	btnActivar.setBounds(7, 325, 150, 30);
	    	btnActivar.addActionListener(this);
	    	
	    	btnDesactivar.setBounds(7, 255, 150, 30);
	    	btnDesactivar.addActionListener(this);
	    	
	    	miPanel.add(txtNombre);
	    	miPanel.add(txtCiudad);
	    	miPanel.add(txtFrase);
	    	miPanel.add(btnAceptar);
	    	miPanel.add(btnActivar);
	    	miPanel.add(btnDesactivar);
	    	
	    	add(miPanel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAceptar) {
			String nombre=txtNombre.getText();
			String ciudad=txtCiudad.getText();
			
			String frase ="Nombre :"+ nombre +" Ciudad :" +ciudad;
			
			txtFrase.setText(frase);
		}else if(e.getSource()==btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}else if(e.getSource()==btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
		}
		
	}
	
}
