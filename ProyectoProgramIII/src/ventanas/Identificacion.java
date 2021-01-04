package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Naroa Jauregi
 * 
 * Es la primera ventana, donde la persona se identifica como administrador o usuario
 *
 */

public class Identificacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Identificacion frame = new Identificacion();
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
	public Identificacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUsuario = new JButton("Usuario");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginUsuario usuario=new LoginUsuario();
				usuario.setVisible(true);
				Identificacion.this.setVisible(false);
				
			}
		});
		btnUsuario.setBounds(56, 85, 115, 29);
		contentPane.add(btnUsuario);
		
		
		
		JButton btnAdministrador = new JButton("Administrador");
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAdministrador admin=new LoginAdministrador();
				admin.setVisible(true);
				Identificacion.this.setVisible(false);
			}
		});
		btnAdministrador.setBounds(232, 85, 139, 29);
		contentPane.add(btnAdministrador);
		
	}

}
