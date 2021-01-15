package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		lblquDeseaRealizar.setBounds(118, 37, 200, 20);
		contentPane.add(lblquDeseaRealizar);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compra compraAdmin=new Compra();
				compraAdmin.setVisible(true);
				OpcionesAdministrador.this.setVisible(false);
				}
			});
		btnComprar.setBounds(136, 73, 115, 29);
		contentPane.add(btnComprar);
		
		JButton btnDejarUnComentario = new JButton("Dejar un comentario");
		btnDejarUnComentario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comentar comentarAdmin=new Comentar();
				comentarAdmin.setVisible(true);
				OpcionesAdministrador.this.setVisible(false);
			}
			
		});
		btnDejarUnComentario.setBounds(105, 109, 177, 29);
		contentPane.add(btnDejarUnComentario);
		
		JButton btnAdministracin = new JButton("Administraci\u00F3n");
		btnAdministracin.setBounds(126, 149, 138, 29);
		contentPane.add(btnAdministracin);
		
		JButton btnCompararProductos = new JButton("Comparar Productos");
		btnCompararProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			OrdenarRanking ranking=new OrdenarRanking();
			ranking.setVisible(true);
			OpcionesAdministrador.this.setVisible(false);
			}
		});
		btnCompararProductos.setBounds(90, 185, 203, 29);
		contentPane.add(btnCompararProductos);
	}
}
