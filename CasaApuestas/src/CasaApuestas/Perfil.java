package CasaApuestas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Perfil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil frame = new Perfil();
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
	public Perfil() {
		setTitle("Casa Apuestas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Bienvenido = new JLabel("Bienvenido a la Casa de Apuestas");
		Bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		Bienvenido.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Bienvenido.setBounds(10, 11, 314, 30);
		contentPane.add(Bienvenido);
		
		JLabel Perfil = new JLabel("Perfil Usuario");
		Perfil.setHorizontalAlignment(SwingConstants.CENTER);
		Perfil.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Perfil.setBounds(10, 52, 314, 30);
		contentPane.add(Perfil);
		
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Nombre.setBounds(23, 93, 108, 14);
		contentPane.add(Nombre);
		
		JLabel Identifiacion = new JLabel("Numero de Identifiacion ");
		Identifiacion.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Identifiacion.setBounds(23, 169, 127, 14);
		contentPane.add(Identifiacion);
		
		JLabel correo = new JLabel("Correo");
		correo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		correo.setBounds(23, 322, 108, 14);
		contentPane.add(correo);
		
		JLabel contraseña = new JLabel("Fecha de Nacimiento");
		contraseña.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contraseña.setBounds(23, 208, 120, 14);
		contentPane.add(contraseña);
		
		JLabel Edad = new JLabel("Edad");
		Edad.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Edad.setBounds(23, 244, 95, 14);
		contentPane.add(Edad);
		
		JLabel TI = new JLabel("Tipo de identifiacion");
		TI.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		TI.setBounds(20, 131, 120, 14);
		contentPane.add(TI);
		
		JLabel Genero = new JLabel("G\u00E9nero ");
		Genero.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Genero.setBounds(23, 281, 100, 14);
		contentPane.add(Genero);
		
		JLabel nombre = new JLabel("Pepito Alfredo Lopez");
		nombre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		nombre.setBounds(177, 93, 108, 14);
		contentPane.add(nombre);
		
		JLabel identifiacion = new JLabel("1022302323");
		identifiacion.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		identifiacion.setBounds(177, 169, 127, 14);
		contentPane.add(identifiacion);
		
		JLabel Correo = new JLabel("PepitoLopez@gmail.com");
		Correo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Correo.setBounds(177, 322, 127, 14);
		contentPane.add(Correo);
		
		JLabel FN = new JLabel("01/dic/1992");
		FN.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		FN.setBounds(177, 208, 120, 14);
		contentPane.add(FN);
		
		JLabel edad = new JLabel("30");
		edad.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		edad.setBounds(177, 244, 95, 14);
		contentPane.add(edad);
		
		JLabel Cedula = new JLabel("Cedula");
		Cedula.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Cedula.setBounds(174, 131, 120, 14);
		contentPane.add(Cedula);
		
		JLabel genero = new JLabel("Indefinido");
		genero.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		genero.setBounds(177, 281, 100, 14);
		contentPane.add(genero);
		
		JButton Volver = new JButton("Volver");
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingreso Frame2 = new Ingreso();
				Frame2.setVisible(true);
				dispose();
			}
		});
		Volver.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Volver.setBounds(120, 377, 89, 23);
		contentPane.add(Volver);
		
		JLabel Fondo = new JLabel("Contrase\u00F1a");
		Fondo.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\Fondo.jpg"));
		Fondo.setBounds(0, 0, 334, 411);
		contentPane.add(Fondo);
		this.setLocationRelativeTo(null);
	}
}
