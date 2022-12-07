package CasaApuestas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Currency;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Ingreso extends JFrame {

	private JPanel contentPane;
	private int saldo;
	private int recarga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingreso frame = new Ingreso();
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
	public Ingreso() {
		setTitle("Casa Apuestas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton Apuesta = new JButton("Realizar Apuesta");
		Apuesta.setFont(new Font("Monospaced", Font.PLAIN, 15));
		Apuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealizarApuesta Frame2 = new RealizarApuesta();
				Frame2.setVisible(true);
				dispose();
			}
		});
		Apuesta.setBounds(180, 11, 178, 189);
		contentPane.add(Apuesta);

		JButton Volver = new JButton("Cerrar Sesion");
		Volver.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Volver.setBounds(368, 177, 115, 23);
		contentPane.add(Volver);

		JButton CambiarCuenta = new JButton("Cambiar Cuenta");
		CambiarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main2 Frame = new Main2();
				Frame.setVisible(true);
				dispose();
			}
		});
		CambiarCuenta.setHorizontalAlignment(SwingConstants.LEFT);
		CambiarCuenta.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		CambiarCuenta.setBounds(366, 145, 120, 25);
		contentPane.add(CambiarCuenta);

		JButton Perfil = new JButton("Perfil");
		Perfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Perfil Frame2 = new Perfil();
				Frame2.setVisible(true);
				dispose();
			}
		});
		Perfil.setFont(new Font("Monospaced", Font.PLAIN, 20));
		Perfil.setBounds(10, 11, 160, 189);
		contentPane.add(Perfil);

		JLabel Fondo = new JLabel("New label");
		Fondo.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\Fondo.jpg"));
		Fondo.setLabelFor(Fondo);
		Fondo.setBounds(0, 0, 493, 226);
		contentPane.add(Fondo);
		this.setLocationRelativeTo(null);
	}
}
