package tarea;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    private JTextField nombreField;
    private JTextField materiaField;
    private JTextField nota1Field;
    private JTextField nota2Field;
    private JTextField nota3Field;
    private JTextArea resultadoArea;

    public Ventana() {
        // Configurar JFrame
        setTitle("Calcular Promedio Notas");
        setSize(400, 400);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(null);  // Desactivar el LayoutManager

        // Crear los componentes
        JLabel nombreLabel = new JLabel("Nombre");
        nombreField = new JTextField(20);

        JLabel materiaLabel = new JLabel("Materia");
        materiaField = new JTextField(20);

        JLabel nota1Label = new JLabel("Nota 1:");
        nota1Field = new JTextField(5);

        JLabel nota2Label = new JLabel("Nota 2:");
        nota2Field = new JTextField(5);

        JLabel nota3Label = new JLabel("Nota 3:");
        nota3Field = new JTextField(5);

        resultadoArea = new JTextArea(5, 20);
        resultadoArea.setEditable(false);
        
        JButton calcularButton = new JButton("Calcular Promedio");
        JButton limpiarButton = new JButton("Limpiar");
        JButton cerrarButton = new JButton("Cerrar");

        // Ajustar el tamaño y la posición de los componentes
        nombreLabel.setBounds(20, 20, 100, 25);
        nombreField.setBounds(130, 20, 200, 25);

        materiaLabel.setBounds(20, 60, 100, 25);
        materiaField.setBounds(130, 60, 200, 25);

        nota1Label.setBounds(20, 100, 100, 25);
        nota1Field.setBounds(130, 100, 100, 25);

        nota2Label.setBounds(20, 140, 100, 25);
        nota2Field.setBounds(130, 140, 100, 25);

        nota3Label.setBounds(20, 180, 100, 25);
        nota3Field.setBounds(130, 180, 100, 25);

        resultadoArea.setBounds(20, 220, 340, 100);

        calcularButton.setBounds(7, 320, 150, 30);
        limpiarButton.setBounds(168, 320, 100, 30);
        cerrarButton.setBounds(274, 320, 100, 30);

        // Agregar los eventos a los botones
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPromedio();
            }
        });

        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });

        // Agregar los componentes al JFrame
        add(nombreLabel);
        add(nombreField);
        add(materiaLabel);
        add(materiaField);
        add(nota1Label);
        add(nota1Field);
        add(nota2Label);
        add(nota2Field);
        add(nota3Label);
        add(nota3Field);
        add(resultadoArea);
        add(calcularButton);
        add(limpiarButton);
        add(cerrarButton);

        setVisible(true);
    }

    private void calcularPromedio() {
        try {
            String nombre = nombreField.getText();
            String materia = materiaField.getText();
            double nota1 = Double.parseDouble(nota1Field.getText());
            double nota2 = Double.parseDouble(nota2Field.getText());
            double nota3 = Double.parseDouble(nota3Field.getText());
            double promedio = (nota1 + nota2 + nota3) / 3;

            String resultado ="Nombre: " + nombre + "\n"
		                    + "Materia: " + materia + "\n"
		                    + "Promedio: " + String.format("%.2f", promedio);
            resultadoArea.setText(resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos para las notas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos() {
        nombreField.setText("");
        materiaField.setText("");
        nota1Field.setText("");
        nota2Field.setText("");
        nota3Field.setText("");
        resultadoArea.setText("");
    }

    
}
