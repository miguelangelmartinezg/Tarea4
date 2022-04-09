import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frmRegistrar  extends JFrame {
public JPanel panel;
	
	public frmRegistrar(){
		this.setSize(500, 300);
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
		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(140, 25, 250, 22);		
		panel.add(txtNombre);
		
		JTextField txtApellido = new JTextField();
		txtApellido.setBounds(140, 50, 250, 22);		
		panel.add(txtApellido);
		
		JTextField txtTelefono = new JTextField();
		txtTelefono.setBounds(140, 75, 250, 22);		
		panel.add(txtTelefono);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setBounds(140, 100, 250, 22);		
		panel.add(txtEmail);
		
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(140, 125, 250, 22);		
		panel.add(txtUsuario);
		
		JTextField txtPassword = new JTextField();
		txtPassword.setBounds(140, 150, 250, 22);		
		panel.add(txtPassword);
		
	}
	private void Label() {
		JLabel lblNombre = new JLabel();
		lblNombre.setText("Nombre:");		
		lblNombre.setBounds(80, 10, 50, 50);		
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel();
		lblApellido.setText("Apellido:");		
		lblApellido.setBounds(80, 35, 100, 50);		
		panel.add(lblApellido);	
		
		JLabel lblTelefono = new JLabel();
		lblTelefono.setText("Telefono:");		
		lblTelefono.setBounds(80, 60, 50, 50);		
		panel.add(lblTelefono);
		
		JLabel lblEmail = new JLabel();
		lblEmail.setText("Email:");		
		lblEmail.setBounds(80, 85, 100, 50);		
		panel.add(lblEmail);	
		
		JLabel lblUsuario = new JLabel();
		lblUsuario.setText("Usuario:");		
		lblUsuario.setBounds(80, 110, 50, 50);		
		panel.add(lblUsuario);
		
		JLabel lblPassword = new JLabel();
		lblPassword.setText("Password:");		
		lblPassword.setBounds(80, 135, 100, 50);		
		panel.add(lblPassword);	
	}
	
	private void Botones() {
		JButton cmdLogin = new JButton();
		cmdLogin.setText("Registrarse");		
		cmdLogin.setBounds(200, 200, 100, 40);		
		panel.add(cmdLogin);
	
	}


}
