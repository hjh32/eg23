package applicationWindows;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import datas.GlobalObjects;
import datas.UE;
import datas.UEStatistic;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShowUE {

	private JFrame frmGestionDesUes;

	/**
	 * Launch the application.
	 */
	public static void openShowUE(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowUE window = new ShowUE(id);
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
	public ShowUE(String id) {
		initialize(id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String id) {
		frmGestionDesUes = new JFrame();
		frmGestionDesUes.getContentPane().setBackground(Color.WHITE);
		frmGestionDesUes.setTitle("Gestion des UEs");
		frmGestionDesUes.setBounds(100, 100, 800, 480);
		frmGestionDesUes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionDesUes.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2017", "2016"}));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		comboBox.setBounds(14, 13, 87, 24);
		frmGestionDesUes.getContentPane().add(comboBox);
		
		JLabel lblUe = new JLabel("UE");
		lblUe.setFont(new Font("Arial", Font.PLAIN, 36));
		lblUe.setBounds(14, 38, 63, 43);
		frmGestionDesUes.getContentPane().add(lblUe);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Arial", Font.PLAIN, 36));
		label.setBounds(103, 38, 134, 43);
		frmGestionDesUes.getContentPane().add(label);
		
		JLabel lblEffectif = new JLabel("Effectif");
		lblEffectif.setFont(new Font("Arial", Font.PLAIN, 24));
		lblEffectif.setBounds(103, 101, 87, 29);
		frmGestionDesUes.getContentPane().add(lblEffectif);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Arial", Font.PLAIN, 24));
		label_1.setBounds(218, 101, 111, 29);
		frmGestionDesUes.getContentPane().add(label_1);
		
		JLabel lblRussiteDestudiants = new JLabel("R\u00E9ussite des \u00E9tudiants");
		lblRussiteDestudiants.setFont(new Font("Arial", Font.PLAIN, 24));
		lblRussiteDestudiants.setBounds(103, 142, 245, 29);
		frmGestionDesUes.getContentPane().add(lblRussiteDestudiants);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(new Color(0, 128, 0));
		lblA.setFont(new Font("Arial", Font.PLAIN, 24));
		lblA.setBounds(162, 172, 58, 29);
		frmGestionDesUes.getContentPane().add(lblA);
		
		JLabel label_3 = new JLabel("");
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Arial", Font.PLAIN, 24));
		label_3.setBounds(218, 172, 63, 29);
		frmGestionDesUes.getContentPane().add(label_3);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(new Color(0, 128, 0));
		lblB.setFont(new Font("Arial", Font.PLAIN, 24));
		lblB.setBounds(360, 172, 58, 29);
		frmGestionDesUes.getContentPane().add(lblB);
		
		JLabel label_4 = new JLabel("");
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Arial", Font.PLAIN, 24));
		label_4.setBounds(416, 172, 63, 29);
		frmGestionDesUes.getContentPane().add(label_4);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(new Color(0, 128, 0));
		lblC.setFont(new Font("Arial", Font.PLAIN, 24));
		lblC.setBounds(162, 202, 58, 29);
		frmGestionDesUes.getContentPane().add(lblC);
		
		JLabel label_5 = new JLabel("");
		label_5.setForeground(Color.BLUE);
		label_5.setFont(new Font("Arial", Font.PLAIN, 24));
		label_5.setBounds(218, 202, 63, 29);
		frmGestionDesUes.getContentPane().add(label_5);
		
		JLabel lblD = new JLabel("D");
		lblD.setForeground(new Color(0, 128, 0));
		lblD.setFont(new Font("Arial", Font.PLAIN, 24));
		lblD.setBounds(360, 202, 58, 29);
		frmGestionDesUes.getContentPane().add(lblD);
		
		JLabel label_7 = new JLabel("");
		label_7.setForeground(Color.BLUE);
		label_7.setFont(new Font("Arial", Font.PLAIN, 24));
		label_7.setBounds(416, 202, 63, 29);
		frmGestionDesUes.getContentPane().add(label_7);
		
		JLabel lblE = new JLabel("E");
		lblE.setForeground(new Color(0, 128, 0));
		lblE.setFont(new Font("Arial", Font.PLAIN, 24));
		lblE.setBounds(162, 232, 58, 29);
		frmGestionDesUes.getContentPane().add(lblE);
		
		JLabel label_9 = new JLabel("");
		label_9.setForeground(Color.BLUE);
		label_9.setFont(new Font("Arial", Font.PLAIN, 24));
		label_9.setBounds(218, 232, 63, 29);
		frmGestionDesUes.getContentPane().add(label_9);
		
		JLabel lblF = new JLabel("F");
		lblF.setForeground(new Color(255, 0, 0));
		lblF.setFont(new Font("Arial", Font.PLAIN, 24));
		lblF.setBounds(360, 232, 58, 29);
		frmGestionDesUes.getContentPane().add(lblF);
		
		JLabel label_11 = new JLabel("");
		label_11.setForeground(Color.BLUE);
		label_11.setFont(new Font("Arial", Font.PLAIN, 24));
		label_11.setBounds(416, 232, 63, 29);
		frmGestionDesUes.getContentPane().add(label_11);
		
		JLabel lblFx = new JLabel("FX");
		lblFx.setForeground(new Color(255, 0, 0));
		lblFx.setFont(new Font("Arial", Font.PLAIN, 24));
		lblFx.setBounds(162, 261, 58, 29);
		frmGestionDesUes.getContentPane().add(lblFx);
		
		JLabel label_13 = new JLabel("");
		label_13.setForeground(Color.BLUE);
		label_13.setFont(new Font("Arial", Font.PLAIN, 24));
		label_13.setBounds(218, 261, 63, 29);
		frmGestionDesUes.getContentPane().add(label_13);
		
		JLabel lblAbs = new JLabel("ABS");
		lblAbs.setForeground(new Color(255, 0, 0));
		lblAbs.setFont(new Font("Arial", Font.PLAIN, 24));
		lblAbs.setBounds(360, 261, 58, 29);
		frmGestionDesUes.getContentPane().add(lblAbs);
		
		JLabel label_15 = new JLabel("");
		label_15.setForeground(Color.BLUE);
		label_15.setFont(new Font("Arial", Font.PLAIN, 24));
		label_15.setBounds(416, 261, 63, 29);
		frmGestionDesUes.getContentPane().add(label_15);
		
		JLabel lblTauxDeRussite = new JLabel("Taux de r\u00E9ussite");
		lblTauxDeRussite.setForeground(new Color(0, 128, 0));
		lblTauxDeRussite.setFont(new Font("Arial", Font.PLAIN, 24));
		lblTauxDeRussite.setBounds(103, 291, 188, 29);
		frmGestionDesUes.getContentPane().add(lblTauxDeRussite);
		
		JLabel lblTauxDchec = new JLabel("Taux d'\u00E9chec");
		lblTauxDchec.setForeground(new Color(255, 0, 0));
		lblTauxDchec.setFont(new Font("Arial", Font.PLAIN, 24));
		lblTauxDchec.setBounds(103, 324, 188, 29);
		frmGestionDesUes.getContentPane().add(lblTauxDchec);
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Arial", Font.PLAIN, 24));
		label_2.setBounds(308, 291, 100, 29);
		frmGestionDesUes.getContentPane().add(label_2);
		
		JLabel label_6 = new JLabel("");
		label_6.setForeground(Color.BLUE);
		label_6.setFont(new Font("Arial", Font.PLAIN, 24));
		label_6.setBounds(308, 324, 100, 29);
		frmGestionDesUes.getContentPane().add(label_6);
		
		JLabel lblNomDuResponsable = new JLabel("Nom du responsable");
		lblNomDuResponsable.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNomDuResponsable.setBounds(103, 366, 245, 29);
		frmGestionDesUes.getContentPane().add(lblNomDuResponsable);
		
		JLabel label_8 = new JLabel("");
		label_8.setForeground(Color.BLUE);
		label_8.setFont(new Font("Arial", Font.PLAIN, 24));
		label_8.setBounds(360, 366, 233, 29);
		frmGestionDesUes.getContentPane().add(label_8);
		
		JLabel label_10 = new JLabel("");
		label_10.setForeground(Color.BLUE);
		label_10.setFont(new Font("Arial", Font.PLAIN, 36));
		label_10.setBounds(267, 38, 134, 43);
		frmGestionDesUes.getContentPane().add(label_10);
		
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
		
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	setStatistics(id, comboBox, label, label_1, label_3, label_4, label_5, label_7, label_9, label_11,
						label_13, label_15, label_2, label_6, label_8, label_10);
		    }
		});
		
		setStatistics(id, comboBox, label, label_1, label_3, label_4, label_5, label_7, label_9, label_11, label_13,
				label_15, label_2, label_6, label_8, label_10);
	}

	private void setStatistics(String id, JComboBox comboBox, JLabel label, JLabel label_1, JLabel label_3,
			JLabel label_4, JLabel label_5, JLabel label_7, JLabel label_9, JLabel label_11, JLabel label_13,
			JLabel label_15, JLabel label_2, JLabel label_6, JLabel label_8, JLabel label_10) {
		for (UE ue : GlobalObjects.ues) {
			if(ue.getId().equals(id)) {
				label.setText(ue.getId());
				label_10.setText(ue.getDescription());
				label_8.setText(ue.getTeacher().getFullName());
				for (UEStatistic stat : ue.getStatistics()) {
					if (comboBox.getSelectedItem().toString().equals(stat.getYear())) {
						label_1.setText(String.valueOf(stat.getEffectif()));
						label_3.setText(String.valueOf(stat.getA()));
						label_4.setText(String.valueOf(stat.getB()));
						label_5.setText(String.valueOf(stat.getC()));
						label_7.setText(String.valueOf(stat.getD()));
						label_9.setText(String.valueOf(stat.getE()));
						label_11.setText(String.valueOf(stat.getF()));
						label_13.setText(String.valueOf(stat.getFx()));
						label_15.setText(String.valueOf(stat.getAbs()));
						label_2.setText(stat.getSuccess());
						label_6.setText(stat.getFailure());
					}
				}
			}
		}
	}
}
