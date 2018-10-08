package applicationWindows;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import datas.GlobalObjects;
import datas.Teacher;

public class SearchTeacher {

	private JFrame frmGestionDesEnseignants;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void openSearchTeacher() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchTeacher window = new SearchTeacher();
					window.frmGestionDesEnseignants.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchTeacher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionDesEnseignants = new JFrame();
		frmGestionDesEnseignants.getContentPane().setBackground(Color.WHITE);
		frmGestionDesEnseignants.setTitle("Gestion des enseignants");
		frmGestionDesEnseignants.setBounds(100, 100, 800, 480);
		frmGestionDesEnseignants.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionDesEnseignants.getContentPane().setLayout(null);
		
		JLabel lblEntrezLidDe = new JLabel("Entrez l'ID de l'enseignant que vous souhaitez g\u00E9rer :");
		lblEntrezLidDe.setFont(new Font("Arial", Font.PLAIN, 23));
		lblEntrezLidDe.setBounds(14, 39, 605, 35);
		frmGestionDesEnseignants.getContentPane().add(lblEntrezLidDe);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Arial", Font.PLAIN, 24));
		lblId.setBounds(14, 100, 40, 18);
		frmGestionDesEnseignants.getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setBounds(93, 96, 203, 34);
		frmGestionDesEnseignants.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEntrezLeNom = new JLabel("Entrez le nom et le pr\u00E9nom de l'enseignant que vous souhaitez g\u00E9rer :");
		lblEntrezLeNom.setFont(new Font("Arial", Font.PLAIN, 23));
		lblEntrezLeNom.setBounds(14, 149, 754, 35);
		frmGestionDesEnseignants.getContentPane().add(lblEntrezLeNom);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNom.setBounds(14, 209, 50, 18);
		frmGestionDesEnseignants.getContentPane().add(lblNom);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 203, 203, 34);
		frmGestionDesEnseignants.getContentPane().add(textField_1);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setFont(new Font("Arial", Font.PLAIN, 24));
		lblPrnom.setBounds(368, 211, 84, 18);
		frmGestionDesEnseignants.getContentPane().add(lblPrnom);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(481, 203, 203, 34);
		frmGestionDesEnseignants.getContentPane().add(textField_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.openMenu();
				frmGestionDesEnseignants.setVisible(false);
			}
		});
		lblNewLabel.setBounds(707, 13, 61, 61);
		ImageHelper.addBackArrowInLabel(lblNewLabel);
		frmGestionDesEnseignants.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Chercher");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = textField.getText();
				String nom = textField_1.getText();
				String prenom = textField_2.getText();
				int count = 0;
				String teacherId = "";
				for (Teacher teacher : GlobalObjects.teachers) {
					if(teacher.isEqual(id, nom, prenom)) {
						count ++;
						teacherId = teacher.getId();
					}
				}
				if (count == 1) {
					ShowTeacher.openShowTeacher(teacherId);
					frmGestionDesEnseignants.setVisible(false);
				} else if (count > 1) {
					TeacherList.openTeacherList(id, nom, prenom);
					frmGestionDesEnseignants.setVisible(false);
				}
			}
		});
		btnNewButton.setBounds(611, 264, 113, 27);
		frmGestionDesEnseignants.getContentPane().add(btnNewButton);
	}
}
