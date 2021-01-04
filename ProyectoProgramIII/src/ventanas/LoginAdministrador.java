package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sqlite.GestionBaseDatos;
import utilidades.Administrador;
import utilidades.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.nio.channels.SelectionKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Naroa Jauregi
 * 
 * Si la persona hace click en adimistrador, tendrá que ntroducir su nombre de administrador y su id_administrador 
 *
 */

public class LoginAdministrador extends JFrame {

	Connection connection=null;
	
	private JPanel contentPane;
	private JTextField textFieldNombreAdministrador;
	private JPasswordField passwordField;
	private ArrayList<Administrador> administradores;
	private ArrayList<Usuario> usuarios;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdministrador frame = new LoginAdministrador();
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
	public LoginAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		GestionBaseDatos bd=new GestionBaseDatos("Tienda.db");
		
		
		JLabel lblUsuario = new JLabel("Nombre Administrador");
		lblUsuario.setBounds(56, 50, 174, 20);
		contentPane.add(lblUsuario);
		
		JLabel lblIdadministrador = new JLabel("id_administrador");
		lblIdadministrador.setBounds(56, 118, 125, 20);
		contentPane.add(lblIdadministrador);
		
		textFieldNombreAdministrador = new JTextField();
		textFieldNombreAdministrador.setBounds(245, 47, 146, 26);
		contentPane.add(textFieldNombreAdministrador);
		textFieldNombreAdministrador.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(245, 115, 146, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
				
				try
		        {
				String query="select * from usuarios where nombre=? and id_usuarios=?";
				PreparedStatement pstmt=connection.prepareStatement(query);
				pstmt.setString(0, textFieldNombreAdministrador.getText());
				pstmt.setString(1,passwordField.getText());
		          
		          ResultSet rs=pstmt.executeQuery();
		          int count=0;
		          while (rs.next()){
		        	  count++;
		          }
		          if(count==1)
		          {
		        	  JOptionPane.showMessageDialog(null, "usuario y contraseña correctos");
		          }
		          else if (count>1)
		          {
		        	  JOptionPane.showMessageDialog(null, "usuario y contaseña duplicados");
		          }
		          else{
		        	  JOptionPane.showMessageDialog(null, "usuario y contaseña incorrectos. Intentalo de nuevo.");
		          }
		        	  
		     
				rs.close();
				pstmt.close();
				
		        }
		        catch (SQLException e1)
		        {
		           JOptionPane.showMessageDialog(null, e1);
		        }
				
				OpcionesAdministrador opcAdmin=new OpcionesAdministrador();
				opcAdmin.setVisible(true);
				LoginAdministrador.this.setVisible(false);
				
			}
		});
		
				
		btnLogin.setBounds(100, 187, 115, 29);
		contentPane.add(btnLogin);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAdministrador.this.dispose();
				System.exit(0);
			}
		});
		btnCancelar.setBounds(245, 187, 115, 29);
		contentPane.add(btnCancelar);
	}

}
