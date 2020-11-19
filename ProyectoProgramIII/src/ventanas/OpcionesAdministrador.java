package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class OpcionesAdministrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionesAdministrador frame = new OpcionesAdministrador();
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
	public OpcionesAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblquDeseaRealizar = new JLabel("\u00BFQu\u00E9 desea realizar?");
		lblquDeseaRealizar.setBounds(126, 37, 200, 20);
		contentPane.add(lblquDeseaRealizar);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(136, 85, 115, 29);
		contentPane.add(btnComprar);
		
		JButton btnDejarUnComentario = new JButton("Dejar un comentario");
		btnDejarUnComentario.setBounds(110, 130, 177, 29);
		contentPane.add(btnDejarUnComentario);
		
		JButton btnAdministracin = new JButton("Administraci\u00F3n");
		btnAdministracin.setBounds(126, 175, 138, 29);
		contentPane.add(btnAdministracin);
	}

}
