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
import datas.UE;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class UEList {

	private JFrame frmGestionDesUes;

	/**
	 * Launch the application.
	 */
	public static void openUEList(String id, String description) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UEList window = new UEList(id, description);
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
	public UEList(String id, String description) {
		initialize(id, description);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String id, String description) {
		frmGestionDesUes = new JFrame();
		frmGestionDesUes.getContentPane().setBackground(Color.WHITE);
		frmGestionDesUes.setTitle("Gestion des UEs");
		frmGestionDesUes.setBounds(100, 100, 800, 480);
		frmGestionDesUes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionDesUes.getContentPane().setLayout(null);
		
		JLabel lblListeDesUes = new JLabel("Liste des UEs trouv\u00E9es");
		lblListeDesUes.setFont(new Font("Arial", Font.PLAIN, 36));
		lblListeDesUes.setBounds(14, 13, 498, 43);
		frmGestionDesUes.getContentPane().add(lblListeDesUes);
		
		List<String> selections = new ArrayList<String>();
		for (UE ue : GlobalObjects.ues) {
			if(ue.isEqual(id, description)) {
				selections.add(ue.getId() + " " + ue.getDescription());
			}
		}
		String[] selectionsArr = selections.toArray(new String[selections.size()]);
		JList list = new JList();
		list.setBackground(UIManager.getColor("Button.background"));
		list.setForeground(Color.BLUE);
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
		frmGestionDesUes.getContentPane().add(list);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchUE.openSearchUE();
				frmGestionDesUes.setVisible(false);
			}
		});
		lblNewLabel.setBounds(707, 13, 61, 61);
		ImageHelper.addBackArrowInLabel(lblNewLabel);
		frmGestionDesUes.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("S\u00E9lectionner");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = list.getSelectedValue().toString().split(" ")[0];
				ShowUE.openShowUE(id);
				frmGestionDesUes.setVisible(false);
			}
		});
		button.setBounds(605, 359, 129, 27);
		frmGestionDesUes.getContentPane().add(button);
	}
}
