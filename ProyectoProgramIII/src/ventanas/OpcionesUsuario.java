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

public class OpcionesUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionesUsuario frame = new OpcionesUsuario();
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
	public OpcionesUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblquDeseaRealizar = new JLabel("\u00BFQu\u00E9 desea realizar?");
		lblquDeseaRealizar.setBounds(126, 31, 207, 20);
		contentPane.add(lblquDeseaRealizar);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compra compraUsuario=new Compra();
				compraUsuario.setVisible(true);
				OpcionesUsuario.this.setVisible(false);
			}
		});
		btnComprar.setBounds(50, 101, 115, 57);
		contentPane.add(btnComprar);
		
		JButton btnNewButton_1 = new JButton("Dejar un comentario");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comentar comentarUsuario=new Comentar();
				comentarUsuario.setVisible(true);
				OpcionesUsuario.this.setVisible(false);
			}
			
		});
		btnNewButton_1.setBounds(217, 101, 196, 57);
		contentPane.add(btnNewButton_1);
	}

}
