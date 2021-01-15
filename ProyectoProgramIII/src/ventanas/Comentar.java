package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Comentar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comentar frame = new Comentar();
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
	public Comentar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(68, 65, 260, 98);
		contentPane.add(textPane);
		
		JLabel lblEscribirComentario = new JLabel("Escribir comentario:");
		lblEscribirComentario.setBounds(38, 16, 186, 20);
		contentPane.add(lblEscribirComentario);
		
		JButton btnComentar = new JButton("Comentar");
		btnComentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoComentario= textPane.getText();
			
				
				String nombre=LoginUsuario.class.getName();
				String usuario=("select*from usuarios where id_usuario=nombre");
				String comentario=("select numero_comentario from usuarios where id_usuario=nombre");
					if(textoComentario!=null){
						comentario.replace(comentario, textoComentario);
					}else{
						comentario.replace(comentario, "");
					
					
				}
			}
		});
		btnComentar.setBounds(144, 199, 115, 29);
		contentPane.add(btnComentar);
	
	
	
	}
}
