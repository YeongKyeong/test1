package View;

import java.awt.BorderLayout;
import Player.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Tournament extends JFrame {

	private JPanel contentPane;
	JLabel a1 = new JLabel("");
	JLabel a2 = new JLabel("");
	JLabel a3 = new JLabel("");
	JLabel a4 = new JLabel("");
	JLabel b1 = new JLabel("");
	JLabel b2 = new JLabel("");
	JLabel c1 = new JLabel("");
	JButton fightbt1 = new JButton("\uC804\uD22C \uC2DC\uC791");
	JButton fightbt2 = new JButton("\uC804\uD22C \uC2DC\uC791");
	JButton fightbt3 = new JButton("\uC804\uD22C \uC2DC\uC791");
	private final JLabel lblNewLabel = new JLabel("New label");
	private final JLabel lblNewLabel_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1_1_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1_1_1_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1_1_1_1_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("New label");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run(Player p1,Player p2, Player p3, Player p4) {
				try {
					Tournament frame = new Tournament(p1, p2, p3, p4);
					//frame.setVisible(true);
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
	public Tournament() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		a1.setBackground(new Color(192, 192, 192));
		a1.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		
	
		a1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\question.png"));
		a1.setBounds(25, 448, 127, 166);
		contentPane.add(a1);
		a2.setBackground(new Color(192, 192, 192));
		a2.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		
		
		a2.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\question.png"));
		a2.setBounds(227, 448, 127, 166);
		contentPane.add(a2);
		a3.setBackground(new Color(192, 192, 192));
		a3.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		
		
		a3.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\question.png"));
		a3.setBounds(387, 448, 132, 166);
		contentPane.add(a3);
		a4.setBackground(new Color(192, 192, 192));
		a4.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		
		
		a4.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\question.png"));
		a4.setBounds(604, 448, 127, 166);
		contentPane.add(a4);
		b1.setBackground(new Color(192, 192, 192));
		b1.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		
		
		b1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\question.png"));
		b1.setBounds(126, 226, 127, 160);
		contentPane.add(b1);
		b2.setBackground(new Color(192, 192, 192));
		b2.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		
		
		b2.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\question.png"));
		b2.setBounds(509, 226, 127, 160);
		contentPane.add(b2);
		c1.setBackground(new Color(192, 192, 192));
		c1.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		
		
		c1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\question.png"));
		c1.setBounds(305, 0, 127, 160);
		contentPane.add(c1);
		
		
		
		fightbt1.setFont(new Font("한컴 소망 M", Font.PLAIN, 12));
		fightbt1.setBounds(136, 591, 97, 23);
		contentPane.add(fightbt1);
		
		
		
		fightbt2.setFont(new Font("한컴 소망 M", Font.PLAIN, 12));
		fightbt2.setBounds(519, 591, 97, 23);
		contentPane.add(fightbt2);
		
		fightbt3.setFont(new Font("한컴 소망 M", Font.PLAIN, 12));
		fightbt3.setBounds(320, 363, 97, 23);
		contentPane.add(fightbt3);
		
		JButton gamestart_button = new JButton("\uAC8C\uC784 \uC885\uB8CC");
		gamestart_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		gamestart_button.setForeground(Color.WHITE);
		gamestart_button.setFont(new Font("한컴 소망 M", Font.BOLD, 30));
		gamestart_button.setBackground(new Color(47, 79, 79));
		gamestart_button.setBounds(543, 26, 188, 81);
		contentPane.add(gamestart_button);
		lblNewLabel.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBackground(new Color(128, 0, 0));
		lblNewLabel.setBounds(82, 412, 19, 38);
		
		contentPane.add(lblNewLabel);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1.setBounds(283, 412, 19, 38);
		
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1_1.setBounds(440, 412, 19, 38);
		
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1_1_1.setBounds(657, 412, 19, 38);
		
		contentPane.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1.setBounds(179, 189, 19, 38);
		
		contentPane.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1_1_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1.setBounds(562, 189, 19, 38);
		
		contentPane.add(lblNewLabel_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1.setBounds(179, 384, 19, 29);
		
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1_1_1_1_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(562, 384, 19, 29);
		
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1_1_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1_1_1_1_1_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1_1_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(359, 158, 19, 29);
		
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1_1_1_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(82, 405, 220, 15);
		
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(456, 412, 220, 15);
		
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\red.png"));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setBounds(179, 183, 402, 15);
		
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1);
		
		
		
		
	}
	public Tournament(Player p1, Player p2, Player p3, Player p4) {
		this();
		//랜덤하게 대진표 정하기
		setTNM(p1, a1);
		setTNM(p2, a2);
		setTNM(p3, a3);
		setTNM(p4, a4);
		
		//battle에 플레이어 정보 보내기
		Battle battle1= new Battle(p1, p2, this, "battle1");
		Battle battle2= new Battle(p3, p4, this, "battle2");
		
		fightbt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				battle1.setVisible(true);

				dispose();
				}
		});	
		
		fightbt2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				battle2.setVisible(true);
				
				dispose();
			}

		});
	
	}
	public void finalGame(Player win1, Player win2) {
		Battle battle3= new Battle(win1, win2, this, "battle3");

		fightbt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				battle3.setVisible(true);
				dispose();
			}
		});
		
	}
	public void setTNM(Player p1, JLabel a1) {
		
		int num=0;
		if(p1 instanceof Hulk)num=1;
		if(p1 instanceof Thor)num=2;
		if(p1 instanceof Spiderman)num=3;
		if(p1 instanceof DS)num=4;
		
		switch(num) {
		case 1:
			a1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\hulk.png"));
			break;
		case 2:
			a1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\thor.png"));
			break;
		case 3:
			a1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\ss.png"));
			break;
		case 4:
			a1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\ds.png"));
			break;
		}
	}

	
}
