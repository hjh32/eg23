package applicationWindows;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu {

	private JFrame frmAideAuPilotage;

	/**
	 * Launch the application.
	 */
	public static void openMenu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmAideAuPilotage.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAideAuPilotage = new JFrame();
		frmAideAuPilotage.setTitle("Aide au pilotage d'un d\u00E9partement d'enseignement \u00E0 l'UTT");
		frmAideAuPilotage.setBounds(100, 100, 800, 480);
		frmAideAuPilotage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAideAuPilotage.getContentPane().setLayout(null);
		
		// add background image
		BufferedImage myImage = null;
		try {
			myImage = ImageIO.read(new File("src\\picture\\utt.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		frmAideAuPilotage.setContentPane(new ImagePanel(myImage));
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Arial", Font.BOLD, 36));
		lblMenu.setForeground(Color.ORANGE);
		lblMenu.setBounds(330, 48, 123, 31);
		frmAideAuPilotage.getContentPane().add(lblMenu);
		
		JButton btnGestionDesEnseignants = new JButton("Gestion des enseignants");
		btnGestionDesEnseignants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchTeacher.openSearchTeacher();
				frmAideAuPilotage.setVisible(false);
			}
		});
		btnGestionDesEnseignants.setFont(new Font("Arial", Font.PLAIN, 24));
		btnGestionDesEnseignants.setBounds(64, 109, 650, 50);
		frmAideAuPilotage.getContentPane().add(btnGestionDesEnseignants);
		
		JButton btnVisualisationParSemestre = new JButton("Visualisation par semestre de la r\u00E9partition des \u00E9tudiants");
		btnVisualisationParSemestre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RepartitionDesEtudiants.openRepartitionDesEtudiants();
				frmAideAuPilotage.setVisible(false);
			}
		});
		btnVisualisationParSemestre.setFont(new Font("Arial", Font.PLAIN, 24));
		btnVisualisationParSemestre.setBounds(64, 235, 650, 50);
		frmAideAuPilotage.getContentPane().add(btnVisualisationParSemestre);
		
		JButton btnGestionDesUes = new JButton("Gestion des UEs");
		btnGestionDesUes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchUE.openSearchUE();
				frmAideAuPilotage.setVisible(false);
			}
		});
		btnGestionDesUes.setFont(new Font("Arial", Font.PLAIN, 24));
		btnGestionDesUes.setBounds(64, 172, 650, 50);
		frmAideAuPilotage.getContentPane().add(btnGestionDesUes);
		
		JButton btnStatistiquesSurLes = new JButton("Statistiques sur les \"Entr\u00E9es / Sorties\" par semestre");
		btnStatistiquesSurLes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StatistiquesSurLesEntreesSorties.openStatistiquesSurLesEntreesSorties();
				frmAideAuPilotage.setVisible(false);
			}
		});
		btnStatistiquesSurLes.setFont(new Font("Arial", Font.PLAIN, 24));
		btnStatistiquesSurLes.setBounds(64, 298, 650, 50);
		frmAideAuPilotage.getContentPane().add(btnStatistiquesSurLes);
		
		JButton btnGestionDuSemestre = new JButton("Gestion du semestre en cours");
		btnGestionDuSemestre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionDuSemestreEnCours.openGestionDuSemestreEnCours();
				frmAideAuPilotage.setVisible(false);
			}
		});
		btnGestionDuSemestre.setFont(new Font("Arial", Font.PLAIN, 24));
		btnGestionDuSemestre.setBounds(64, 361, 650, 50);
		frmAideAuPilotage.getContentPane().add(btnGestionDuSemestre);
	}
}

