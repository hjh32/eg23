package applicationWindows;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GestionDuSemestreEnCours {

	private JFrame frame;
	private JTextArea txtRetardPourRapport;
	private JTextArea txtRetardCritique;
	private JTextArea txtCandidatsLexcellence;
	private JTextArea txtPositionnementDansLe;
	private JTextArea txtEtudiant;
	private JTextArea txtEtudiant1;
	private JTextArea txtEtudiant2;
	private JTextArea txtEtudiant3;
	/**
	 * Launch the application.
	 */
	public static void openGestionDuSemestreEnCours() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionDuSemestreEnCours window = new GestionDuSemestreEnCours();
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
	public GestionDuSemestreEnCours() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		frame.setTitle("Gestion Du Semestre En Cours");
		frame.setBounds(100, 100, 800, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtRetardPourRapport = new JTextArea();
		txtRetardPourRapport.setFont(new Font("Algerian", Font.PLAIN, 16));
		txtRetardPourRapport.setText("Retard pour rapport \u00E0 son parcours");
		txtRetardPourRapport.setBounds(31, 58, 335, 21);
		frame.getContentPane().add(txtRetardPourRapport);
	
		
		txtRetardCritique = new JTextArea();
		txtRetardCritique.setFont(new Font("Algerian", Font.PLAIN, 16));
		txtRetardCritique.setText("Retard critique");
		txtRetardCritique.setBounds(401, 58, 268, 21);
		frame.getContentPane().add(txtRetardCritique);

		
		txtCandidatsLexcellence = new JTextArea();
		txtCandidatsLexcellence.setFont(new Font("Algerian", Font.PLAIN, 16));
		txtCandidatsLexcellence.setText("Candidats \u00E0 l'excellence");
		txtCandidatsLexcellence.setBounds(31, 238, 335, 21);
		frame.getContentPane().add(txtCandidatsLexcellence);

		
		txtPositionnementDansLe = new JTextArea();
		txtPositionnementDansLe.setFont(new Font("Algerian", Font.PLAIN, 16));
		txtPositionnementDansLe.setText("Positionnement dans le cursus");
		txtPositionnementDansLe.setBounds(401, 238, 335, 21);
		frame.getContentPane().add(txtPositionnementDansLe);

		txtEtudiant = new JTextArea();
		txtEtudiant.setForeground(Color.BLUE);
		txtEtudiant.setColumns(2);
		txtEtudiant.setFont(new Font("Arial", Font.PLAIN, 18));
		txtEtudiant.setText("Marie Costa  1CS + 1TM\r\nTrist Amon 2CS + 1TM");
		txtEtudiant.setBackground(Color.WHITE);
		frame.getContentPane().add(txtEtudiant);
		Border border = BorderFactory.createLineBorder(Color.YELLOW);
		txtEtudiant.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		JScrollPane scrollPane = new JScrollPane(txtEtudiant);
		scrollPane.setBounds(31, 88, 335, 140);
		scrollPane.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
		frame.getContentPane().add (scrollPane);
		
		txtEtudiant1 = new JTextArea();
		txtEtudiant1.setForeground(Color.BLUE);
		txtEtudiant1.setColumns(2);
		txtEtudiant1.setFont(new Font("Arial", Font.PLAIN, 18));
		txtEtudiant1.setText("Fran\u00e7oise Costa \r\nJean Amon");
		txtEtudiant1.setBackground(Color.WHITE);
		frame.getContentPane().add(txtEtudiant1);
		Border border2 = BorderFactory.createLineBorder(Color.RED);
		txtEtudiant1.setBorder(BorderFactory.createCompoundBorder(border2,BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		JScrollPane scrollPane1 = new JScrollPane(txtEtudiant1);
		scrollPane1.setBounds(401, 88, 335, 140);
		scrollPane1.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
		frame.getContentPane().add (scrollPane1);
		
		txtEtudiant2 = new JTextArea();
		txtEtudiant2.setForeground(Color.BLUE);
		txtEtudiant2.setColumns(2);
		txtEtudiant2.setFont(new Font("Arial", Font.PLAIN, 18));
		txtEtudiant2.setText("Nathalie MARTIN \r\nIsabelle THOMAS");
		txtEtudiant2.setBackground(Color.WHITE);
		frame.getContentPane().add(txtEtudiant2);
		Border border3 = BorderFactory.createLineBorder(Color.GREEN);
		txtEtudiant2.setBorder(BorderFactory.createCompoundBorder(border3,BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		
		JScrollPane scrollPane2 = new JScrollPane(txtEtudiant2);
		scrollPane2.setBounds(31, 268, 335, 140);
		scrollPane2.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
		frame.getContentPane().add (scrollPane2);

		txtEtudiant3 = new JTextArea();
		txtEtudiant3.setForeground(Color.BLUE);
		txtEtudiant3.setColumns(2);
		txtEtudiant3.setFont(new Font("Arial", Font.PLAIN, 18));
		txtEtudiant3.setText("H\u00e9l\u00e8ne COLIN TCBR\r\nMichel SIMON MPL");
		txtEtudiant3.setBackground(Color.WHITE);
		frame.getContentPane().add(txtEtudiant3);
		Border border4 = BorderFactory.createLineBorder(Color.BLUE);
		txtEtudiant3.setBorder(BorderFactory.createCompoundBorder(border4,BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		JScrollPane scrollPane3 = new JScrollPane(txtEtudiant3);
		scrollPane3.setBounds(401, 268, 335, 140);
		scrollPane3.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
		frame.getContentPane().add (scrollPane3);
		
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
