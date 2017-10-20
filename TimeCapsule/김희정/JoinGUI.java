package 박경도;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;

public class JoinGUI {
	JScrollPane scrollPane;
	ImageIcon icon;
	ImageIcon back;
	ImageIcon email;
	ImageIcon pw;
	ImageIcon nic;
	ImageIcon btn;
	private JFrame frame;
	private JTextField txtHwanavercom;
	private JTextField nameInput;
	private JPasswordField pwInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinGUI window = new JoinGUI();
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
	public JoinGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		icon = new ImageIcon("../TimeCapsule/Image/1.png");
		back = new ImageIcon("../TimeCapsule/Image/back.jpg");
		email = new ImageIcon("../TimeCapsule/Image/email.png");
		pw = new ImageIcon("../TimeCapsule/Image/pw.png");
		nic = new ImageIcon("../TimeCapsule/Image/nic.png");
		btn = new ImageIcon("../TimeCapsule/Image/btn.png");

		frame = new JFrame();
		frame.setBounds(0, 0, 1920, 1040);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pn_all = new JPanel(){
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
				g.drawImage(back.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component
				 Dimension d = getSize();
				 g.drawImage(back.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		pn_all.setBackground(Color.WHITE);
		frame.getContentPane().add(pn_all, BorderLayout.CENTER);
		SpringLayout sl_pn_all = new SpringLayout();
		pn_all.setLayout(sl_pn_all);

		JPanel pn_bigbox = new JPanel();
		sl_pn_all.putConstraint(SpringLayout.NORTH, pn_bigbox, 80, SpringLayout.NORTH, pn_all);
		sl_pn_all.putConstraint(SpringLayout.WEST, pn_bigbox, 677, SpringLayout.WEST, pn_all);
		sl_pn_all.putConstraint(SpringLayout.SOUTH, pn_bigbox, -113, SpringLayout.SOUTH, pn_all);
		sl_pn_all.putConstraint(SpringLayout.EAST, pn_bigbox, -606, SpringLayout.EAST, pn_all);
		pn_bigbox.setBackground(new Color(255, 0, 0, 0));
		pn_bigbox.setOpaque(false);
		pn_bigbox.setLayout(null);
		

		TitledBorder oneTb = // 주변 테두리 색을 지정하기 위해 LineBorder사용
				new TitledBorder(new LineBorder(Color.black));
		oneTb.setTitleColor(Color.red); // 타이틀 컬러 지정
		
		
		pn_bigbox.setBorder(new LineBorder(SystemColor.activeCaptionBorder, 2));
		
	
		
		pn_all.add(pn_bigbox);
		
		JPanel pn_smallbox = new JPanel() {
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
				//g.drawImage(icon2.getImage(), -380,-35, null);
				// Approach 2: Scale image to size of component
				// Dimension d = getSize();
				// g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				//setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				//super.paintComponent(g);
			}
		};
		
		pn_smallbox.setLayout(null);
		pn_smallbox.setBorder(new LineBorder(SystemColor.activeCaptionBorder, 2));
		pn_smallbox.setBackground(new Color(255, 0, 0, 0));
		pn_smallbox.setOpaque(false);
		pn_smallbox.setBounds(34, 71, 559, 707);
		pn_bigbox.add(pn_smallbox);
		
		JLabel lbl_email = new JLabel(""){
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
				g.drawImage(email.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component
				// Dimension d = getSize();
				// g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		lbl_email.setBounds(141, 142, 81, 28);
		pn_smallbox.add(lbl_email);
		
		JLabel lbl_underbar1 = new JLabel("________________________");
		lbl_underbar1.setForeground(new Color(255, 106, 77));
		lbl_underbar1.setBounds(141, 199, 173, 15);
		pn_smallbox.add(lbl_underbar1);
		
		JLabel lbl_underbar2 = new JLabel("____________________");
		lbl_underbar2.setForeground(new Color(255, 106, 77));
		lbl_underbar2.setBounds(287, 199, 160, 15);
		pn_smallbox.add(lbl_underbar2);
		
		txtHwanavercom = new JTextField();
		txtHwanavercom.setBackground(Color.WHITE);
		txtHwanavercom.setToolTipText("");
		txtHwanavercom.setText("hwa7444@naver.com");
		txtHwanavercom.setBounds(141, 180, 269, 21);
		txtHwanavercom.setDocument((new JTextFieldLimit(30)));
		txtHwanavercom.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//		txtHwanavercom.setBackground(new Color(0,0,0,0));
		pn_smallbox.add(txtHwanavercom);
		txtHwanavercom.setColumns(10);
		txtHwanavercom.setOpaque(false);
		
		JLabel lbl_underbar3 = new JLabel("________________________");
		lbl_underbar3.setForeground(new Color(255, 106, 77));
		lbl_underbar3.setBounds(141, 303, 173, 15);
		pn_smallbox.add(lbl_underbar3);
		
		JLabel label_3 = new JLabel(""){
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
				g.drawImage(pw.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component
				// Dimension d = getSize();
				// g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		label_3.setBounds(141, 246, 81, 28);
		pn_smallbox.add(label_3);
		
		JLabel lbl_underbar4 = new JLabel("____________________");
		lbl_underbar4.setForeground(new Color(255, 106, 77));
		lbl_underbar4.setBounds(287, 303, 160, 15);
		pn_smallbox.add(lbl_underbar4);
		
		JLabel lbl_underbar5 = new JLabel("________________________");
		lbl_underbar5.setForeground(new Color(255, 106, 77));
		lbl_underbar5.setBounds(141, 412, 173, 15);
		pn_smallbox.add(lbl_underbar5);
		
		nameInput = new JTextField();
		nameInput.setToolTipText("");
		nameInput.setText("\uD2B9\uC218\uBB38\uC790 \uC81C\uC678 8 ~ 12\uC790\uB9AC");
		nameInput.setColumns(10);
		nameInput.setBackground(Color.WHITE);
		nameInput.setBounds(141, 393, 173, 21);
		nameInput.setDocument((new JTextFieldLimit(12)));
		nameInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		nameInput.setBackground(new Color(0,0,0,0));
		nameInput.setOpaque(false);
		pn_smallbox.add(nameInput);
		
		JLabel label_6 = new JLabel(""){
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
				g.drawImage(nic.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component
				// Dimension d = getSize();
				// g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		label_6.setBounds(141, 355, 81, 28);
		pn_smallbox.add(label_6);
		
		JLabel lbl_underbar6 = new JLabel("____________________");
		lbl_underbar6.setForeground(new Color(255, 106, 77));
		lbl_underbar6.setBounds(287, 412, 160, 15);
		pn_smallbox.add(lbl_underbar6);
		
		pwInput = new JPasswordField(); //비밀번호 입력창
		pwInput.setText("rudeh376");
		pwInput.setBounds(143, 332, 173, 21);
		pwInput.setDocument((new JTextFieldLimit(12)));
		pwInput.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		pwInput.setBackground(new Color(0,0,0,0));
		pwInput.setOpaque(false);

		pn_smallbox.add(pwInput);
		
		JPanel panel = new JPanel(){
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
//				g.drawImage(btn.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component
				 Dimension d = getSize();
				 g.drawImage(btn.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		panel.setBounds(173, 486, 205, 35);
		pn_smallbox.add(panel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(btnNewButton);
		
		JPanel pn_logo = new JPanel(){
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
				g.drawImage(icon.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component
				// Dimension d = getSize();
				// g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		pn_logo.setBounds(31, 23, 145, 38);
		pn_bigbox.add(pn_logo);
	}
}
