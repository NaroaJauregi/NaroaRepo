package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Compra extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compra frame = new Compra();
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
	public Compra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblquDeseaComprar = new JLabel("\u00BFQu\u00E9 desea comprar?");
		lblquDeseaComprar.setBounds(128, 33, 236, 20);
		contentPane.add(lblquDeseaComprar);
		
		JButton btnCamisetas = new JButton("Camisetas");
		btnCamisetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCamisetas.setBounds(15, 99, 115, 29);
		contentPane.add(btnCamisetas);
		
		JButton btnPantalones = new JButton("Pantalones");
		btnPantalones.setBounds(159, 99, 115, 29);
		contentPane.add(btnPantalones);
		
		JButton btnZapatillas = new JButton("Zapatillas");
		btnZapatillas.setBounds(298, 99, 115, 29);
		contentPane.add(btnZapatillas);
	}

}
