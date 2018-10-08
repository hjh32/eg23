package applicationWindows;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RepartitionDesEtudiants {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void openRepartitionDesEtudiants() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RepartitionDesEtudiants window = new RepartitionDesEtudiants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RepartitionDesEtudiants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Algerian", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2017", "2016"}));
		comboBox.setBounds(40, 30, 94, 21);
		frame.getContentPane().add(comboBox);
		
		JTextArea txtrRpartitionParNiveau = new JTextArea();
		txtrRpartitionParNiveau.setFont(new Font("Algerian", Font.PLAIN, 18));
		txtrRpartitionParNiveau.setText("R\u00E9partition par niveau d'\u00E9tudiants");
		txtrRpartitionParNiveau.setBounds(40, 70, 474, 24);
		frame.getContentPane().add(txtrRpartitionParNiveau);
		
		JTextArea txtrSemestre = new JTextArea();
		txtrSemestre.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
		txtrSemestre.setText("Semestre");
		txtrSemestre.setBounds(40, 100, 105, 24);
		frame.getContentPane().add(txtrSemestre);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textArea1.setText("1:");
		textArea1.setBounds(40, 140, 20, 20);
		frame.getContentPane().add(textArea1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setForeground(Color.BLUE);
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setBounds(80, 140, 40, 20);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textArea2.setText("2:");
		textArea2.setBounds(240, 140, 20, 20);
		frame.getContentPane().add(textArea2);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setForeground(Color.BLUE);
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setBounds(280, 140, 40, 20);
		frame.getContentPane().add(textArea_2);
		
		JTextArea textArea3 = new JTextArea();
		textArea3.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textArea3.setText("3:");
		textArea3.setBounds(440, 140, 20, 20);
		frame.getContentPane().add(textArea3);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setForeground(Color.BLUE);
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setBounds(480, 140, 40, 20);
		frame.getContentPane().add(textArea_3);
		
		JTextArea textArea4 = new JTextArea();
		textArea4.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textArea4.setText("4:");
		textArea4.setBounds(640, 140, 20, 20);
		frame.getContentPane().add(textArea4);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setForeground(Color.BLUE);
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setBounds(680, 140, 40, 20);
		frame.getContentPane().add(textArea_4);
		
		JTextArea textArea5 = new JTextArea();
		textArea5.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textArea5.setText("5:");
		textArea5.setBounds(40, 190, 20, 20);
		frame.getContentPane().add(textArea5);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setForeground(Color.BLUE);
		textArea_5.setBackground(Color.WHITE);
		textArea_5.setBounds(80, 190, 40, 20);
		frame.getContentPane().add(textArea_5);
		
		JTextArea textArea6 = new JTextArea();
		textArea6.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textArea6.setText("6:");
		textArea6.setBounds(240, 190, 20, 20);
		frame.getContentPane().add(textArea6);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setForeground(Color.BLUE);
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setBounds(280, 190, 40, 20);
		frame.getContentPane().add(textArea_6);
		
		JTextArea textArea7 = new JTextArea();
		textArea7.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textArea7.setText("7:");
		textArea7.setBounds(440, 190, 20, 20);
		frame.getContentPane().add(textArea7);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setForeground(Color.BLUE);
		textArea_7.setBackground(Color.WHITE);
		textArea_7.setBounds(480, 190, 40, 20);
		frame.getContentPane().add(textArea_7);
		
		JTextArea textArea8 = new JTextArea();
		textArea8.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textArea8.setText("8:");
		textArea8.setBounds(640, 190, 20, 20);
		frame.getContentPane().add(textArea8);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setForeground(Color.BLUE);
		textArea_8.setBackground(Color.WHITE);
		textArea_8.setBounds(680, 190, 40, 20);
		frame.getContentPane().add(textArea_8);
		
		JTextArea txtrRpartitionParCategorie = new JTextArea();
		txtrRpartitionParCategorie.setFont(new Font("Algerian", Font.PLAIN, 18));
		txtrRpartitionParCategorie.setText("R\u00E9partition par cat\u00E9gorie");
		txtrRpartitionParCategorie.setBounds(40, 240, 474, 24);
		frame.getContentPane().add(txtrRpartitionParCategorie);
		
		JTextArea textAreaTCBR = new JTextArea();
		textAreaTCBR.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textAreaTCBR.setText("TCBR:");
		textAreaTCBR.setBounds(40, 290, 50, 20);
		frame.getContentPane().add(textAreaTCBR);
		
		JTextArea textArea_TCBR = new JTextArea();
		textArea_TCBR.setForeground(Color.BLUE);
		textArea_TCBR.setBackground(Color.WHITE);
		textArea_TCBR.setBounds(100, 290, 50, 20);
		frame.getContentPane().add(textArea_TCBR);
		
		JTextArea textAreaST09 = new JTextArea();
		textAreaST09.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textAreaST09.setText("ST09:");
		textAreaST09.setBounds(240, 290, 40, 20);
		frame.getContentPane().add(textAreaST09);
		
		JTextArea textArea_ST09 = new JTextArea();
		textArea_ST09.setForeground(Color.BLUE);
		textArea_ST09.setBackground(Color.WHITE);
		textArea_ST09.setBounds(300, 290, 50, 20);
		frame.getContentPane().add(textArea_ST09);
		
		JTextArea textAreaMSI = new JTextArea();
		textAreaMSI.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textAreaMSI.setText("MSI:");
		textAreaMSI.setBounds(440, 290, 40, 20);
		frame.getContentPane().add(textAreaMSI);
		
		JTextArea textArea_MSI = new JTextArea();
		textArea_MSI.setForeground(Color.BLUE);
		textArea_MSI.setBackground(Color.WHITE);
		textArea_MSI.setBounds(500, 290, 50, 20);
		frame.getContentPane().add(textArea_MSI);
		
		JTextArea textAreaMPL = new JTextArea();
		textAreaMPL.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textAreaMPL.setText("MPL:");
		textAreaMPL.setBounds(640, 290, 40, 20);
		frame.getContentPane().add(textAreaMPL);
		
		JTextArea textArea_MPL = new JTextArea();
		textArea_MPL.setForeground(Color.BLUE);
		textArea_MPL.setBackground(Color.WHITE);
		textArea_MPL.setBounds(700, 290, 50, 20);
		frame.getContentPane().add(textArea_MPL);
		
		JTextArea textAreaMRI = new JTextArea();
		textAreaMRI.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textAreaMRI.setText("MRI:");
		textAreaMRI.setBounds(40, 340, 40, 20);
		frame.getContentPane().add(textAreaMRI);
		
		JTextArea textArea_MRI = new JTextArea();
		textArea_MRI.setForeground(Color.BLUE);
		textArea_MRI.setBackground(Color.WHITE);
		textArea_MRI.setBounds(100, 340, 50, 20);
		frame.getContentPane().add(textArea_MRI);
		
		JTextArea textAreaST10 = new JTextArea();
		textAreaST10.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textAreaST10.setText("ST10:");
		textAreaST10.setBounds(240, 340, 40, 20);
		frame.getContentPane().add(textAreaST10);
		
		JTextArea textArea_ST10 = new JTextArea();
		textArea_ST10.setForeground(Color.BLUE);
		textArea_ST10.setBackground(Color.WHITE);
		textArea_ST10.setBounds(300, 340, 50, 20);
		frame.getContentPane().add(textArea_ST10);
		
		JTextArea textAreaST51 = new JTextArea();
		textAreaST51.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textAreaST51.setText("ST51:");
		textAreaST51.setBounds(440, 340, 40, 20);
		frame.getContentPane().add(textAreaST51);
		
		JTextArea textArea_ST51 = new JTextArea();
		textArea_ST51.setForeground(Color.BLUE);
		textArea_ST51.setBackground(Color.WHITE);
		textArea_ST51.setBounds(500, 340, 50, 20);
		frame.getContentPane().add(textArea_ST51);
		
		JTextArea textAreaST52 = new JTextArea();
		textAreaST52.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
		textAreaST52.setText("ST52:");
		textAreaST52.setBounds(640, 340, 40, 20);
		frame.getContentPane().add(textAreaST52);
		
		JTextArea textArea_ST52 = new JTextArea();
		textArea_ST52.setForeground(Color.BLUE);
		textArea_ST52.setBackground(Color.WHITE);
		textArea_ST52.setBounds(700, 340, 50, 20);
		frame.getContentPane().add(textArea_ST52);
		
		frame.setTitle("R¨¦partition des ¨¦tudiants");
		frame.setBounds(100, 100, 800, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textArea_1.setText("100");
    	textArea_2.setText("200");
    	textArea_3.setText("100");
    	textArea_4.setText("200");
    	textArea_5.setText("100");
    	textArea_6.setText("200");
    	textArea_7.setText("100");
    	textArea_8.setText("200");
    	textArea_TCBR.setText("200");
    	textArea_ST09.setText("200");
    	textArea_MSI.setText("200");
    	textArea_MPL.setText("200");
    	textArea_MRI.setText("200");
    	textArea_ST10.setText("200");
    	textArea_ST51.setText("200");
    	textArea_ST52.setText("200");
		
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	 JComboBox combo = (JComboBox)e.getSource();
                 String annee = (String)combo.getSelectedItem();
                 int year = Integer.valueOf(annee);
                if(year == 2017) {
                	textArea_1.setText("100");
                	textArea_2.setText("200");
                	textArea_3.setText("100");
                	textArea_4.setText("200");
                	textArea_5.setText("100");
                	textArea_6.setText("200");
                	textArea_7.setText("100");
                	textArea_8.setText("200");
                	textArea_TCBR.setText("200");
                	textArea_ST09.setText("200");
                	textArea_MSI.setText("200");
                	textArea_MPL.setText("200");
                	textArea_MRI.setText("200");
                	textArea_ST10.setText("200");
                	textArea_ST51.setText("200");
                	textArea_ST52.setText("200");
                }
                else {
                	textArea_1.setText("200");
                	textArea_2.setText("300");
                	textArea_3.setText("200");
                	textArea_4.setText("300");
                	textArea_5.setText("200");
                	textArea_6.setText("300");
                	textArea_7.setText("200");
                	textArea_8.setText("300");
                	textArea_TCBR.setText("300");
                	textArea_ST09.setText("300");
                	textArea_MSI.setText("300");
                	textArea_MPL.setText("300");
                	textArea_MRI.setText("300");
                	textArea_ST10.setText("300");
                	textArea_ST51.setText("300");
                	textArea_ST52.setText("300");
                }
		    }
		});
		
		// add back arrow
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.openMenu();
				frame.setVisible(false);
			}
		});
		lblNewLabel.setBounds(707, 13, 61, 61);
		ImageHelper.addBackArrowInLabel(lblNewLabel);
		frame.getContentPane().add(lblNewLabel);
	}
}
