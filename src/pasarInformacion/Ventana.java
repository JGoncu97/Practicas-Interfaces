package pasarInformacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
	private JPanel miPanel;
	private JTextField txtTexto;
	private JButton btnTrasPasa1;
	private JButton btnTrasPasa2;
	private JLabel etiText1;
	private JLabel etiText2;
	
	
	public Ventana() {
		iniciarComponentes();
	// Configurar JFrame
    setTitle("Pasar Informacion");
    setSize(400, 400);
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    
	
	}
	
	private void iniciarComponentes() {
		miPanel= new JPanel();
		miPanel.setLayout(null); 
	    
	    txtTexto = new JTextField(20);
	    btnTrasPasa1 = new JButton("Traspasar 1");
	    btnTrasPasa1.addActionListener(this);
	    btnTrasPasa2 = new JButton("Traspasar 2");
	    btnTrasPasa2.addActionListener(this);
	    etiText1 = new JLabel("Etiqueta 1");
	    etiText2 = new JLabel("Etiqueta 2");
	    
	    txtTexto.setBounds(20, 20, 100, 25);
	    
	    etiText1.setBounds(20, 40, 100, 25);
	    etiText2.setBounds(20, 60, 100, 25);
	    
	    btnTrasPasa1.setBounds(7, 290, 150, 30);
		btnTrasPasa2.setBounds(7, 325, 150, 30);
		
		miPanel.add(txtTexto);
		miPanel.add(etiText1);
		miPanel.add(etiText2);
		miPanel.add(btnTrasPasa1);
		miPanel.add(btnTrasPasa2);
		
		add(miPanel);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTrasPasa1 ) {
			
			String text=txtTexto.getText();
			etiText1.setText(text);
			
		}else if(e.getSource()==btnTrasPasa2) {
			
			String text=txtTexto.getText();
			etiText2.setText(text);
		}
		
	}
	
}
