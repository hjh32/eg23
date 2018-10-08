package applicationWindows;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import datas.GlobalObjects;
import datas.Teacher;

public class ShowTeacher {

	private JFrame frmGestionDesEnseignants;
	private Teacher teacher;

	/**
	 * Launch the application.
	 */
	public static void openShowTeacher(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowTeacher window = new ShowTeacher(id);
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
	public ShowTeacher(String id) {
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
		
		JLabel lblEnseignant = new JLabel("Enseignant");
		lblEnseignant.setFont(new Font("Arial", Font.PLAIN, 36));
		lblEnseignant.setBounds(14, 13, 185, 43);
		frmGestionDesEnseignants.getContentPane().add(lblEnseignant);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNom.setBounds(44, 80, 58, 29);
		frmGestionDesEnseignants.getContentPane().add(lblNom);
		
		JLabel lblNombreDheuresSupplmentaires = new JLabel("Nombre d'heures suppl\u00E9mentaires (les 5 derni\u00E8res ann\u00E9es)");
		lblNombreDheuresSupplmentaires.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNombreDheuresSupplmentaires.setBounds(44, 248, 642, 29);
		frmGestionDesEnseignants.getContentPane().add(lblNombreDheuresSupplmentaires);
		
		JLabel lblListesDesUes = new JLabel("Listes des UEs dont l'enseignant est responsable");
		lblListesDesUes.setFont(new Font("Arial", Font.PLAIN, 24));
		lblListesDesUes.setBounds(44, 175, 654, 29);
		frmGestionDesEnseignants.getContentPane().add(lblListesDesUes);
		
		JLabel lblInfoNom = new JLabel("");
		lblInfoNom.setForeground(Color.BLUE);
		lblInfoNom.setFont(new Font("Arial", Font.PLAIN, 24));
		lblInfoNom.setBounds(152, 80, 179, 29);
		frmGestionDesEnseignants.getContentPane().add(lblInfoNom);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setFont(new Font("Arial", Font.PLAIN, 24));
		lblPrnom.setBounds(398, 80, 84, 29);
		frmGestionDesEnseignants.getContentPane().add(lblPrnom);
		
		JLabel labelInfoPrenom = new JLabel("");
		labelInfoPrenom.setForeground(Color.BLUE);
		labelInfoPrenom.setFont(new Font("Arial", Font.PLAIN, 24));
		labelInfoPrenom.setBounds(536, 80, 179, 29);
		frmGestionDesEnseignants.getContentPane().add(labelInfoPrenom);
		
		JLabel lblTypesDeLenseignant = new JLabel("Types de l'enseignant");
		lblTypesDeLenseignant.setFont(new Font("Arial", Font.PLAIN, 24));
		lblTypesDeLenseignant.setBounds(44, 126, 271, 29);
		frmGestionDesEnseignants.getContentPane().add(lblTypesDeLenseignant);
		
		JLabel labelInfoTypes = new JLabel("");
		labelInfoTypes.setForeground(Color.BLUE);
		labelInfoTypes.setFont(new Font("Arial", Font.PLAIN, 24));
		labelInfoTypes.setBounds(330, 126, 396, 29);
		frmGestionDesEnseignants.getContentPane().add(labelInfoTypes);
		
		JLabel labelListeUE = new JLabel("");
		labelListeUE.setForeground(Color.BLUE);
		labelListeUE.setFont(new Font("Arial", Font.PLAIN, 24));
		labelListeUE.setBounds(44, 206, 654, 29);
		frmGestionDesEnseignants.getContentPane().add(labelListeUE);
		
		JLabel labelHeure = new JLabel("");
		labelHeure.setForeground(Color.BLUE);
		labelHeure.setFont(new Font("Arial", Font.PLAIN, 24));
		labelHeure.setBounds(44, 280, 70, 29);
		frmGestionDesEnseignants.getContentPane().add(labelHeure);
		
		JLabel lblDateDentreDans = new JLabel("Date d'entr\u00E9e dans le d\u00E9partement");
		lblDateDentreDans.setFont(new Font("Arial", Font.PLAIN, 24));
		lblDateDentreDans.setBounds(44, 322, 388, 29);
		frmGestionDesEnseignants.getContentPane().add(lblDateDentreDans);
		
		JLabel labelDateEntree = new JLabel("");
		labelDateEntree.setForeground(Color.BLUE);
		labelDateEntree.setFont(new Font("Arial", Font.PLAIN, 24));
		labelDateEntree.setBounds(44, 354, 232, 29);
		frmGestionDesEnseignants.getContentPane().add(labelDateEntree);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchTeacher.openSearchTeacher();
				frmGestionDesEnseignants.setVisible(false);
			}
		});
		lblNewLabel.setBounds(707, 13, 61, 61);
		ImageHelper.addBackArrowInLabel(lblNewLabel);
		frmGestionDesEnseignants.getContentPane().add(lblNewLabel);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ModifyTeacher.openModifyTeacher(getTeacher().getId());
				frmGestionDesEnseignants.setVisible(false);
			}
		});
		btnModifier.setBounds(454, 373, 113, 27);
		frmGestionDesEnseignants.getContentPane().add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] options = { "Oui", "Non"};
				int n = JOptionPane.showOptionDialog(frmGestionDesEnseignants, "Voulez-vous vraiment supprimer l'enseignant?",
						"Warning", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						options, options[1]);
				if(n == 0) {
					Menu.openMenu();
					frmGestionDesEnseignants.setVisible(false);
				}
			}
		});
		btnSupprimer.setBounds(613, 373, 113, 27);
		frmGestionDesEnseignants.getContentPane().add(btnSupprimer);
		
		for (Teacher teacher : GlobalObjects.teachers) {
			if(teacher.getId().equals(id)) {
				this.teacher = teacher;
				lblInfoNom.setText(teacher.getNom());
				labelInfoPrenom.setText(teacher.getPrenom());
				labelInfoTypes.setText(teacher.getTypesString());
				labelListeUE.setText(teacher.getUEsString());
				labelHeure.setText(teacher.getHour());
				labelDateEntree.setText(teacher.getDate());
				break;
			}
		}
	}
	
	private Teacher getTeacher() {
		return teacher;
	}
}
