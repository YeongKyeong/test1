package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import Weapon.*;
import Player.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class weapon extends JFrame {
	JLabel lblNewLabel_1 = new JLabel("\uBB34\uAE30 \uBC14\uAFB8\uAE30");
	JLabel swordimg = new JLabel("");
	JTextPane textPane = new JTextPane();
	JTextPane txtpnpower = new JTextPane();
	JTextPane textPane_1_1 = new JTextPane();
	JButton btnNewButton = new JButton("\uBC14\uAFB8\uAE30");
	JCheckBox sword_checkbox = new JCheckBox("\uCE7C");
	JCheckBox gun_checkbox = new JCheckBox("\uCD1D");
	JCheckBox fist_checkbox = new JCheckBox("\uC8FC\uBA39");
	JLabel gunimg = new JLabel("");
	JLabel fistimg = new JLabel("");
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run(Player p1, Battle b1) {
				try {
					weapon frame = new weapon(p1, b1);
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
	public weapon() {
		setTitle("weapon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		lblNewLabel_1.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(255, 192, 203));
		lblNewLabel_1.setBounds(39, 20, 720, 52);
		contentPane.add(lblNewLabel_1);
		swordimg.setBackground(new Color(211, 211, 211));
		swordimg.setBorder(new LineBorder(new Color(233, 150, 122), 3, true));
		
		
		swordimg.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\sword.png"));
		swordimg.setBounds(39, 104, 137, 117);
		contentPane.add(swordimg);
	
		
		textPane.setBorder(new LineBorder(new Color(255, 218, 185), 3, true));
		textPane.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 14));
		textPane.setText(">>\uC704\uB825\uC774 \uB79C\uB364\uD558\uAC8C \uC815\uD574\uC9D1\uB2C8\uB2E4.\r\n>>power=hp : 2~6\r\n>>\uC88B\uC740 \uCE7C\uC744 \uAC00\uC9C8 \uC218\uB3C4, \uB098\uC05C \uCE7C\uC744 \uAC00\uC9C8 \uC218\uB3C4 \uC788\uC2B5\uB2C8\uB2E4.");
		textPane.setBounds(188, 133, 254, 88);
		contentPane.add(textPane);
		
	
		txtpnpower.setBorder(new LineBorder(new Color(255, 218, 185), 3, true));
		txtpnpower.setText(">>power : 3\r\n>>hp : 5");
		txtpnpower.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 14));
		txtpnpower.setBounds(188, 289, 254, 88);
		contentPane.add(txtpnpower);
		
	
		textPane_1_1.setBorder(new LineBorder(new Color(255, 218, 185), 3, true));
		textPane_1_1.setText(">>\uC8FC\uBA39\uC758 \uC0C1\uD0DC\uB294 \uD50C\uB808\uC774\uC5B4\uC758 \uC0C1\uD0DC\uC640 \uB3D9\uC77C\uD569\uB2C8\uB2E4.\r\n>>\uBB34\uAE30\uAC00 \uB9C8\uC74C\uC5D0 \uB4E4\uC9C0 \uC54A\uB294\uB2E4\uBA74, \uC8FC\uBA39\uC73C\uB85C \uC2F8\uC6B0\uC138\uC694!");
		textPane_1_1.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 14));
		textPane_1_1.setBounds(188, 452, 254, 88);
		contentPane.add(textPane_1_1);
		
		
		btnNewButton.setBorder(new LineBorder(null, 1, true));
		btnNewButton.setBackground(new Color(173, 216, 230));
		btnNewButton.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.PLAIN, 18));
		btnNewButton.setBounds(557, 452, 168, 88);
		contentPane.add(btnNewButton);
		
		sword_checkbox.setBackground(new Color(255, 218, 185));
		sword_checkbox.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.BOLD, 12));
		sword_checkbox.setBounds(190, 104, 115, 23);
		contentPane.add(sword_checkbox);
	
		gun_checkbox.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.BOLD, 12));
		gun_checkbox.setBackground(new Color(255, 218, 185));
		gun_checkbox.setBounds(188, 260, 115, 23);
		contentPane.add(gun_checkbox);
		
		fist_checkbox.setFont(new Font("ÇÑÄÄ ¼Ò¸Á M", Font.BOLD, 12));
		fist_checkbox.setBackground(new Color(255, 218, 185));
		fist_checkbox.setBounds(188, 420, 115, 23);
		contentPane.add(fist_checkbox);
		
		gunimg.setBackground(new Color(211, 211, 211));
		gunimg.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\gun.png"));
		gunimg.setBorder(new LineBorder(new Color(233, 150, 122), 3, true));
		gunimg.setBounds(39, 260, 137, 117);
		contentPane.add(gunimg);
		
		fistimg.setBackground(new Color(211, 211, 211));
		fistimg.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\fist.png"));
		fistimg.setBorder(new LineBorder(new Color(233, 150, 122), 3, true));
		fistimg.setBounds(39, 420, 137, 117);
		contentPane.add(fistimg);
	
		
	}
	public weapon(Player p1, Battle b1) {
		this();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sword_checkbox.isSelected()) {
					p1.setWeapon(new Sword());
					b1.changeWeapon(p1);
					sword_checkbox.setSelected(false);
				
				}
				if(gun_checkbox.isSelected()) {
					p1.setWeapon(new Gun());
					b1.changeWeapon(p1);
					gun_checkbox.setSelected(false);
				}
				if(fist_checkbox.isSelected()) {
					p1.setWeapon(new Fist());
					p1.getWeapon().setPower(p1.getPower());
					p1.getWeapon().setHp(p1.getHp());
					b1.changeWeapon(p1);
					fist_checkbox.setSelected(false);
				}
				dispose();
	
			}
		});
	}
}
