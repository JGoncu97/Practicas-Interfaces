package notaPromedio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
		private JPanel miPanel;
		private JTextField txtPrimerTrimestre, txtSegundoTrimestre, txtTercerTrimestre;
	    private JLabel etiNotaFinal, etiResultado;
	    private JButton btnCalcular;

	    public Ventana() {
	    	iniciarComponentes();
	        setTitle("Nota Final de Estudiantes");
	        setSize(400, 300);
	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	        	        
	    }
	    
	    private void iniciarComponentes() {
	    	miPanel= new JPanel();
	    	miPanel.setLayout(new FlowLayout());

	        txtPrimerTrimestre = new JTextField(5);
	        txtSegundoTrimestre = new JTextField(5);
	        txtTercerTrimestre = new JTextField(5);

	        etiNotaFinal = new JLabel("Nota Final: ");
	        etiResultado = new JLabel("Resultado: ");

	        btnCalcular = new JButton("Calcular");
	        btnCalcular.addActionListener(this);

	        miPanel.add(new JLabel("Primer Trimestre: "));
	        miPanel.add(txtPrimerTrimestre);
	        miPanel.add(new JLabel("Segundo Trimestre: "));
	        miPanel.add(txtSegundoTrimestre);
	        miPanel.add(new JLabel("Tercer Trimestre: "));
	        miPanel.add(txtTercerTrimestre);
	        miPanel.add(btnCalcular);
	        miPanel.add(etiNotaFinal);
	        miPanel.add(etiResultado);
	        
	        add(miPanel);

	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnCalcular) {
	            try {
	                double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
	                double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
	                double nota3 = Double.parseDouble(txtTercerTrimestre.getText());

	                double notaFinal = (nota1 + nota2 + nota3) / 3;
	                etiNotaFinal.setText("Nota Final: " + notaFinal);

	                if (notaFinal < 5) {
	                    etiResultado.setText("Resultado: SUSPENSO");
	                    etiNotaFinal.setForeground(Color.RED);
	                    etiResultado.setForeground(Color.RED);
	                } else {
	                    etiResultado.setText("Resultado: APROBADO");
	                    etiNotaFinal.setForeground(Color.BLACK);
	                    etiResultado.setForeground(Color.BLACK);
	                }
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    }

}
