package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.INITIALIZE;
import org.sqlite.SQLiteConnection;

import sqlite.CreateTable;
import sqlite.SelectData;
import sqlite.Tienda;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginUsuario extends JFrame {

	Connection connection=null;
	
	private JPanel contentPane;
	private JTextField textFieldNombreUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUsuario frame = new LoginUsuario();
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
	public LoginUsuario() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreUsuario = new JLabel("Nombre usuario");
		lblNombreUsuario.setBounds(37, 49, 123, 20);
		contentPane.add(lblNombreUsuario);
		
		JLabel lblIdusuario = new JLabel("id_usuario");
		lblIdusuario.setBounds(37, 113, 92, 20);
		contentPane.add(lblIdusuario);
		
		textFieldNombreUsuario = new JTextField();
		textFieldNombreUsuario.setBounds(193, 46, 146, 26);
		contentPane.add(textFieldNombreUsuario);
		textFieldNombreUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(193, 110, 146, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String usuario=textFieldNombreUsuario.getText();	   
			String contrasenya=String.valueOf(passwordField.getPassword());
			
			String usuarioTabla="select nombre from Usuarios";
			String id_usuario = "select id_usuario from Usuarios";
			
			if (usuarioTabla.contains(usuario)){
				if(id_usuario.contains(contrasenya)){
					OpcionesUsuario opUsuarios=new OpcionesUsuario();
					opUsuarios.setVisible(true);
					LoginUsuario.this.dispose();
				}else{
					JOptionPane.showMessageDialog(LoginUsuario.this, "contraseña incorrecta");
				}
					
			}else{
				OpcionesUsuario opUsuario=new OpcionesUsuario();
				opUsuario.setVisible(true);
				LoginUsuario.this.dispose();
			}
			}
		});
		
				
			/*
			try
		        {
				String query="select * from Usuarios where id_usuario and nombre=?";
				PreparedStatement pstmt=connection.prepareStatement(query);
				pstmt.setString(1, textFieldNombreUsuario.getText());
				pstmt.setInt(0,passwordField.getPassword());
		          
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
				
				OpcionesUsuario opcUsuario=new OpcionesUsuario();
				opcUsuario.setVisible(true);
				LoginUsuario.this.setVisible(false);
			}
		});
		
		*/
		
		btnLogin.setBounds(69, 184, 115, 29);
		contentPane.add(btnLogin);
		
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginUsuario.this.dispose();
				System.exit(0);
			}
		});
		btnCancel.setBounds(251, 184, 115, 29);
		contentPane.add(btnCancel);
	}
}
