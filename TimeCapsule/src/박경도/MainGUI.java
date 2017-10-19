package �ڰ浵;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

public class MainGUI {
	JScrollPane scrollPane;
	ImageIcon icon;
	ImageIcon icon2;
	ImageIcon Mainicon;
	private JFrame frame;
	private JTextField txtHwanavercom;
	private JPasswordField pwdSss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
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
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Mainicon = new ImageIcon("D:\\\\�ڰ浵\\\\���.jpg");
		icon = new ImageIcon("D:\\\\�ڰ浵\\\\1.png");
		icon2 = new ImageIcon("D:\\\\�ڰ浵\\\\2.png");
		frame = new JFrame();
		frame.setBounds(0, 0, 1920, 1040);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
				g.drawImage(Mainicon.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component
				 Dimension d = getSize();
				 g.drawImage(Mainicon.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false); // �׸��� ǥ���ϰ� ����,�����ϰ� ����
				super.paintComponent(g);
			}
		};
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel lbl_login = new JLabel("IN");
		panel.add(lbl_login);

		JLabel lbl_sign = new JLabel("JOIN");
		sl_panel.putConstraint(SpringLayout.NORTH, lbl_sign, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lbl_sign, 1445, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lbl_login, 0, SpringLayout.NORTH, lbl_sign);
		sl_panel.putConstraint(SpringLayout.EAST, lbl_login, -53, SpringLayout.WEST, lbl_sign);
		panel.add(lbl_sign);
		
		txtHwanavercom = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, txtHwanavercom, -5, SpringLayout.NORTH, lbl_login);
		sl_panel.putConstraint(SpringLayout.WEST, txtHwanavercom, 1037, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtHwanavercom, 32, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, txtHwanavercom, -184, SpringLayout.WEST, lbl_login);
		txtHwanavercom.setText("hwa7444@naver.com");
		txtHwanavercom.setOpaque(false);
		panel.add(txtHwanavercom);
		txtHwanavercom.setColumns(10);
		txtHwanavercom.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.LIGHT_GRAY));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		sl_panel.putConstraint(SpringLayout.NORTH, panel_1, 60, SpringLayout.SOUTH, txtHwanavercom);
		sl_panel.putConstraint(SpringLayout.WEST, panel_1, 677, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_1, 734, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_1, -606, SpringLayout.EAST, panel);
		panel.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		panel_1.setOpaque(false);
		
		JPanel pn_img1 = new JPanel() {
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
				g.drawImage(icon.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component
				// Dimension d = getSize();
				// g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false); // �׸��� ǥ���ϰ� ����,�����ϰ� ����
				super.paintComponent(g);
			}
		};
		sl_panel_1.putConstraint(SpringLayout.NORTH, pn_img1, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, pn_img1, 247, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, pn_img1, -263, SpringLayout.EAST, panel_1);
		sl_panel.putConstraint(SpringLayout.NORTH, pn_img1, 90, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, pn_img1, 116, SpringLayout.EAST, panel_1);
		sl_panel.putConstraint(SpringLayout.EAST, pn_img1, -970, SpringLayout.EAST, panel);
		panel_1.add(pn_img1);
		
		JLabel lbl_main = new JLabel("T I M E");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lbl_main, 79, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, pn_img1, -6, SpringLayout.NORTH, lbl_main);
		sl_panel_1.putConstraint(SpringLayout.WEST, lbl_main, 204, SpringLayout.WEST, panel_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, pn_img1, -52, SpringLayout.NORTH, lbl_main);
		sl_panel.putConstraint(SpringLayout.NORTH, lbl_main, 231, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lbl_main, 755, SpringLayout.WEST, panel);
		panel_1.add(lbl_main);
		lbl_main.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_main.setFont(new Font("����", Font.PLAIN, 60));
		
		JLabel lblCAP = new JLabel("C A P S U L E");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblCAP, 6, SpringLayout.SOUTH, lbl_main);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblCAP, 107, SpringLayout.WEST, panel_1);
		sl_panel.putConstraint(SpringLayout.NORTH, lblCAP, 17, SpringLayout.SOUTH, lbl_main);
		sl_panel.putConstraint(SpringLayout.WEST, lblCAP, 660, SpringLayout.WEST, panel);
		panel_1.add(lblCAP);
		lblCAP.setHorizontalAlignment(SwingConstants.CENTER);
		lblCAP.setFont(new Font("����", Font.PLAIN, 60));
		
		JPanel pn_img2 = new JPanel() {
			public void paintComponent(Graphics g) {
				
				// Approach 1: Dispaly image at at full size
				g.drawImage(icon2.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component
				// Dimension d = getSize();
				// g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false); // �׸��� ǥ���ϰ� ����,�����ϰ� ����
				super.paintComponent(g);
			}
		};
		sl_panel_1.putConstraint(SpringLayout.NORTH, pn_img2, 284, SpringLayout.SOUTH, lblCAP);
		sl_panel_1.putConstraint(SpringLayout.WEST, pn_img2, 261, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, pn_img2, -42, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, pn_img2, 0, SpringLayout.EAST, pn_img1);
		sl_panel.putConstraint(SpringLayout.NORTH, pn_img2, 41, SpringLayout.SOUTH, lblCAP);
		sl_panel.putConstraint(SpringLayout.WEST, pn_img2, 123, SpringLayout.EAST, panel_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, pn_img2, -486, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, pn_img2, -995, SpringLayout.EAST, panel);
		panel_1.add(pn_img2);
		
		pwdSss = new JPasswordField();
		pwdSss.setText("sss");
		sl_panel.putConstraint(SpringLayout.NORTH, pwdSss, 5, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, pwdSss, 6, SpringLayout.EAST, txtHwanavercom);
		sl_panel.putConstraint(SpringLayout.SOUTH, pwdSss, 32, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, pwdSss, 147, SpringLayout.EAST, txtHwanavercom);
		panel.add(pwdSss);
		pwdSss.setOpaque(false);
		pwdSss.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.LIGHT_GRAY));

	}
}
