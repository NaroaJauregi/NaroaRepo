package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utilidades.Producto;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTree;

public class Compra extends JFrame {
	
	Connection connection=null;

	private JPanel contentPane;
	private DefaultListModel camisetas;

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
		
		JButton btnCAMISETAS = new JButton("CAMISETAS");
		btnCAMISETAS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String camisetas= ("select*from camisetas");
				JList lista=new Jlist();
				DefaultListModel camisetasLista=new DefaultListModel();	
				for(int i=1; i<=camisetas.length(); i++){
					camisetasLista.addElement(i);
					}
					lista.setModel(camisetasLista);
				
			}
		});
		btnCAMISETAS.setBounds(15, 82, 130, 29);
		contentPane.add(btnCAMISETAS);
		
		JButton btnPantalones = new JButton("PANTALONES");
		btnPantalones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JList<Producto> pantalones=new JList<>();
				try{
					pantalones.add(pantalones);
					
				}catch (Exception e2){
				JOptionPane.showMessageDialog(null, e2);
	
				}
				
			}
		});
		btnPantalones.setBounds(15, 127, 141, 29);
		contentPane.add(btnPantalones);
		
		JButton btnZapatillas = new JButton("ZAPATILLAS");
		btnZapatillas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JList<Producto> zapatillas=new JList<>();
				try{
					zapatillas.add(zapatillas);
					
				}catch (Exception e2){
				JOptionPane.showMessageDialog(null, e2);
				
	
				}
				
			}
		});
		btnZapatillas.setBounds(15, 178, 141, 29);
		contentPane.add(btnZapatillas);
		
		JList list = new JList();
		list.setBounds(210, 76, 203, 152);
		contentPane.add(list);
	}


	
}
