package eventoMouse;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements MouseListener {
	private JPanel miPanel;
	private JLabel etiPal1;
	private JLabel etiPal2;
	private JLabel etiPal3;
	private JLabel etiPal4;
	private JLabel etiOcultar;
	
	
	public Ventana() {
		iniciarComponentes();
		setTitle("Evento Mouse");
	    setSize(400, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	
	}
	
	private void iniciarComponentes() {
		miPanel= new JPanel();
		miPanel.setLayout(null); 
	    
		
		etiPal1= new JLabel("Palabra 1");
		etiPal1.setBounds(50, 50 ,100, 25);
		
		etiPal2= new JLabel("Palabra 2");
		etiPal2.setBounds(50, 80 ,100, 25);
		
		etiPal3= new JLabel("Palabra 3");
		etiPal3.setBounds(50, 110 ,100, 25);
		
		etiPal4= new JLabel("Palabra 4");
		etiPal4.setBounds(50, 140 ,100, 25);
		
		
		etiOcultar= new JLabel("Ocultar");
		etiOcultar.setBounds(200,50,150,50);
		//Hace que el color de fondo sea visible
		etiOcultar.setOpaque(true);
		//Color de fondo
		etiOcultar.setBackground(Color.LIGHT_GRAY);
		//Fuente de letra
		etiOcultar.setFont(new Font("Arial", Font.BOLD,20));
		
		
		//Escuchador de MouseListener a etiOcultar
		etiOcultar.addMouseListener(this);
		
		miPanel.add(etiPal1);
		miPanel.add(etiPal2);
		miPanel.add(etiPal3);
		miPanel.add(etiPal4);
		miPanel.add(etiOcultar);
		
		add(miPanel);
		
		
	
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == etiOcultar) {
            // Ocultar las etiquetas cuando el ratón entre en la etiqueta etiOcultar
            etiPal1.setVisible(false);
            etiPal2.setVisible(false);
            etiPal3.setVisible(false);
            etiPal4.setVisible(false);
        }
	}


	@Override
	public void mouseExited(MouseEvent e) {
		 if (e.getSource() == etiOcultar) {
	            // Mostrar las etiquetas cuando el ratón salga de la etiqueta etiOcultar
	            etiPal1.setVisible(true);
	            etiPal2.setVisible(true);
	            etiPal3.setVisible(true);
	            etiPal4.setVisible(true);
	        }
	}
}
