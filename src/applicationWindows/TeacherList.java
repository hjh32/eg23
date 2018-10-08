package applicationWindows;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import datas.GlobalObjects;
import datas.Teacher;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class TeacherList {

	private JFrame frmGestionDesEnseignants;

	/**
	 * Launch the application.
	 */
	public static void openTeacherList(String id, String nom, String prenom) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherList window = new TeacherList(id, nom, prenom);
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
	public TeacherList(String id, String nom, String prenom) {
		initialize(id, nom, prenom);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String id, String nom, String prenom) {
		frmGestionDesEnseignants = new JFrame();
		frmGestionDesEnseignants.getContentPane().setBackground(Color.WHITE);
		frmGestionDesEnseignants.setTitle("Gestion des enseignants");
		frmGestionDesEnseignants.setBounds(100, 100, 800, 480);
		frmGestionDesEnseignants.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionDesEnseignants.getContentPane().setLayout(null);
		
		List<String> selections = new ArrayList<String>();
		for (Teacher teacher : GlobalObjects.teachers) {
			if(teacher.isEqual(id, nom, prenom)) {
				selections.add(teacher.getId() + " " + teacher.getNom() + " " + teacher.getPrenom());
			}
		}
		String[] selectionsArr = selections.toArray(new String[selections.size()]);
		JList list = new JList();
		list.setForeground(Color.BLUE);
		list.setBackground(UIManager.getColor("Button.background"));
		list.setModel(new AbstractListModel() {
			String[] values = selectionsArr;
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setFont(new Font("Arial", Font.PLAIN, 24));
		list.setBounds(179, 69, 390, 251);
		frmGestionDesEnseignants.getContentPane().add(list);
		
		JLabel lblListeDesEnseignants = new JLabel("Liste des enseignants trouv\u00E9s");
		lblListeDesEnseignants.setFont(new Font("Arial", Font.PLAIN, 36));
		lblListeDesEnseignants.setBounds(14, 13, 498, 43);
		frmGestionDesEnseignants.getContentPane().add(lblListeDesEnseignants);
		
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
		
		JButton btnNewButton = new JButton("S\u00E9lectionner");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = list.getSelectedValue().toString().split(" ")[0];
				ShowTeacher.openShowTeacher(id);
				frmGestionDesEnseignants.setVisible(false);
			}
		});
		btnNewButton.setBounds(605, 359, 129, 27);
		frmGestionDesEnseignants.getContentPane().add(btnNewButton);
	}

}
