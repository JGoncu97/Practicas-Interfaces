package concatenarDatos;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
		private JPanel miPanel;
		private JTextField txtPalabra1, txtPalabra2;
	    private JLabel etiTexto;
	    private JButton btnConcatena;

	    public Ventana() {
	    	iniciarComponentes();
	        setTitle("Concatenar Datos");
	        setSize(400, 200);
	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	        

	        
	    }
	    
	    private void iniciarComponentes() {
	    	miPanel= new JPanel();
	    	miPanel.setLayout(new FlowLayout());
	    	txtPalabra1 = new JTextField(10);
	        txtPalabra2 = new JTextField(10);
	        etiTexto = new JLabel("Resultado: ");
	        btnConcatena = new JButton("Concatena");

	        btnConcatena.addActionListener(this);

	        miPanel.add(new JLabel("Palabra 1:"));
	        miPanel.add(txtPalabra1);
	        miPanel.add(new JLabel("Palabra 2:"));
	        miPanel.add(txtPalabra2);
	        miPanel.add(btnConcatena);
	        miPanel.add(etiTexto);
	        
	        add(miPanel);
	        
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnConcatena) {
	            String palabra1 = txtPalabra1.getText();
	            String palabra2 = txtPalabra2.getText();
	            etiTexto.setText("Resultado: " + palabra1 + palabra2);
	        }
	    }
}
