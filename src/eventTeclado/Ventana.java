package eventTeclado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements KeyListener,ActionListener{
		private JPanel miPanel;
		private JTextField txtTexto;
		private JLabel etiTexto;
		private JButton btnVaciar;	

		public Ventana() {
			iniciarComponentes();
			
			setTitle("Eventos Teclado");
			setSize(400 , 400);
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			
			
			
			
		}
		
		private void iniciarComponentes() {
			miPanel= new JPanel();
			miPanel.setLayout(null);
			
			
			txtTexto= new JTextField();
			etiTexto= new JLabel("Presiona una tecla");
			btnVaciar = new JButton("Vaciar");
			
			//Definir setBounds posicion  X  Y ,ALTURA, ANCHO
			txtTexto.setBounds(50, 50, 150 ,25);
			//addKeyListener permite que el computador atienda el evento de presionar teclado
			txtTexto.addKeyListener(this);
			
			
			etiTexto.setBounds(50,100,200,25);
			
			btnVaciar.setBounds(50,150,150,25);
			btnVaciar.addActionListener(this);
			
			miPanel.add(txtTexto);
			miPanel.add(etiTexto);
			miPanel.add(btnVaciar);
			
			add(miPanel);
			
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnVaciar) {
				txtTexto.setText("");
				etiTexto.setText("");
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// Metodo que es llamado cuando la tecla es presionada
			String text= txtTexto.getText();
			etiTexto.setText(text);
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
}
