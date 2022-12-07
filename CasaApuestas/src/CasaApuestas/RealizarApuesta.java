package CasaApuestas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Currency;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class RealizarApuesta extends JFrame {

	private JPanel contentPane;
	private JLabel Equipos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarApuesta frame = new RealizarApuesta();
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

	public RealizarApuesta() {
		setTitle("Casa Apuestas");
		NumberFormat Cop_promedio = NumberFormat.getCurrencyInstance();
		Cop_promedio.setCurrency(Currency.getInstance("COP"));

		int ValorApostar = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Cuanto desea apostar: ", null));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel va = new JLabel("Valor de la apuesta " + Cop_promedio.format(ValorApostar));
		va.setHorizontalAlignment(SwingConstants.CENTER);
		va.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		va.setBounds(31, 39, 393, 14);
		contentPane.add(va);

		JLabel Bienvenido = new JLabel("BIENVENIDO A SU CASA DE APUESTAS :3");
		Bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		Bienvenido.setFont(new Font("Monospaced", Font.PLAIN, 14));
		Bienvenido.setBounds(31, 11, 393, 14);
		contentPane.add(Bienvenido);

		Equipos = new JLabel("A qu\u00E9 equipo va dirigida la apuesta");
		Equipos.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Equipos.setBounds(31, 81, 210, 18);
		contentPane.add(Equipos);

		JComboBox equipo = new JComboBox();
		equipo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		equipo.setModel(new DefaultComboBoxModel(new String[] { "Marrueos ", "Espa\u00F1a", "Portugal ", "Suiza ",
				"Croacia ", "Brasil ", "Paises bajos ", "Argentina " }));
		equipo.setBounds(290, 81, 82, 20);
		contentPane.add(equipo);

		JLabel Motivacion = new JLabel("Muchisima suerte en su apuesta, No olvide reclamar su premio");
		Motivacion.setHorizontalAlignment(SwingConstants.CENTER);
		Motivacion.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Motivacion.setBounds(10, 122, 414, 20);
		contentPane.add(Motivacion);

		JButton Apostar = new JButton("Apostar");
		Apostar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		Apostar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingreso Frame2 = new Ingreso();
				Apuesta apuesta = new Apuesta(equipo.getSelectedItem().toString(), ValorApostar);				
				Frame2.setVisible(true);
				dispose();
				JOptionPane.showMessageDialog(rootPane, "La apuesta a sido realizada corretamente");				
			}
		});
		Apostar.setBounds(91, 153, 89, 23);
		contentPane.add(Apostar);

		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingreso Frame2 = new Ingreso();
				Frame2.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(250, 153, 89, 23);
		contentPane.add(btnVolver);

		JLabel Fondo = new JLabel("Fondo");
		Fondo.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\Fondo.jpg"));
		Fondo.setBounds(0, 0, 434, 187);
		contentPane.add(Fondo);
		this.setLocationRelativeTo(null);
	}
}
