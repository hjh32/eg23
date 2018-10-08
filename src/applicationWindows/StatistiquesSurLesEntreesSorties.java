package applicationWindows;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class StatistiquesSurLesEntreesSorties {

	private JFrame frmStatistiquesSurLes;

	/**
	 * Launch the application.
	 */
	public static void openStatistiquesSurLesEntreesSorties() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatistiquesSurLesEntreesSorties window = new StatistiquesSurLesEntreesSorties();
					window.frmStatistiquesSurLes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StatistiquesSurLesEntreesSorties() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStatistiquesSurLes = new JFrame();
		frmStatistiquesSurLes.getContentPane().setBackground(Color.WHITE);
		frmStatistiquesSurLes.getContentPane().setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		frmStatistiquesSurLes.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2017", "2016"}));
		comboBox.setMaximumRowCount(10);
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(new Color(253, 245, 230));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		comboBox.setBounds(40, 40, 84, 21);
		frmStatistiquesSurLes.getContentPane().add(comboBox);
		
		JTextArea txtrNombreDtudiantsRorients = new JTextArea();
		txtrNombreDtudiantsRorients.setFont(new Font("Algerian", Font.PLAIN, 13));
		txtrNombreDtudiantsRorients.setText("Nombre d'\u00E9tudiants r\u00E9orient\u00E9s");
		txtrNombreDtudiantsRorients.setBounds(40, 100, 220, 25);
		frmStatistiquesSurLes.getContentPane().add(txtrNombreDtudiantsRorients);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setForeground(Color.BLUE);
		textArea.setBounds(300, 100, 50, 25);
		frmStatistiquesSurLes.getContentPane().add(textArea);
		
		JTextArea txtrNombreDeDmissionnaires = new JTextArea();
		txtrNombreDeDmissionnaires.setFont(new Font("Algerian", Font.PLAIN, 13));
		txtrNombreDeDmissionnaires.setText("Nombre de d\u00E9missionnaires");
		txtrNombreDeDmissionnaires.setBounds(450, 100, 196, 25);
		frmStatistiquesSurLes.getContentPane().add(txtrNombreDeDmissionnaires);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setForeground(Color.BLUE);
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setBounds(680, 100, 50, 25);
		frmStatistiquesSurLes.getContentPane().add(textArea_1);
		
		JTextArea txtrNombreDadmissionsTC = new JTextArea();
		txtrNombreDadmissionsTC.setFont(new Font("Algerian", Font.PLAIN, 13));
		txtrNombreDadmissionsTC.setText("Nombre D'admissions TC");
		txtrNombreDadmissionsTC.setBounds(40, 180, 220, 25);
		frmStatistiquesSurLes.getContentPane().add(txtrNombreDadmissionsTC);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setForeground(Color.BLUE);
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setBounds(300, 180, 50, 25);
		frmStatistiquesSurLes.getContentPane().add(textArea_2);
		
		JTextArea txtrNombreDadmissionsIUT = new JTextArea();
		txtrNombreDadmissionsIUT.setFont(new Font("Algerian", Font.PLAIN, 13));
		txtrNombreDadmissionsIUT.setText("Nombre D'admissions IUT");
		txtrNombreDadmissionsIUT.setBounds(450, 180, 220, 25);
		frmStatistiquesSurLes.getContentPane().add(txtrNombreDadmissionsIUT);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setForeground(Color.BLUE);
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setBounds(680, 180, 50, 25);
		frmStatistiquesSurLes.getContentPane().add(textArea_3);
		
		JTextArea txtrNombreDadmissionsPrepa = new JTextArea();
		txtrNombreDadmissionsPrepa.setFont(new Font("Algerian", Font.PLAIN, 13));
		txtrNombreDadmissionsPrepa.setText("Nombre D'admissions IUT");
		txtrNombreDadmissionsPrepa.setBounds(40, 260, 220, 25);
		frmStatistiquesSurLes.getContentPane().add(txtrNombreDadmissionsPrepa);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setForeground(Color.BLUE);
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setBounds(300, 260, 50, 25);
		frmStatistiquesSurLes.getContentPane().add(textArea_4);
		
		JTextArea txtrNombreDadmissionsAutres = new JTextArea();
		txtrNombreDadmissionsAutres.setFont(new Font("Algerian", Font.PLAIN, 13));
		txtrNombreDadmissionsAutres.setText("Nombre D'admissions Autres");
		txtrNombreDadmissionsAutres.setBounds(450, 260, 200, 25);
		frmStatistiquesSurLes.getContentPane().add(txtrNombreDadmissionsAutres);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setForeground(Color.BLUE);
		textArea_5.setBackground(Color.WHITE);
		textArea_5.setBounds(680, 260, 50, 25);
		frmStatistiquesSurLes.getContentPane().add(textArea_5);
		
		JTextArea txtrNombreDeDiplomes = new JTextArea();
		txtrNombreDeDiplomes.setFont(new Font("Algerian", Font.PLAIN, 13));
		txtrNombreDeDiplomes.setText("Nombre De Dipl\u00F4m\u00E9s");
		txtrNombreDeDiplomes.setBounds(40, 340, 200, 25);
		frmStatistiquesSurLes.getContentPane().add(txtrNombreDeDiplomes);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setForeground(Color.BLUE);
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setBounds(300, 340, 50, 25);
		frmStatistiquesSurLes.getContentPane().add(textArea_6);
		
		frmStatistiquesSurLes.setTitle("Statistiques sur les \"Entr\u00E9es/Sorties\"");
		frmStatistiquesSurLes.setBounds(100, 100, 800, 480);
		frmStatistiquesSurLes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textArea.setText("100");
    	textArea_1.setText("150");
    	textArea_2.setText("200");
    	textArea_3.setText("250");
    	textArea_4.setText("300");
    	textArea_5.setText("350");
    	textArea_6.setText("400");
		
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	 JComboBox combo = (JComboBox)e.getSource();
                 String annee = (String)combo.getSelectedItem();
                 int year = Integer.valueOf(annee);
                if(year == 2017) {
                	textArea.setText("100");
                	textArea_1.setText("150");
                	textArea_2.setText("200");
                	textArea_3.setText("250");
                	textArea_4.setText("300");
                	textArea_5.setText("350");
                	textArea_6.setText("400");
                }
                else {
                	textArea.setText("50");
                	textArea_1.setText("100");
                	textArea_2.setText("150");
                	textArea_3.setText("200");
                	textArea_4.setText("250");
                	textArea_5.setText("300");
                	textArea_6.setText("350");
                }
		    }
		});
		
		// add back arrow
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.openMenu();
				frmStatistiquesSurLes.setVisible(false);
			}
		});
		lblNewLabel.setBounds(707, 13, 61, 61);
		ImageHelper.addBackArrowInLabel(lblNewLabel);
		frmStatistiquesSurLes.getContentPane().add(lblNewLabel);
	}
	

}
