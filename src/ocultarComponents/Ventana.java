package ocultarComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
	private JPanel miPanel;
	private JLabel etiNombre;
	private JLabel etiCiudad;
	private JButton btnOcultarNombre;
	private JButton btnVisuNombre;
	private JButton btnOcultarCiudad;
	private JButton btnVisuCiudad;
	
	public Ventana() {
		
		iniciarComponentes();
	    // Configurar JFrame
        setTitle("Ocultar Componentes");
        setSize(400, 400);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
		
	}
	
	private void iniciarComponentes() {
		miPanel= new JPanel();
		miPanel.setLayout(null);  
        
        etiNombre= new JLabel("Nombre");
        etiCiudad= new JLabel("Ciudad");
        
        btnOcultarNombre= new JButton("Ocultar Nombre");
        btnOcultarNombre.addActionListener(this);
    	btnVisuNombre= new JButton("Visualizar Nombre");
    	btnVisuNombre.addActionListener(this);
    	btnOcultarCiudad= new JButton("Ocultar Ciudad");
    	btnOcultarCiudad.addActionListener(this);
    	btnVisuCiudad= new JButton("Visualizar Ciudad");
    	btnVisuCiudad.addActionListener(this);
    	
    	etiNombre.setBounds(20, 20, 100, 25);
    	etiCiudad.setBounds(20, 40, 100, 25);
    	
    	btnOcultarNombre.setBounds(7, 290, 150, 30);
    	btnVisuNombre.setBounds(7, 325, 150, 30);
    	btnOcultarCiudad.setBounds(7, 255, 150, 30);
    	btnVisuCiudad.setBounds(7, 220, 150, 30);
        
    	miPanel.add(etiNombre);
    	miPanel.add(etiCiudad);
    	miPanel.add(btnOcultarNombre);
    	miPanel.add(btnVisuNombre);
    	miPanel.add(btnOcultarCiudad);
    	miPanel.add(btnVisuCiudad);
        
    	add(miPanel);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOcultarNombre ) {
			etiNombre.setVisible(false);
			
		}if(e.getSource()==btnOcultarCiudad) {
			etiCiudad.setVisible(false); 
		}else if(e.getSource()==btnVisuNombre) {
			etiNombre.setVisible(true);
		}else if(e.getSource()==btnVisuCiudad) {
			etiCiudad.setVisible(true); 
		}
	}
	
	
	
}
