package manejoColores;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener  {
	private JPanel miPanel;
	private JLabel etiTexto;
    private JButton btnAzul, btnRojo, btnVerde;
    private JButton btnFondoAzul, btnFondoRojo, btnFondoVerde;
    private JButton btnTransparente, btnOpaca;

    public Ventana() {
    	iniciarComponentes();
        setTitle("Manejo de Colores");
        setSize(400, 200);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
    private void iniciarComponentes() {
    	miPanel= new JPanel();
    	miPanel.setLayout(new FlowLayout());

        etiTexto = new JLabel("Texto de Ejemplo");
        etiTexto.setOpaque(true);
        etiTexto.setBackground(Color.WHITE);

        btnAzul = new JButton("Azul");
        btnRojo = new JButton("Rojo");
        btnVerde = new JButton("Verde");
        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoVerde = new JButton("Fondo Verde");
        btnTransparente = new JButton("Transparente");
        btnOpaca = new JButton("Opaca");

        btnAzul.addActionListener(this);
        btnRojo.addActionListener(this);
        btnVerde.addActionListener(this);
        btnFondoAzul.addActionListener(this);
        btnFondoRojo.addActionListener(this);
        btnFondoVerde.addActionListener(this);
        btnTransparente.addActionListener(this);
        btnOpaca.addActionListener(this);

        miPanel.add(etiTexto);
        miPanel.add(btnAzul);
        miPanel.add(btnRojo);
        miPanel.add(btnVerde);
        miPanel.add(btnFondoAzul);
        miPanel.add(btnFondoRojo);
        miPanel.add(btnFondoVerde);
        miPanel.add(btnTransparente);
        miPanel.add(btnOpaca);
        
        add(miPanel);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAzul) {
            etiTexto.setForeground(Color.BLUE);
        } else if (e.getSource() == btnRojo) {
            etiTexto.setForeground(Color.RED);
        } else if (e.getSource() == btnVerde) {
            etiTexto.setForeground(Color.GREEN);
        } else if (e.getSource() == btnFondoAzul) {
            etiTexto.setBackground(Color.BLUE);
        } else if (e.getSource() == btnFondoRojo) {
            etiTexto.setBackground(Color.RED);
        } else if (e.getSource() == btnFondoVerde) {
            etiTexto.setBackground(Color.GREEN);
        } else if (e.getSource() == btnTransparente) {
            etiTexto.setOpaque(false);
        } else if (e.getSource() == btnOpaca) {
            etiTexto.setOpaque(true);
        }
        etiTexto.repaint();
    }
}
