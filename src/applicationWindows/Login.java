package applicationWindows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextField;

import datas.GlobalObjects;

import javax.swing.JPasswordField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

	private JFrame frmAideAuPilotage;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		runLogin();
	}
	
	public static void openLogin() {
		runLogin();
	}

	private static void runLogin() {
		GlobalObjects.setUpObjects();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmAideAuPilotage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAideAuPilotage = new JFrame();
		frmAideAuPilotage.setTitle("Aide au pilotage d'un d\u00E9partement d'enseignement \u00E0 l'UTT");
		frmAideAuPilotage.setBounds(100, 100, 800, 480);
		frmAideAuPilotage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAideAuPilotage.getContentPane().setLayout(null);
		
		// add background image
		BufferedImage myImage = null;
		try {
			myImage = ImageIO.read(new File("src\\picture\\utt.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		frmAideAuPilotage.setContentPane(new ImagePanel(myImage));
		
		JLabel lblAideAuPilotage = new JLabel("Aide au pilotage d'un d\u00E9partement");
		lblAideAuPilotage.setForeground(Color.ORANGE);
		lblAideAuPilotage.setFont(new Font("Calibri", Font.BOLD, 36));
		lblAideAuPilotage.setBounds(116, 41, 555, 66);
		frmAideAuPilotage.getContentPane().add(lblAideAuPilotage);
		
		JLabel lblDenseignementLutt = new JLabel("d'enseignement \u00E0 l'UTT");
		lblDenseignementLutt.setForeground(Color.ORANGE);
		lblDenseignementLutt.setFont(new Font("Calibri", Font.BOLD, 36));
		lblDenseignementLutt.setBounds(204, 85, 358, 66);
		frmAideAuPilotage.getContentPane().add(lblDenseignementLutt);
		
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Arial", Font.PLAIN, 20));
		lblId.setBounds(215, 236, 54, 18);
		frmAideAuPilotage.getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setBounds(376, 235, 196, 24);
		frmAideAuPilotage.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setForeground(Color.WHITE);
		lblMotDePasse.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMotDePasse.setBounds(215, 278, 121, 18);
		frmAideAuPilotage.getContentPane().add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(376, 277, 196, 24);
		frmAideAuPilotage.getContentPane().add(passwordField);
		
		JButton btnSeConnecter = new JButton("Se connecter");
		btnSeConnecter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.openMenu();
				frmAideAuPilotage.setVisible(false);
			}
		});
		btnSeConnecter.setBounds(321, 316, 129, 27);
		frmAideAuPilotage.getContentPane().add(btnSeConnecter);
	}
}
