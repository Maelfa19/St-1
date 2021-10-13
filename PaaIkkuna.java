import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Timer;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class PaaIkkuna extends JFrame {

	private JPanel contentPane;
	
	public static JTextField textField95;
	private JButton hinta95;
	private JButton hinta98;
	private JButton hintaD;
	private JButton mainos;
	public static JTextField textField98;
	public static JTextField textFieldD;
	public static JTextField textFieldM;
	
	private MainosIkkuna mikkuna = new MainosIkkuna();
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaaIkkuna frame = new PaaIkkuna();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaaIkkuna() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PaaIkkuna.class.getResource("/Img/station.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 627);
		
		menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		menuBar.setBackground(new Color(240, 255, 255));
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Valikko");
		mnNewMenu.setBorder(null);
		mnNewMenu.setBackground(new Color(240, 255, 255));
		mnNewMenu.setOpaque(true);
		mnNewMenu.setFont(new Font("Century Gothic", Font.BOLD, 14));
		mnNewMenu.setIcon(new ImageIcon(PaaIkkuna.class.getResource("/Img/hamburger_menu.png")));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Avaa mainos");
		mntmNewMenuItem.setBorder(new LineBorder(new Color(0, 100, 0)));
		mntmNewMenuItem.setOpaque(true);
		mntmNewMenuItem.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem.setFont(new Font("Century Gothic", Font.BOLD, 14));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mikkuna.dispose();
				mikkuna = new MainosIkkuna();
				mikkuna.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Tyhjenn\u00E4 hinnasto");
		mntmNewMenuItem_1.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_1.setOpaque(true);
		mntmNewMenuItem_1.setBorder(new LineBorder(new Color(0, 100, 0)));
		mntmNewMenuItem_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField95.setText("");
				textField98.setText("");
				textFieldD.setText("");
				textFieldM.setText("");
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Lopeta");
		mntmNewMenuItem_2.setBorder(new LineBorder(new Color(0, 100, 0)));
		mntmNewMenuItem_2.setOpaque(true);
		mntmNewMenuItem_2.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = createImageIcon("Img/Warning.png");				
				int result = JOptionPane.showConfirmDialog(null, "Haluatko varmasti lopettaa?", "Lopetus?",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, icon);
				
				if (result == JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
			
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextField textField95 = new JTextField();
		textField95.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		textField95.setHorizontalAlignment(SwingConstants.CENTER);
		textField95.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		textField95.setBounds(186, 93, 219, 43);
		contentPane.add(textField95);
		textField95.setColumns(10);
		
		hinta95 = new JButton("Aseta hinta 95");
		hinta95.setBackground(new Color(255, 255, 255));
		hinta95.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		hinta95.setFont(new Font("Century Gothic", Font.BOLD, 14));
		hinta95.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filename = "src/txt/95.txt";
				kirjoitaTiedostoon(textField95.getText(), filename);
				
				MainosIkkuna.hinta5.setText(textField95.getText());
				
			}
		});
		hinta95.setBounds(24, 93, 131, 43);
		contentPane.add(hinta95);
		
		hinta98 = new JButton("Aseta hinta 98");
		hinta98.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		hinta98.setBackground(new Color(255, 255, 255));
		hinta98.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filename = "src/txt/98.txt";
				kirjoitaTiedostoon(textField98.getText(), filename);
				MainosIkkuna.hinta8.setText(textField98.getText());
			}
		});
		hinta98.setFont(new Font("Century Gothic", Font.BOLD, 14));
		hinta98.setBounds(24, 187, 131, 43);
		contentPane.add(hinta98);
		
		hintaD = new JButton("Aseta hinta diesel");
		hintaD.setBackground(new Color(255, 255, 255));
		hintaD.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		hintaD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filename = "src/txt/diesel.txt";
				kirjoitaTiedostoon(textFieldD.getText(), filename);
				MainosIkkuna.hintad.setText(textFieldD.getText());
			}
		});
		hintaD.setFont(new Font("Century Gothic", Font.BOLD, 13));
		hintaD.setBounds(24, 300, 131, 43);
		contentPane.add(hintaD);
		
		mainos = new JButton("Mainos");
		mainos.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		mainos.setBackground(new Color(255, 255, 255));
		mainos.setFont(new Font("Century Gothic", Font.BOLD, 18));
		mainos.setBounds(154, 472, 131, 43);
		contentPane.add(mainos);
		
		textField98 = new JTextField();
		textField98.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		textField98.setHorizontalAlignment(SwingConstants.CENTER);
		textField98.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		textField98.setColumns(10);
		textField98.setBounds(186, 187, 219, 43);
		contentPane.add(textField98);
		
		textFieldD = new JTextField();
		textFieldD.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		textFieldD.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldD.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		textFieldD.setColumns(10);
		textFieldD.setBounds(186, 299, 219, 43);
		contentPane.add(textFieldD);
		
		textFieldM = new JTextField();
		textFieldM.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		textFieldM.setColumns(10);
		textFieldM.setBounds(81, 397, 276, 52);
		contentPane.add(textFieldM);
	}
	
//public String lueViisi(String filename) {
//		
//		String alltext = "";
//					
//		try {
//			FileReader freader = new FileReader(filename);
//			BufferedReader br = new BufferedReader(freader);
//			String line;
//			while ((line = br.readLine()) != null) {
//			alltext = alltext + line + "\n";
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			alltext = "";
//			}
//					
//			return alltext;
//	}
				
	public void kirjoitaTiedostoon(String txt, String filename) {
		
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(filename, true);
			fwriter.write(date.toString() + "\n");
			fwriter.write(txt + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
			}
	}
		protected ImageIcon createImageIcon(String path) {
			java.net.URL imgURL = getClass().getResource(path);
			if (imgURL != null) {
				ImageIcon icon = new ImageIcon(imgURL, null);
			} else {
				System.err.println("Couldn´t find file: " + path);
				return null;
			}
			return null;
		}
		}
	
	




