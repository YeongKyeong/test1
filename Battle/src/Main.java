import java.util.*;

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
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import Weapon.*;
import Player.*;
import View.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Player> list= new ArrayList<Player>();
		list.add(0, new Hulk());
		list.add(1, new Thor());
		list.add(2, new Spiderman());
		list.add(3, new DS());
		
		Player p1= new Player();
		Player p2= new Player();
		Player p3= new Player();
		Player p4= new Player();

		while(true) {

				p1=list.get((int)(Math.random()*10000)%list.size());
				p2=list.get((int)(Math.random()*10000)%list.size());		
				if(p1==p2) {
					continue;
				}
				else {
					list.remove(p1);
					list.remove(p2);
					break;
				}
		}
		p3=list.get(0);
		p4=list.get(1);
		
		Tournament tnm = new Tournament(p1, p2, p3, p4);
		Start start = new Start(p1, p2, p3, p4, tnm);
		start.setVisible(true);
		
		
	}
}
		
	


