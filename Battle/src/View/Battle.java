package View;
import Weapon.*;
import Player.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import Player.*
;public class Battle extends JFrame {
	
		JProgressBar w1_bar = new JProgressBar();
		JLabel w1_img = new JLabel("New label");
		JProgressBar p2_bar = new JProgressBar();
		JProgressBar p1_bar = new JProgressBar();
		JLabel p2_img = new JLabel("");
		JLabel p1_img = new JLabel("");
	private final JButton p2attack = new JButton("\uACF5\uACA9\uD558\uAE30(-3)");
	private final JProgressBar w2_bar = new JProgressBar();
	private final JButton p1heal = new JButton("\uD68C\uBCF5\uD558\uAE30(+10)");
	private final JButton p2heal = new JButton("\uD68C\uBCF5\uD558\uAE30(+10)");
	private final JLabel lblNewLabel = new JLabel("");
	private final JButton p1changeweapon = new JButton("\uBB34\uAE30 \uBC14\uAFB8\uAE30");
	private final JButton p2changeweapon = new JButton("\uBB34\uAE30 \uBC14\uAFB8\uAE30");
	private JPanel contentPane;
	private JTextField p1_hp= new JTextField();
	private JTextField p2_hp= new JTextField();
	JLabel w2_img = new JLabel("New label");
	JButton p1attack = new JButton("\uACF5\uACA9\uD558\uAE30(-3)");
	public static Player winner = new Player();
	private final JTextField w1_hp = new JTextField();
	private final JTextField w2_hp = new JTextField();
	public String name="battle";
	public static Player [] winners = new Player[2];
	private final JLabel lblNewLabel_1 = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		EventQueue.invokeLater(new Runnable() {
			public void run(Player p1, Player p2, Tournament tnm, String name) {
				
				int i=0;
				try {
					Battle frame = new Battle(p1, p2, tnm, name);
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
	
	public Battle(Player p1, Player p2, Tournament tnm, String name) {
		this();
		this.name=name;
		weapon w11= new weapon(p1, this);
		weapon w22= new weapon(p2, this);
		
		//받은 플레이어 정보로 세팅.
			changeImg(p1, p1_img, w1_img);
			changeImg(p2, p2_img, w2_img);
			try {
			p1_bar.setMaximum(p1.getHp());
			p2_bar.setMaximum(p2.getHp());
			p1_bar.setValue(p1.getHp());
			p2_bar.setValue(p2.getHp());
			
			
			w1_bar.setMaximum(p1.getWeapon().getHp());
			w2_bar.setMaximum(p2.getWeapon().getHp());
			w1_bar.setValue(p1.getWeapon().getHp());
			w2_bar.setValue(p2.getWeapon().getHp());
			
			p1_hp.setText("HP :"+p1_bar.getValue());
			p2_hp.setText("HP :"+p2_bar.getValue());
			w1_hp.setText("HP :"+w1_bar.getValue());
			w2_hp.setText("HP :"+w2_bar.getValue());
			
			p1attack.setText("공격하기(-"+(p1.getPower()+p1.getWeapon().getPower())+")");
			p2attack.setText("공격하기(-"+(p2.getPower()+p2.getWeapon().getPower())+")");
			}
			catch(NullPointerException e) {
				
			}
		////////////////////////////////////////////////////////
			p1attack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//무기가 사용가능하고 자기 hp가 남아있을 때만 상대에게 공격가능 
					if(w1_bar.getValue()>0&&p1_bar.getValue()>0) {
						p2_bar.setValue(p2_bar.getValue()-p1.getPower()-p1.getWeapon().getPower());
						w1_bar.setValue(w1_bar.getValue()-5);
						//깎인 hp 보여주기
						p2_hp.setText("HP :"+p2_bar.getValue());
						w1_hp.setText("HP :"+w1_bar.getValue());
					}
					//무기 hp가 0이 되면 부러져서 쓸 수 없음을 보여주기
					if(w1_bar.getValue()<=0) {
						w1_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\\uADF8\uB9BC1.png"));
					}
					if(p2_bar.getValue()<=0) {
						winner=p1;
						ifWin(winner, tnm);
					}
					
				}
			});
			
			p2attack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				if(w2_bar.getValue()>0&&p2_bar.getValue()>0) {	
					p1_bar.setValue(p1_bar.getValue()-p2.getPower()-p2.getWeapon().getPower());
					w2_bar.setValue(w2_bar.getValue()-5);
					//깎인 hp 보여주기
					p1_hp.setText("HP :"+p1_bar.getValue());
					w2_hp.setText("HP :"+w2_bar.getValue());
				}
				if(w2_bar.getValue()<=0) {
					w2_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\\uADF8\uB9BC1.png"));
				}
				if(p1_bar.getValue()<=0) {
					winner=p2;
					ifWin(winner, tnm);
				}
				}
			});
			
			p1heal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					p1_bar.setValue(p1_bar.getValue()+10);
					//회복한 hp 반영하기
					p1_hp.setText("HP :"+p1_bar.getValue());
				}
			});
			p2heal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					p2_bar.setValue(p2_bar.getValue()+10);
					p2_hp.setText("HP :"+p2_bar.getValue());
				}
			});
			
			p1changeweapon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!(p1 instanceof Hulk)) {
						w11.setVisible(true);
					}
				}
			});
			p2changeweapon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!(p2 instanceof Hulk)) {
						w22.setVisible(true);
					}
				}
			});
	}
		
	public Battle() {	
		
		setTitle("Battle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 684);
		contentPane = new JPanel();
		contentPane.setName("\r\n");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		p1_img.setHorizontalAlignment(SwingConstants.CENTER);
		p1_img.setBackground(new Color(192, 192, 192));
		p1_img.setForeground(Color.BLACK);
		p1_img.setBounds(92, 111, 173, 195);
		contentPane.add(p1_img);
		p2_img.setHorizontalAlignment(SwingConstants.CENTER);
		p2_img.setForeground(Color.BLACK);
		p2_img.setBackground(Color.LIGHT_GRAY);
		p2_img.setBounds(575, 111, 173, 195);
		contentPane.add(p2_img);
		
		p1_bar.setBackground(new Color(240, 240, 240));
		p1_bar.setForeground(Color.RED);
		p1_bar.setBounds(62, 87, 225, 14);
		contentPane.add(p1_bar);
		
		p2_bar.setForeground(Color.RED);
		p2_bar.setBackground(SystemColor.menu);
		p2_bar.setBounds(550, 87, 225, 14);
		contentPane.add(p2_bar);
		w1_img.setBounds(92, 316, 92, 85);
		contentPane.add(w1_img);
		
		w1_bar.setForeground(Color.RED);
		w1_bar.setBackground(SystemColor.menu);
		w1_bar.setBounds(62, 296, 155, 7);
		contentPane.add(w1_bar);
		
		w2_img.setBounds(683, 316, 92, 85);
		contentPane.add(w2_img);
		
		p1attack.setBackground(new Color(143, 188, 143));
		p1attack.setFont(new Font("한컴 소망 M", Font.PLAIN, 14));
		p1attack.setToolTipText("");
		p1attack.setBounds(62, 411, 225, 72);
		contentPane.add(p1attack);
		p2attack.setToolTipText("");
		p2attack.setFont(new Font("한컴 소망 M", Font.PLAIN, 14));
		p2attack.setBackground(new Color(143, 188, 143));
		p2attack.setBounds(550, 411, 225, 72);
		
		contentPane.add(p2attack);
		w2_bar.setForeground(Color.RED);
		w2_bar.setBackground(SystemColor.menu);
		w2_bar.setBounds(620, 296, 155, 7);
		
		contentPane.add(w2_bar);
		p1heal.setBorder(new LineBorder(new Color(128, 128, 0), 1, true));
		p1heal.setToolTipText("");
		p1heal.setFont(new Font("한컴 소망 M", Font.PLAIN, 14));
		p1heal.setBackground(new Color(128, 128, 0));
		p1heal.setBounds(62, 493, 225, 33);
		
		contentPane.add(p1heal);
		p2heal.setToolTipText("");
		p2heal.setFont(new Font("한컴 소망 M", Font.PLAIN, 14));
		p2heal.setBackground(new Color(128, 128, 0));
		p2heal.setBounds(550, 493, 225, 33);
		
		contentPane.add(p2heal);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\uAD8C\uBCD1\uAD6D\\Desktop\\vs.png"));
		lblNewLabel.setBounds(348, 38, 155, 131);
		
		contentPane.add(lblNewLabel);
		p1changeweapon.setToolTipText("");
		p1changeweapon.setFont(new Font("한컴 소망 M", Font.PLAIN, 14));
		p1changeweapon.setBackground(new Color(70, 130, 180));
		p1changeweapon.setBounds(62, 536, 225, 33);
		
		contentPane.add(p1changeweapon);		
		p2changeweapon.setToolTipText("");
		p2changeweapon.setFont(new Font("한컴 소망 M", Font.PLAIN, 14));
		p2changeweapon.setBackground(new Color(70, 130, 180));
		p2changeweapon.setBounds(550, 542, 225, 33);
		
		contentPane.add(p2changeweapon);
		
	
		p1_hp.setBackground(Color.LIGHT_GRAY);
		p1_hp.setFont(new Font("한컴 소망 M", Font.PLAIN, 9));
		p1_hp.setBounds(62, 56, 55, 21);
		contentPane.add(p1_hp);
		p1_hp.setColumns(10);
		
		p2_hp.setFont(new Font("한컴 소망 M", Font.PLAIN, 9));
		p2_hp.setColumns(10);
		p2_hp.setBackground(Color.LIGHT_GRAY);
		p2_hp.setBounds(720, 55, 55, 21);
		contentPane.add(p2_hp);

		w1_hp.setFont(new Font("한컴 소망 M", Font.PLAIN, 9));
		w1_hp.setColumns(10);
		w1_hp.setBackground(Color.LIGHT_GRAY);
		w1_hp.setBounds(62, 270, 55, 21);
		
		contentPane.add(w1_hp);
		w2_hp.setFont(new Font("한컴 소망 M", Font.PLAIN, 9));
		w2_hp.setColumns(10);
		w2_hp.setBackground(Color.LIGHT_GRAY);
		w2_hp.setBounds(720, 269, 55, 21);
		
		contentPane.add(w2_hp);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\ground.png"));
		lblNewLabel_1.setBounds(-13, -13, 824, 673);
		
		contentPane.add(lblNewLabel_1);
	}

	public void changeImg(Player p1, JLabel p1_img, JLabel weapon) {
		int num=0;
		if(p1 instanceof Hulk)num=1;
		if(p1 instanceof Thor)num=2;
		if(p1 instanceof Spiderman)num=3;
		if(p1 instanceof DS)num=4;
		
		switch(num) {
		case 1:
			p1_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\hulk.png"));
			weapon.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\fist.png"));
			p1.getWeapon().setPower(p1.getPower());
			p1.getWeapon().setHp(p1.getHp());
			break;
		case 2:
			p1_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\thor.png"));;
			weapon.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\hammer.png"));
			break;
		case 3:
			p1_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\ss.png"));
			weapon.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\ww.png"));
			break;
		case 4:
			p1_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\ds.png"));
			weapon.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\rr.png"));
			break;
		}
		
	}
	public void changeImg(Weapon w1, JLabel w1_img) {
		int num=0;
		if(w1 instanceof Sword)num=1;
		if(w1 instanceof Gun)num=2;
		if(w1 instanceof Fist)num=3;
		
		switch(num) {
		case 1:
			w1_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\sword.png"));
			break;
		case 2:
			w1_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\gun.png"));
			break;
		case 3:
			w1_img.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\fist.png"));
			break;
		}
	}
	public void changeWeapon(Player pp) {
		if(pp.getHp()==this.p1_bar.getMaximum()) {
			w1_bar.setMaximum(pp.getWeapon().getHp());
			w1_bar.setValue(pp.getWeapon().getHp());
			w1_hp.setText("HP :"+w1_bar.getValue());
			changeImg(pp.getWeapon(), w1_img);
			System.out.println("실행됐수다");
		}
		if(pp.getHp()==this.p2_bar.getMaximum()) {
			w2_bar.setMaximum(pp.getWeapon().getHp());
			w2_bar.setValue(pp.getWeapon().getHp());
			w2_hp.setText("HP :"+w2_bar.getValue());
			changeImg(pp.getWeapon(), w2_img);
		}
		else System.out.println("실행안됨 쩝");
	}
	public JLabel  decidePlace(Tournament tnm) {
		if(this.name=="battle1") {
			return tnm.b1;
		}
		else if(this.name=="battle2") {
			return tnm.b2;
		}
		else{
			return tnm.c1;
		}
	}
	public void ifWin(Player winner, Tournament tnm) {
		tnm.setVisible(true);
			dispose();
		
		tnm.setTNM(winner, decidePlace(tnm));
		if(name=="battle1") {
			winners[0]=winner;
			
		}
		else if(name=="battle2") {
			winners[1]=winner;
			tnm.finalGame(winners[0], winners[1]);
			
		}
	}
}

