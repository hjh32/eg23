package applicationWindows;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import datas.GlobalObjects;
import datas.Teacher;
import datas.UE;
import java.awt.Color;

public class ModifyTeacher {

	private JFrame frmGestionDesEnseignants;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void openModifyTeacher(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyTeacher window = new ModifyTeacher(id);
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
	public ModifyTeacher(String id) {
		initialize(id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String id) {
		frmGestionDesEnseignants = new JFrame();
		frmGestionDesEnseignants.getContentPane().setBackground(Color.WHITE);
		frmGestionDesEnseignants.setTitle("Gestion des enseignants");
		frmGestionDesEnseignants.setBounds(100, 100, 800, 480);
		frmGestionDesEnseignants.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionDesEnseignants.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Enseignant");
		label.setFont(new Font("Arial", Font.PLAIN, 36));
		label.setBounds(14, 13, 185, 43);
		frmGestionDesEnseignants.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Types de l'enseignant");
		label_1.setFont(new Font("Arial", Font.PLAIN, 24));
		label_1.setBounds(14, 91, 256, 29);
		frmGestionDesEnseignants.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 24));
		textField.setBounds(319, 88, 449, 34);
		frmGestionDesEnseignants.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("Listes des UEs dont l'enseignant est responsable");
		label_2.setFont(new Font("Arial", Font.PLAIN, 24));
		label_2.setBounds(14, 140, 654, 29);
		frmGestionDesEnseignants.getContentPane().add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(14, 182, 754, 35);
		frmGestionDesEnseignants.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowTeacher.openShowTeacher(id);
				frmGestionDesEnseignants.setVisible(false);
			}
		});
		lblNewLabel.setBounds(707, 13, 61, 61);
		ImageHelper.addBackArrowInLabel(lblNewLabel);
		frmGestionDesEnseignants.getContentPane().add(lblNewLabel);
		
		JButton btnConfirmer = new JButton("Confirmer");
		btnConfirmer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (Teacher teacher : GlobalObjects.teachers) {
					if(teacher.getId().equals(id)) {
						String[] types = textField.getText().split(", ");
						String[] ues = textField_1.getText().split(", ");
						teacher.setTypes(Arrays.asList(types));
						
						List<UE> ueList = new ArrayList<UE>();
						for (String theUE : ues) {
							boolean exist = false;
							for (UE ue : GlobalObjects.ues) {
								if(ue.getId().equals(theUE)) {
									exist = true;
									ueList.add(ue);
									break;
								}
							}
							if(!exist) {
								UE ue = new UE();
								ue.setId(theUE);
								ueList.add(ue);
							}
						}
						teacher.setUes(ueList);
						break;
					}
				}
				ShowTeacher.openShowTeacher(id);
				frmGestionDesEnseignants.setVisible(false);
			}
		});
		btnConfirmer.setBounds(527, 250, 113, 27);
		frmGestionDesEnseignants.getContentPane().add(btnConfirmer);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowTeacher.openShowTeacher(id);
				frmGestionDesEnseignants.setVisible(false);
			}
		});
		btnAnnuler.setBounds(655, 250, 113, 27);
		frmGestionDesEnseignants.getContentPane().add(btnAnnuler);
		
		for (Teacher teacher : GlobalObjects.teachers) {
			if(teacher.getId().equals(id)) {
				textField.setText(teacher.getTypesString());
				textField_1.setText(teacher.getUEsString());
			}
		}
	}
}
