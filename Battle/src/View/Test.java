package View;





import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.Box;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;

public class Test extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(488, 108, 1, 1);
		contentPane.add(verticalBox);
		
		JSlider slider = new JSlider();
		slider.setBounds(331, 145, 200, 26);
		contentPane.add(slider);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(82, 348, 189, 25);
		contentPane.add(splitPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setToolTipText("HEllO itS TEst");
		toolBar.setBounds(12, 10, 721, 26);
		contentPane.add(toolBar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(319, 251, 57, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(432, 251, 57, 58);
		contentPane.add(lblNewLabel_1);
		
		JLabel weapon = new JLabel("New label");
		weapon.setIcon(new ImageIcon("D:\\\uAD8C\uC601\uACBD\\2020 \uD559\uAD50\\\uAC1D\uC9C0\uD504\\\uACFC\uC81C#12\\\uADF8\uB9BC1.png"));
		weapon.setBounds(65, 449, 136, 186);
		contentPane.add(weapon);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
