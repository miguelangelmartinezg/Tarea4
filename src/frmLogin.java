import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frmLogin extends JFrame{
	public JPanel panel;
	Conexion oCon = new Conexion();
	
	public frmLogin(){
		this.setSize(500, 200);
		setLocationRelativeTo(null);
		
		InitialComponente();
	}
	private void InitialComponente() {
		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		TextBox();
		Botones();
		Label();
	
	}
	private void TextBox() {
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(140, 25, 250, 22);		
		panel.add(txtUsuario);
		
		JTextField txtPassword = new JTextField();
		txtPassword.setBounds(140, 50, 250, 22);		
		panel.add(txtPassword);
		
	}
	private void Label() {
		JLabel lblUsuario = new JLabel();
		lblUsuario.setText("Usuario:");		
		lblUsuario.setBounds(80, 10, 50, 50);		
		panel.add(lblUsuario);
		
		JLabel lblPassword = new JLabel();
		lblPassword.setText("Password:");		
		lblPassword.setBounds(80, 35, 100, 50);		
		panel.add(lblPassword);		
	}
	
	private void Botones() {
		JButton cmdLogin = new JButton();
		cmdLogin.setText("Login");		
		cmdLogin.setBounds(200, 100, 100, 40);		
		panel.add(cmdLogin);
		ActionListener ClicLogin = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(oCon.getConection() != null) {
					JOptionPane.showInputDialog(null,"Conexion Exitosa");
				}
				
				/*
				cmdLogin.setVisible(false);
				
		
				frmRegistrar oFrmRegistrar = new frmRegistrar();
				oFrmRegistrar.setVisible(true);
				*/
				
			}
			
		};
		cmdLogin.addActionListener(ClicLogin);
	
	}

}
