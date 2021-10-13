import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MainosIkkuna extends JFrame {
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	public static JLabel hinta5;
	public static JLabel hinta8;
	public static JLabel hintad;
	public static JLabel mainos1;
	private JLabel tankkikuva;
	private JLabel kuva95;
	private JLabel kuvaD;
	private JLabel kuva98;
	
	//private PaaIkkuna pikkuna = new PaaIkkuna();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainosIkkuna frame = new MainosIkkuna();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainosIkkuna() {
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainosIkkuna.class.getResource("/Img/station.png")));
		setForeground(new Color(102, 102, 51));
		setBackground(new Color(107, 142, 35));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 491, 804);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(107, 142, 35), new Color(107, 142, 35), new Color(255, 255, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		hinta5 = new JLabel("");
		hinta5.setForeground(new Color(255, 255, 255));
		hinta5.setHorizontalAlignment(SwingConstants.CENTER);
		hinta5.setFont(new Font("Agency FB", Font.BOLD, 50));
		hinta5.setBorder(new LineBorder(new Color(255, 255, 255), 6));
		hinta5.setOpaque(true);
		hinta5.setBackground(new Color(0, 100, 0));
		hinta5.setBounds(190, 235, 193, 73);
		contentPane.add(hinta5);
//		pikkuna.dispose();
//		pikkuna = new PaaIkkuna();
//		pikkuna.setVisible(true);
		
		hinta8 = new JLabel("");
		hinta8.setForeground(new Color(255, 255, 255));
		hinta8.setHorizontalAlignment(SwingConstants.CENTER);
		hinta8.setFont(new Font("Agency FB", Font.BOLD, 50));
		hinta8.setOpaque(true);
		hinta8.setBorder(new LineBorder(new Color(255, 255, 255), 6));
		hinta8.setBackground(new Color(0, 100, 0));
		hinta8.setBounds(190, 403, 193, 73);
		contentPane.add(hinta8);
		
		hintad = new JLabel("");
		hintad.setForeground(new Color(255, 255, 255));
		hintad.setFont(new Font("Agency FB", Font.BOLD, 50));
		hintad.setHorizontalAlignment(SwingConstants.CENTER);
		hintad.setOpaque(true);
		hintad.setBorder(new LineBorder(new Color(255, 255, 255), 6));
		hintad.setBackground(new Color(0, 100, 0));
		hintad.setBounds(190, 565, 193, 73);
		contentPane.add(hintad);
		
		lblNewLabel = new JLabel("Tervetuloa!");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 100, 0), 4));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(104, 23, 324, 67);
		contentPane.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 36));
		
		mainos1 = new JLabel("");
		mainos1.setIcon(new ImageIcon(MainosIkkuna.class.getResource("/Img/salep.png")));
		mainos1.setHorizontalTextPosition(SwingConstants.CENTER);
		mainos1.setHorizontalAlignment(SwingConstants.LEFT);
		mainos1.setForeground(new Color(255, 255, 255));
		mainos1.setFont(new Font("Century Gothic", Font.BOLD, 24));
		mainos1.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		mainos1.setOpaque(true);
		mainos1.setBackground(new Color(0, 100, 0));
		mainos1.setBounds(40, 105, 394, 83);
		contentPane.add(mainos1);
		
		kuva95 = new JLabel("");
		kuva95.setHorizontalAlignment(SwingConstants.CENTER);
		kuva95.setIcon(new ImageIcon(MainosIkkuna.class.getResource("/Img/95p.jpg")));
		kuva95.setBorder(new LineBorder(new Color(0, 100, 0), 3, true));
		kuva95.setBounds(47, 221, 106, 106);
		contentPane.add(kuva95);
		
		kuvaD = new JLabel("");
		kuvaD.setHorizontalAlignment(SwingConstants.CENTER);
		kuvaD.setBorder(new LineBorder(new Color(0, 100, 0), 3, true));
		kuvaD.setIcon(new ImageIcon(MainosIkkuna.class.getResource("/Img/dieselp.jpg")));
		kuvaD.setBounds(47, 545, 106, 106);
		contentPane.add(kuvaD);
		
		kuva98 = new JLabel("");
		kuva98.setHorizontalAlignment(SwingConstants.CENTER);
		kuva98.setIcon(new ImageIcon(MainosIkkuna.class.getResource("/Img/98p.jpg")));
		kuva98.setBorder(new LineBorder(new Color(0, 100, 0), 3, true));
		kuva98.setBounds(47, 383, 106, 106);
		contentPane.add(kuva98);
		
		tankkikuva = new JLabel("");
		tankkikuva.setOpaque(true);
		tankkikuva.setBackground(new Color(255, 255, 255));
		tankkikuva.setBorder(new LineBorder(new Color(0, 100, 0), 4));
		tankkikuva.setIcon(new ImageIcon(MainosIkkuna.class.getResource("/Img/gas.png")));
		tankkikuva.setHorizontalAlignment(SwingConstants.CENTER);
		tankkikuva.setBounds(40, 23, 69, 67);
		contentPane.add(tankkikuva);

	}
	}