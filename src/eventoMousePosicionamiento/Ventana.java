package eventoMousePosicionamiento;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener,MouseListener {
	private JPanel miPanel;
	private JLabel etiNombre;
	private JButton btnEsquina;
	private JButton btnCentro;
	private JButton btnAgrandar;
	private JButton btnAchicar;
	
	public Ventana() {
		iniciarComponentes();
		setTitle("Evento Mouse Posicionamiento");
	    setSize(600, 600);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		
		
	}
	
	private void iniciarComponentes()
	{
		miPanel= new JPanel();
miPanel.setLayout(null); 
	    
		etiNombre= new JLabel("Jose");
		etiNombre.setOpaque(true);
		etiNombre.setBackground(Color.LIGHT_GRAY);
		etiNombre.setBounds(150,150,100,50);
		
		btnEsquina = new JButton("Esquina");
        btnEsquina.setBounds(10, 100, 100, 30);
        btnEsquina.addActionListener(this);
        btnEsquina.addMouseListener(this);
		
        btnCentro = new JButton("Centro");
        btnCentro.setBounds(120, 100, 100, 30);
        btnCentro.addActionListener(this);
        btnCentro.addMouseListener(this);
		
        btnAgrandar = new JButton("Agrandar");
        btnAgrandar.setBounds(230, 100, 100, 30);
        btnAgrandar.addActionListener(this);
        btnAgrandar.addMouseListener(this);
		
        btnAchicar = new JButton("Achicar");
        btnAchicar.setBounds(340, 100, 100, 30);
        btnAchicar.addActionListener(this);
        btnAchicar.addMouseListener(this);
		
        miPanel.add(etiNombre);
        miPanel.add(btnEsquina);
        miPanel.add(btnCentro);
        miPanel.add(btnAgrandar);
        miPanel.add(btnAchicar);
		
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
		if (e.getSource() == btnEsquina || e.getSource() == btnCentro || e.getSource() == btnAgrandar || e.getSource() == btnAchicar) {
            JButton button = (JButton) e.getSource();
            button.setSize(button.getWidth() + 10, button.getHeight() + 5);
        }
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == btnEsquina || e.getSource() == btnCentro || e.getSource() == btnAgrandar || e.getSource() == btnAchicar) {
            JButton button = (JButton) e.getSource();
            button.setSize(button.getWidth() - 10, button.getHeight() - 5);
        }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == btnEsquina) {
            // Mover la etiqueta a la esquina superior izquierda
            etiNombre.setLocation(0, 0);
        } else if (e.getSource() == btnCentro) {
            // Centrar la etiqueta en la ventana
            int x = (getWidth() - etiNombre.getWidth()) / 2;
            int y = (getHeight() - etiNombre.getHeight()) / 2 - 20;
            etiNombre.setLocation(x, y);
        } else if (e.getSource() == btnAgrandar) {
            // Agrandar la etiqueta
            int newWidth = etiNombre.getWidth() + 20;
            int newHeight = etiNombre.getHeight() + 10;
            etiNombre.setSize(newWidth, newHeight);
        } else if (e.getSource() == btnAchicar) {
            // Achicar la etiqueta
            int newWidth = etiNombre.getWidth() - 20;
            int newHeight = etiNombre.getHeight() - 10;
            if (newWidth > 50 && newHeight > 25) { // Evitar tamaño muy pequeño
                etiNombre.setSize(newWidth, newHeight);
            }
        }
		
	}
}
