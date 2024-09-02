package eventMouseAsignarValue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Ventana extends JFrame implements MouseListener, ActionListener {
	 	
		private JPanel miPanel;
		private JLabel etiUna, etiDos, etiTres, etiCuatro, etiCinco, etiSeis, etiSiete, etiOcho, etiNueve, etiCero;
	    private JTextField txtNumero;
	    private JButton btnBorrar;

	    public Ventana() {
	    	iniciarComponentes();
	        setTitle("Eventos del Mouse Asignar Values");
	        setSize(400, 200);
	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	        
	        
	    }
	    
	    private void iniciarComponentes() {
	    	miPanel= new JPanel();
	    	miPanel.setLayout(null);

	        

	        txtNumero = new JTextField();
	        txtNumero.setBounds(50, 20, 300, 30);
	        
	        etiUna = new JLabel("1");
	        etiUna.setBounds(50, 70, 30, 30);
	        etiUna.addMouseListener(this);

	        etiDos = new JLabel("2");
	        etiDos.setBounds(90, 70, 30, 30);
	        etiDos.addMouseListener(this);

	        etiTres = new JLabel("3");
	        etiTres.setBounds(130, 70, 30, 30);
	        etiTres.addMouseListener(this);

	        etiCuatro = new JLabel("4");
	        etiCuatro.setBounds(170, 70, 30, 30);
	        etiCuatro.addMouseListener(this);

	        etiCinco = new JLabel("5");
	        etiCinco.setBounds(210, 70, 30, 30);
	        etiCinco.addMouseListener(this);
	        
	        etiSeis = new JLabel("6");
	        etiSeis.setBounds(250, 70, 30, 30);
	        etiSeis.addMouseListener(this);

	        etiSiete = new JLabel("7");
	        etiSiete.setBounds(290, 70, 30, 30);
	        etiSiete.addMouseListener(this);

	        etiOcho = new JLabel("8");
	        etiOcho.setBounds(330, 70, 30, 30);
	        etiOcho.addMouseListener(this);

	        etiNueve = new JLabel("9");
	        etiNueve.setBounds(370, 70, 30, 30);
	        etiNueve.addMouseListener(this);

	        etiCero = new JLabel("0");
	        etiCero.setBounds(50, 110, 30, 30);
	        etiCero.addMouseListener(this);
	        
	        btnBorrar = new JButton("Borrar");
	        btnBorrar.addActionListener(this);

	        miPanel.add(txtNumero);
	        miPanel.add(etiUna);
	        miPanel.add(etiDos);
	        miPanel.add(etiTres);
	        miPanel.add(etiCuatro);
	        miPanel.add(etiCinco);
	        miPanel.add(etiSeis);
	        miPanel.add(etiSiete);
	        miPanel.add(etiOcho);
	        miPanel.add(etiNueve);
	        miPanel.add(etiCero);
	        miPanel.add(btnBorrar);

	        add(miPanel);
	    }

	    @Override
	    public void mouseEntered(MouseEvent e) {
	    	JLabel etiqueta = (JLabel) e.getSource();
	        txtNumero.setText(txtNumero.getText() + etiqueta.getText());
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnBorrar) {
	            txtNumero.setText("");
	        }
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {}

	    @Override
	    public void mouseClicked(MouseEvent e) {}

	    @Override
	    public void mousePressed(MouseEvent e) {}

	    @Override
	    public void mouseReleased(MouseEvent e) {}

	    
}
