package CasaApuestas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField Identificacion;
	private JTextField Nombre;
	private JTextField Correo;
	private JTextField Contrasena;
	private JButton Continuar;
	private JLabel Fondo;
	private JComboBox Ti;
	private JLabel nombre;
	private JLabel TI;
	private JComboBox edad;
	private JLabel Genero;
	private JButton Volver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registro() {
		setTitle("Casa Apuestas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Nombre = new JTextField();
		Nombre.setColumns(10);
		Nombre.setBounds(150, 36, 233, 25);
		contentPane.add(Nombre);

		Identificacion = new JTextField();
		Identificacion.setBounds(150, 113, 182, 25);
		contentPane.add(Identificacion);
		Identificacion.setColumns(10);

		Correo = new JTextField();
		Correo.setColumns(10);
		Correo.setBounds(150, 229, 233, 25);
		contentPane.add(Correo);

		Contrasena = new JTextField();
		Contrasena.setColumns(10);
		Contrasena.setBounds(150, 268, 182, 25);
		contentPane.add(Contrasena);

		Continuar = new JButton("Continuar");
		Continuar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (Nombre.getText().isEmpty() || Identificacion.getText().isEmpty() || Correo.getText().isEmpty()
						|| Contrasena.getText().isEmpty()) {
					JOptionPane.showMessageDialog(rootPane, "Para Seguir llena el formulario");
				} else if (Nombre.getText().isEmpty() || Correo.getText().isEmpty()
						|| Identificacion.getText().length() <= 10 && Identificacion.getText().length() >= 11
						|| Contrasena.getText().length() < 8) {
					JOptionPane.showMessageDialog(rootPane, "El formulario no esta bien dilingeiado");
				} else {
					Main2 Frame = new Main2();
					Frame.setVisible(true);
					JOptionPane.showMessageDialog(rootPane, "Ingresado Completamente");
					dispose();
				}

			}
		});
		Continuar.setBounds(77, 318, 100, 30);
		contentPane.add(Continuar);

		JComboBox genero = new JComboBox();
		genero.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		genero.setModel(new DefaultComboBoxModel(
				new String[] { "Indefinido", "Masculino", "Femenino", "Hermafrodita", "Transgenero", "Generofluido",
						"GeneroBinario ", "Transexual ", "Intersexual ", "Helicoptero Apache " }));
		genero.setBounds(150, 185, 90, 30);
		contentPane.add(genero);

		Ti = new JComboBox();
		Ti.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Ti.setBackground(new Color(255, 255, 255));
		Ti.setModel(new DefaultComboBoxModel(new String[] { "Cedula de Ciudadania", "Cedula de Extrangero" }));
		Ti.setBounds(150, 72, 150, 30);
		contentPane.add(Ti);

		nombre = new JLabel("Ingrese su Nombre");
		nombre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		nombre.setBounds(23, 42, 108, 14);
		contentPane.add(nombre);

		JLabel identifiacion = new JLabel("Numero de identifiacion ");
		identifiacion.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		identifiacion.setBounds(23, 118, 127, 14);
		contentPane.add(identifiacion);

		JLabel correo = new JLabel("Ingresa su Correo");
		correo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		correo.setBounds(23, 234, 108, 14);
		contentPane.add(correo);

		JLabel contraseña = new JLabel("Ingrese su Contrase\u00F1a");
		contraseña.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contraseña.setBounds(20, 273, 120, 14);
		contentPane.add(contraseña);

		JLabel Edad = new JLabel("Ingrese su Edad");
		Edad.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Edad.setBounds(23, 154, 95, 14);
		contentPane.add(Edad);

		TI = new JLabel("Tipo de identifiacion");
		TI.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		TI.setBounds(20, 80, 120, 14);
		contentPane.add(TI);

		edad = new JComboBox();
		edad.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		edad.setModel(new DefaultComboBoxModel(new String[] { "De 18 a 29 a\u00F1os ", "De 30 a 49 a\u00F1os ",
				"De 50 a 69 a\u00F1os ", "Mas de 70 a\u00F1os" }));
		edad.setBounds(150, 149, 120, 25);
		contentPane.add(edad);

		Genero = new JLabel("Ingrese su g\u00E9nero ");
		Genero.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Genero.setBounds(23, 193, 100, 14);
		contentPane.add(Genero);

		Volver = new JButton("Volver");
		Volver.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main2 Frame = new Main2();
				Frame.setVisible(true);
				dispose();
			}
		});
		Volver.setBounds(206, 318, 100, 30);
		contentPane.add(Volver);

		Fondo = new JLabel("Fondo");
		Fondo.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\Fondo.jpg"));
		Fondo.setBounds(0, 0, 404, 381);
		contentPane.add(Fondo);
		this.setLocationRelativeTo(null);
	}
}