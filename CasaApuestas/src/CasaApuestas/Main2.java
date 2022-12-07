package CasaApuestas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.JPasswordField;

public class Main2 extends JFrame {

	private JPanel contentPane;
	private JTextField NumeroDeIdentificacion;
	private JPasswordField Contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 frame = new Main2();
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
	public Main2() {
		setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		setTitle("Casa Apuestas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton Registrarse = new JButton("Registro");
		Registrarse.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Registrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro Frame2 = new Registro();
				Frame2.setVisible(true);
				dispose();
			}
		});
		Registrarse.setBounds(135, 300, 100, 30);
		contentPane.add(Registrarse);

		NumeroDeIdentificacion = new JTextField();
		NumeroDeIdentificacion.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		NumeroDeIdentificacion.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroDeIdentificacion.setBounds(160, 89, 150, 30);
		contentPane.add(NumeroDeIdentificacion);
		NumeroDeIdentificacion.setColumns(10);

		JButton Ingresar = new JButton("Ingresar");
		Ingresar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (NumeroDeIdentificacion.getText().equals("1022302323") && Contraseña.getText().equals("Pepito123")) {
					Ingreso Frame2 = new Ingreso();
					Frame2.setVisible(true);
					dispose();
					JOptionPane.showMessageDialog(rootPane, "Has Ingresado Correctamente");
				} else {
					JOptionPane.showMessageDialog(rootPane, "La Identificacion o la Contraseña son incorrectas");
				}
			}
		});
		Ingresar.setBounds(135, 242, 100, 30);
		contentPane.add(Ingresar);

		JLabel NI = new JLabel("N\u00FAmero de Identificaci\u00F3n");
		NI.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		NI.setHorizontalAlignment(SwingConstants.CENTER);
		NI.setBounds(10, 96, 128, 14);
		contentPane.add(NI);

		JLabel C = new JLabel("Contrase\u00F1a");
		C.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		C.setBounds(68, 142, 70, 14);
		contentPane.add(C);

		JLabel Bienvenido = new JLabel("Bienvenido a la Casa de Apuestas");
		Bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		Bienvenido.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Bienvenido.setBounds(10, 11, 334, 30);
		contentPane.add(Bienvenido);

		Contraseña = new JPasswordField();
		Contraseña.setHorizontalAlignment(SwingConstants.CENTER);
		Contraseña.setBounds(160, 135, 150, 30);
		contentPane.add(Contraseña);

		JLabel Fondo = new JLabel("Contrase\u00F1a");
		Fondo.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\Fondo.jpg"));
		Fondo.setBounds(0, 0, 350, 361);
		contentPane.add(Fondo);
		this.setLocationRelativeTo(null);
	}
}
