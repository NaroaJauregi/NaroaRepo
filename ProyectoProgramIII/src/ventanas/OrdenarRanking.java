package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utilidades.Producto;
import Ordenar.MergeSortGenerico;
import Ordenar.PrecioProductos;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrdenarRanking extends JFrame {

	private JPanel contentPane;
	private int precioProd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrdenarRanking frame = new OrdenarRanking();
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
	public OrdenarRanking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOrdenarDePrecio = new JLabel("Ordenar de precio m\u00E1s bajo a m\u00E1s alto");
		lblOrdenarDePrecio.setBounds(15, 36, 293, 20);
		contentPane.add(lblOrdenarDePrecio);
		
		JButton btnMsBarato = new JButton("M\u00E1s barato");
		btnMsBarato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				precioProd=("select precio from productos");
				MergeSortGenerico msg=new MergeSortGenerico<PrecioProductos>();
				msg.mergeSort(precioProd);
				String precio=precioProd [0].getPrecio();
			
			}
		});
		btnMsBarato.setBounds(15, 72, 115, 29);
		contentPane.add(btnMsBarato);
		
		
	}
}
