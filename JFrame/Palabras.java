package INTERFACE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Palabras extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPalabra;
	private JTextArea textArea;
	private String Cadena = " ";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Palabras frame = new Palabras();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Palabras() {
		setForeground(new Color(255, 128, 0));
		setBackground(new Color(255, 128, 0));
		setType(Type.UTILITY);
		setTitle("DESGLOSAR PALABRAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("INGRESE PALABRA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 17, 206, 45);
		contentPane.add(lblNewLabel);

		textPalabra = new JTextField();
		textPalabra.setBounds(163, 24, 340, 32);
		contentPane.add(textPalabra);
		textPalabra.setColumns(10);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 480, 504, -360);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		textArea.setBounds(10, 122, 504, 360);
		contentPane.add(textArea);

		JButton btnNewButton = new JButton("DESGLOSAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Palabra = textPalabra.getText().toLowerCase();
				int NumL = Palabra.length();
				char[] Char = new char[NumL];
				for (int i = 0; i < NumL; i++) {
					Char[i] = Palabra.charAt(i);
				}
				for (char C : Char) {
					Cadena += C + "\n";
				}
				textArea.setText(Cadena + "\n" + "El numero de letras es igual a: " + NumL);
			}

		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 73, 206, 38);
		contentPane.add(btnNewButton);

	}
}
