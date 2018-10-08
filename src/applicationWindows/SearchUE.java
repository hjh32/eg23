package applicationWindows;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import datas.GlobalObjects;
import datas.UE;
import java.awt.Color;

public class SearchUE {

	private JFrame frmGestionDesUes;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void openSearchUE() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchUE window = new SearchUE();
					window.frmGestionDesUes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchUE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionDesUes = new JFrame();
		frmGestionDesUes.getContentPane().setBackground(Color.WHITE);
		frmGestionDesUes.setTitle("Gestion des UEs");
		frmGestionDesUes.setBounds(100, 100, 800, 480);
		frmGestionDesUes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionDesUes.getContentPane().setLayout(null);
		
		JLabel lblEntrezLidDe = new JLabel("Entrez l'ID de l'UE que vous souhaitez visualiser :");
		lblEntrezLidDe.setFont(new Font("Arial", Font.PLAIN, 23));
		lblEntrezLidDe.setBounds(14, 39, 522, 35);
		frmGestionDesUes.getContentPane().add(lblEntrezLidDe);
		
		JLabel label = new JLabel("ID");
		label.setFont(new Font("Arial", Font.PLAIN, 24));
		label.setBounds(14, 100, 40, 18);
		frmGestionDesUes.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 24));
		textField.setColumns(10);
		textField.setBounds(114, 92, 203, 34);
		frmGestionDesUes.getContentPane().add(textField);
		
		JLabel lblEntrezLeMot = new JLabel("Entrez le mot cl\u00E9 de l'UE que vous souhaitez visualiser :");
		lblEntrezLeMot.setFont(new Font("Arial", Font.PLAIN, 23));
		lblEntrezLeMot.setBounds(14, 147, 580, 35);
		frmGestionDesUes.getContentPane().add(lblEntrezLeMot);
		
		JLabel lblMotCl = new JLabel("Mot cl\u00E9");
		lblMotCl.setFont(new Font("Arial", Font.PLAIN, 24));
		lblMotCl.setBounds(14, 207, 84, 18);
		frmGestionDesUes.getContentPane().add(lblMotCl);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(114, 199, 203, 34);
		frmGestionDesUes.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.openMenu();
				frmGestionDesUes.setVisible(false);
			}
		});
		lblNewLabel.setBounds(707, 13, 61, 61);
		ImageHelper.addBackArrowInLabel(lblNewLabel);
		frmGestionDesUes.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("Chercher");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = textField.getText();
				String description = textField_1.getText();
				int count = 0;
				String ueId = "";
				for (UE ue : GlobalObjects.ues) {
					if(ue.isEqual(id, description)) {
						count ++;
						ueId = ue.getId();
					}
				}
				if (count == 1) {
					ShowUE.openShowUE(ueId);
					frmGestionDesUes.setVisible(false);
				} else if (count > 1) {
					UEList.openUEList(id, description);
					frmGestionDesUes.setVisible(false);
				}
			}
		});
		button.setBounds(607, 267, 113, 27);
		frmGestionDesUes.getContentPane().add(button);
	}

}
