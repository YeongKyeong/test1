package View;

import java.awt.BorderLayout;
import Player.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField ds_name;
	private JTextPane ds_exp;
	private JLabel spider_img;
	private JTextField spdm_name;
	private JTextPane spdm_exp;
	private JLabel hulk_img;
	private JTextField hulk_name;
	private JTextPane hulk_exp;
	private JLabel thor_img;
	private JTextField thor_name;
	private JTextPane thor_exp;
	private JButton gamestart_button;
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run(Player p1, Player p2, Player p3, Player p4, Tournament tnm) {
				try {
					Start frame = new Start(p1, p2, p3, p4, tnm);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 671);
		contentPane = new JPanel();
		textField = new JTextField();
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(173, 216, 230));
		JLabel ds_img = new JLabel("");
		ds_img.setBackground(new Color(192, 192, 192));
		ds_img.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		ds_name = new JTextField();
		ds_exp = new JTextPane();
		spider_img = new JLabel("");
		spider_img.setBackground(new Color(192, 192, 192));
		spider_img.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		spdm_name = new JTextField();
		spdm_exp = new JTextPane();
		hulk_img = new JLabel("");
		hulk_img.setBackground(new Color(192, 192, 192));
		hulk_img.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		hulk_name = new JTextField();
		hulk_exp = new JTextPane();
		thor_img = new JLabel("");
		thor_img.setBackground(new Color(192, 192, 192));
		thor_img.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		thor_name = new JTextField();
		thor_exp = new JTextPane();
		gamestart_button = new JButton("\uAC8C\uC784 \uC2DC\uC791");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField.setText("AVENGERS BATTLE GAME");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.BOLD, 25));
		textField.setColumns(10);
		textField.setBackground(new Color(128, 0, 0));
		textField.setBounds(170, 10, 496, 72);
		contentPane.add(textField);
		
	
		textField_1.setText(">>\uAC8C\uC784 \uC2DC\uC791 \uBC84\uD2BC\uC744 \uB204\uB974\uBA74 \uCE90\uB9AD\uD130\uB4E4\uC758 \uC804\uD22C \uB300\uC9C4\uD45C\uAC00 \uB79C\uB364\uD558\uAC8C \uC815\uD574\uC9D1\uB2C8\uB2E4!");
		textField_1.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		textField_1.setBounds(12, 92, 798, 21);
		contentPane.add(textField_1);
		

		ds_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\ds.png"));
		ds_img.setBounds(22, 123, 150, 172);
		contentPane.add(ds_img);
		
	
		ds_name.setText("\uB2E5\uD130 \uC2A4\uD2B8\uB808\uC778\uC9C0");
		ds_name.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 12));
		ds_name.setColumns(10);
		ds_name.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		ds_name.setBackground(Color.LIGHT_GRAY);
		ds_name.setBounds(184, 123, 116, 21);
		contentPane.add(ds_name);
		
		
		ds_exp.setText(">>hp : 20\r\n>>power : 10\r\n>>\uAE30\uBCF8 \uBB34\uAE30 : \uB9C8\uBC95 \uBC18\uC9C0(hp : 15)\r\n\r\n\uB9C8\uBC95 \uBC18\uC9C0\uB9CC \uC788\uC73C\uBA74 \uB9C8\uBC95\uC744 \uC790\uC720\uC790\uC7AC\uB85C \uBD80\uB9B4 \uC218 \uC788\uB2E4.");
		ds_exp.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 12));
		ds_exp.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		ds_exp.setBackground(Color.LIGHT_GRAY);
		ds_exp.setBounds(184, 154, 206, 141);
		contentPane.add(ds_exp);
		
	
		spider_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\ss.png"));
		spider_img.setBounds(22, 317, 150, 178);
		contentPane.add(spider_img);
		
	
		spdm_name.setText("\uC2A4\uD30C\uC774\uB354\uB9E8");
		spdm_name.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 12));
		spdm_name.setColumns(10);
		spdm_name.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		spdm_name.setBackground(Color.LIGHT_GRAY);
		spdm_name.setBounds(184, 317, 116, 21);
		contentPane.add(spdm_name);
		
		
		spdm_exp.setText(">>hp : 20\r\n>>power : 8\r\n>>\uAE30\uBCF8 \uBB34\uAE30 : \uAC70\uBBF8\uC904(hp : 10)\r\n\r\n\uAC70\uBBF8\uC904\uB85C \uBE60\uB974\uAC8C \uC6C0\uC9C1\uC778 \uB4A4 \uC0C1\uB300\uBC29\uC758 \uBAA9\uC744 \uC870\uB978\uB2E4.");
		spdm_exp.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 12));
		spdm_exp.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		spdm_exp.setBackground(Color.LIGHT_GRAY);
		spdm_exp.setBounds(184, 348, 206, 144);
		contentPane.add(spdm_exp);
		
	
		hulk_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\hulk.png"));
		hulk_img.setBounds(412, 123, 150, 172);
		contentPane.add(hulk_img);
		

		hulk_name.setText("\uD5D0\uD06C");
		hulk_name.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 12));
		hulk_name.setColumns(10);
		hulk_name.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		hulk_name.setBackground(Color.LIGHT_GRAY);
		hulk_name.setBounds(574, 123, 116, 21);
		contentPane.add(hulk_name);
		
	
		hulk_exp.setText(">>hp : 30\r\n>>power : 20\r\n>>\uAE30\uBCF8 \uBB34\uAE30 : \uD5D0\uD06C \uC8FC\uBA39(hp : 30)\r\n\r\n\uD5D0\uD06C\uB294 \uB2E4\uB978 \uBB34\uAE30\uB97C \uC0AC\uC6A9\uD558\uC9C0 \uC54A\uACE0 \uC8FC\uBA39\uC73C\uB85C \uC2B9\uBD80\uB97C \uB0B8\uB2E4.");
		hulk_exp.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 12));
		hulk_exp.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		hulk_exp.setBackground(Color.LIGHT_GRAY);
		hulk_exp.setBounds(574, 154, 206, 141);
		contentPane.add(hulk_exp);
		
		
		thor_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\thor.png"));
		thor_img.setBounds(412, 317, 150, 178);
		contentPane.add(thor_img);
		
		
		thor_name.setText("\uD1A0\uB974");
		thor_name.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 12));
		thor_name.setColumns(10);
		thor_name.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		thor_name.setBackground(Color.LIGHT_GRAY);
		thor_name.setBounds(574, 317, 116, 21);
		contentPane.add(thor_name);
		
		
		thor_exp.setText(">>hp : 40\r\n>>power : 12\r\n>>\uAE30\uBCF8 \uBB34\uAE30 : \uBB20\uB2C8\uB974(hp : 30)\r\n\r\n\uBB20\uB2C8\uB974\uB85C \uBCBC\uB77D\uC744 \uC0AC\uC6A9\uD560 \uC218 \uC788\uB2E4.");
		thor_exp.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 12));
		thor_exp.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		thor_exp.setBackground(Color.LIGHT_GRAY);
		thor_exp.setBounds(574, 348, 206, 147);
		contentPane.add(thor_exp);
		
		
		
		gamestart_button.setForeground(Color.WHITE);
		gamestart_button.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.BOLD, 30));
		gamestart_button.setBackground(new Color(47, 79, 79));
		gamestart_button.setBounds(310, 527, 188, 81);
		contentPane.add(gamestart_button);
		lblNewLabel.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\avengers.png"));
		lblNewLabel.setBounds(-12, -11, 834, 643);
		contentPane.add(lblNewLabel);
	}
	public Start(Player p1, Player p2, Player p3, Player p4, Tournament tnm) {
		this();
		gamestart_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tnm.setVisible(true);
				dispose();
			}
		});
	}
}
