package 박경도;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class BoardMainGUI {
	JScrollPane scrollPane;
	private ImageIcon icon;
	private ImageIcon icon2;
	private JFrame frame;
	private ImageIcon icon3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardMainGUI window = new BoardMainGUI();
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
	public BoardMainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		icon = new ImageIcon("D:\\박경도\\배경.jpg");
		icon2 = new ImageIcon("D:\\박경도\\1.jpg");
		icon3 = new ImageIcon("D:\\박경도\\2.png");
		frame = new JFrame();
		frame.setBounds(0, 0, 1920, 1040);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel_big = new JPanel() {
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
				g.drawImage(icon.getImage(), 0, 0, null);
				// Approach 2: Scale image to size of component

				Dimension d = getSize();
				g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
				// Approach 3: Fix the image position in the scroll pane
				// Point p = scrollPane.getViewport().getViewPosition();
				// g.drawImage(icon.getImage(), p.x, p.y, null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		panel_big.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_big, BorderLayout.CENTER);
		SpringLayout sl_panel_big = new SpringLayout();
		panel_big.setLayout(sl_panel_big);

		JLabel lbl_log_id = new JLabel("__________");
		panel_big.add(lbl_log_id);

		JLabel lbl_login = new JLabel("\uB2D8");
		sl_panel_big.putConstraint(SpringLayout.NORTH, lbl_login, 10, SpringLayout.NORTH, panel_big);
		sl_panel_big.putConstraint(SpringLayout.NORTH, lbl_log_id, 0, SpringLayout.NORTH, lbl_login);
		sl_panel_big.putConstraint(SpringLayout.EAST, lbl_log_id, -13, SpringLayout.WEST, lbl_login);
		panel_big.add(lbl_login);

		JLabel lbl_sign = new JLabel("log out");
		sl_panel_big.putConstraint(SpringLayout.EAST, lbl_login, -45, SpringLayout.WEST, lbl_sign);
		sl_panel_big.putConstraint(SpringLayout.NORTH, lbl_sign, 10, SpringLayout.NORTH, panel_big);
		sl_panel_big.putConstraint(SpringLayout.EAST, lbl_sign, -35, SpringLayout.EAST, panel_big);
		panel_big.add(lbl_sign);

		JPanel pn_img1 = new JPanel() {
			public void paintComponent(Graphics g) {
				// Approach 1: Dispaly image at at full size
				g.drawImage(icon2.getImage(), 0, 0, null);
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
		sl_panel_big.putConstraint(SpringLayout.NORTH, pn_img1, 28, SpringLayout.NORTH, panel_big);
		sl_panel_big.putConstraint(SpringLayout.WEST, pn_img1, 10, SpringLayout.WEST, panel_big);
		sl_panel_big.putConstraint(SpringLayout.SOUTH, pn_img1, -867, SpringLayout.SOUTH, panel_big);
		sl_panel_big.putConstraint(SpringLayout.EAST, pn_img1, -1759, SpringLayout.EAST, panel_big);
		panel_big.add(pn_img1);

		JPanel pn_img2 = new JPanel() {
			public void paintComponent(Graphics g) {

				// Approach 1: Dispaly image at at full size
				g.drawImage(icon3.getImage(), 0, 0, null);

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

		sl_panel_big.putConstraint(SpringLayout.NORTH, pn_img2, 813, SpringLayout.NORTH, panel_big);
		sl_panel_big.putConstraint(SpringLayout.WEST, pn_img2, 0, SpringLayout.WEST, lbl_login);
		sl_panel_big.putConstraint(SpringLayout.SOUTH, pn_img2, -82, SpringLayout.SOUTH, panel_big);
		sl_panel_big.putConstraint(SpringLayout.EAST, pn_img2, -40, SpringLayout.EAST, panel_big);
		panel_big.add(pn_img2);

		JPanel pn_boardList = new JPanel();
		sl_panel_big.putConstraint(SpringLayout.NORTH, pn_boardList, 0, SpringLayout.NORTH, pn_img1);
		sl_panel_big.putConstraint(SpringLayout.WEST, pn_boardList, 271, SpringLayout.EAST, pn_img1);
		sl_panel_big.putConstraint(SpringLayout.SOUTH, pn_boardList, -10, SpringLayout.SOUTH, panel_big);
		sl_panel_big.putConstraint(SpringLayout.EAST, pn_boardList, 1197, SpringLayout.EAST, pn_img1);
		pn_boardList.setBackground(new Color(0, 0, 0, 1));
		panel_big.add(pn_boardList);
		SpringLayout sl_pn_boardList = new SpringLayout();
		pn_boardList.setLayout(sl_pn_boardList);
		pn_boardList.setOpaque(false);

		JPanel pn_board1 = new JPanel();
		sl_pn_boardList.putConstraint(SpringLayout.WEST, pn_board1, 0, SpringLayout.WEST, pn_boardList);
		sl_pn_boardList.putConstraint(SpringLayout.EAST, pn_board1, 0, SpringLayout.EAST, pn_boardList);
		pn_board1.setBackground(new Color(0, 0, 0, 0.05f));
		pn_board1.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(192, 192, 192)));
		sl_pn_boardList.putConstraint(SpringLayout.NORTH, pn_board1, 10, SpringLayout.NORTH, pn_boardList);
		sl_pn_boardList.putConstraint(SpringLayout.SOUTH, pn_board1, 310, SpringLayout.NORTH, pn_boardList);
		pn_boardList.add(pn_board1);

		JPanel pn_board2 = new JPanel();
		sl_pn_boardList.putConstraint(SpringLayout.NORTH, pn_board2, 22, SpringLayout.SOUTH, pn_board1);
		sl_pn_boardList.putConstraint(SpringLayout.WEST, pn_board2, 0, SpringLayout.WEST, pn_board1);
		sl_pn_boardList.putConstraint(SpringLayout.EAST, pn_board2, 0, SpringLayout.EAST, pn_board1);

		pn_board2.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(192, 192, 192)));
		SpringLayout sl_pn_board1 = new SpringLayout();
		pn_board1.setLayout(sl_pn_board1);
		pn_boardList.add(pn_board2);
		pn_board2.setBackground(Color.WHITE);
		pn_board2.setBackground(new Color(0, 0, 0, 0.05f));

		JPanel pn_board3 = new JPanel();
		sl_pn_boardList.putConstraint(SpringLayout.SOUTH, pn_board2, -22, SpringLayout.NORTH, pn_board3);
		SpringLayout sl_pn_board2 = new SpringLayout();
		pn_board2.setLayout(sl_pn_board2);
		
		JLabel lbl_board2_1 = new JLabel("\uC2A4\uB9C8\uD2B8\uBBF8\uB514\uC5B4\uC778\uC7AC\uAC1C\uBC1C\uC6D0");
		sl_pn_board2.putConstraint(SpringLayout.NORTH, lbl_board2_1, 43, SpringLayout.NORTH, pn_board2);
		sl_pn_board2.putConstraint(SpringLayout.WEST, lbl_board2_1, 10, SpringLayout.WEST, pn_board2);
		lbl_board2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_board2_1.setFont(new Font("굴림", Font.PLAIN, 30));
		pn_board2.add(lbl_board2_1);
		
		JLabel lbl_board2_2 = new JLabel("\uC5F4\uB9AC\uB294 \uC2DC\uAC04");
		sl_pn_board2.putConstraint(SpringLayout.WEST, lbl_board2_2, 10, SpringLayout.WEST, pn_board2);
		sl_pn_board2.putConstraint(SpringLayout.EAST, lbl_board2_2, -10, SpringLayout.EAST, pn_board2);
		sl_pn_board2.putConstraint(SpringLayout.EAST, lbl_board2_1, 0, SpringLayout.EAST, lbl_board2_2);
		lbl_board2_2.setHorizontalAlignment(SwingConstants.CENTER);
		pn_board2.add(lbl_board2_2);
		//myLabel.setText("<html><body>with<br>linebreak</body></html>");
		JLabel lbl_board2_3 = new JLabel("hi");
		sl_pn_board2.putConstraint(SpringLayout.NORTH, lbl_board2_3, 10, SpringLayout.SOUTH, lbl_board2_1);
		sl_pn_board2.putConstraint(SpringLayout.WEST, lbl_board2_3, 10, SpringLayout.WEST, pn_board2);
		sl_pn_board2.putConstraint(SpringLayout.SOUTH, lbl_board2_3, -138, SpringLayout.SOUTH, pn_board2);
		sl_pn_board2.putConstraint(SpringLayout.EAST, lbl_board2_3, -10, SpringLayout.EAST, pn_board2);
		sl_pn_board2.putConstraint(SpringLayout.NORTH, lbl_board2_2, 31, SpringLayout.SOUTH, lbl_board2_3);
		lbl_board2_3.setHorizontalAlignment(SwingConstants.CENTER);
		pn_board2.add(lbl_board2_3);
		sl_pn_boardList.putConstraint(SpringLayout.EAST, pn_board3, 0, SpringLayout.EAST, pn_board1);
		sl_pn_boardList.putConstraint(SpringLayout.WEST, pn_board3, 0, SpringLayout.WEST, pn_board1);
		lbl_board2_3.setText("<html><body align='center'>지금은 아홉시 집 가는 시간도 아홉시<br>집 갈 땐 버스</body></html>");
		
		

		JLabel lbl_board1_1 = new JLabel("\uC2A4\uB9C8\uD2B8\uBBF8\uB514\uC5B4\uC778\uC7AC\uAC1C\uBC1C\uC6D0");
		sl_pn_board1.putConstraint(SpringLayout.NORTH, lbl_board1_1, 43, SpringLayout.NORTH, pn_board1);
		sl_pn_board1.putConstraint(SpringLayout.WEST, lbl_board1_1, 10, SpringLayout.WEST, pn_board1);
		sl_pn_board1.putConstraint(SpringLayout.EAST, lbl_board1_1, -10, SpringLayout.EAST, pn_board1);
		lbl_board1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_board1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		pn_board1.add(lbl_board1_1);
		
		JPanel pn_time = new JPanel();
		sl_pn_board1.putConstraint(SpringLayout.SOUTH, lbl_board1_1, -14, SpringLayout.NORTH, pn_time);
		sl_pn_board1.putConstraint(SpringLayout.NORTH, pn_time, 89, SpringLayout.NORTH, pn_board1);
		sl_pn_board1.putConstraint(SpringLayout.WEST, pn_time, 300, SpringLayout.WEST, pn_board1);
		sl_pn_board1.putConstraint(SpringLayout.EAST, pn_time, -300, SpringLayout.EAST, pn_board1);
		pn_board1.add(pn_time);
		pn_time.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lbl_time = new JLabel("18:27:00'");
		lbl_time.setFont(new Font("굴림", Font.PLAIN, 30));
		lbl_time.setHorizontalAlignment(SwingConstants.CENTER);
		pn_time.add(lbl_time);
		pn_board3.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(192, 192, 192)));
		sl_pn_boardList.putConstraint(SpringLayout.NORTH, pn_board3, 654, SpringLayout.NORTH, pn_boardList);
		sl_pn_boardList.putConstraint(SpringLayout.SOUTH, pn_board3, -10, SpringLayout.SOUTH, pn_boardList);
		pn_boardList.add(pn_board3);
		pn_board3.setBackground(Color.WHITE);
		pn_board3.setBackground(new Color(0, 0, 0, 0.05f));
		SpringLayout sl_pn_board3 = new SpringLayout();
		pn_board3.setLayout(sl_pn_board3);
		
		JLabel lbl_board3_1 = new JLabel("\uC2A4\uB9C8\uD2B8\uBBF8\uB514\uC5B4\uC778\uC7AC\uAC1C\uBC1C\uC6D0");
		sl_pn_board3.putConstraint(SpringLayout.EAST, lbl_board3_1, -10, SpringLayout.EAST, pn_board3);
		lbl_board3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_board3_1.setFont(new Font("굴림", Font.PLAIN, 30));
		pn_board3.add(lbl_board3_1);
		
		JLabel lbl_board3_2 = new JLabel("\uC5F4\uB9AC\uB294 \uC2DC\uAC04");
		sl_pn_board3.putConstraint(SpringLayout.WEST, lbl_board3_1, 0, SpringLayout.WEST, lbl_board3_2);
		sl_pn_board3.putConstraint(SpringLayout.SOUTH, lbl_board3_1, -125, SpringLayout.NORTH, lbl_board3_2);
		sl_pn_board3.putConstraint(SpringLayout.WEST, lbl_board3_2, 10, SpringLayout.WEST, pn_board3);
		sl_pn_board3.putConstraint(SpringLayout.EAST, lbl_board3_2, -10, SpringLayout.EAST, pn_board3);
		sl_pn_board3.putConstraint(SpringLayout.SOUTH, lbl_board3_2, -71, SpringLayout.SOUTH, pn_board3);
		lbl_board3_2.setHorizontalAlignment(SwingConstants.CENTER);
		pn_board3.add(lbl_board3_2);
		
		JPanel pn_blind = new JPanel();
		sl_pn_board3.putConstraint(SpringLayout.NORTH, pn_blind, 11, SpringLayout.SOUTH, lbl_board3_1);
		sl_pn_board3.putConstraint(SpringLayout.WEST, pn_blind, -624, SpringLayout.EAST, pn_board3);
		sl_pn_board3.putConstraint(SpringLayout.SOUTH, pn_blind, 91, SpringLayout.SOUTH, lbl_board3_1);
		sl_pn_board3.putConstraint(SpringLayout.EAST, pn_blind, -298, SpringLayout.EAST, pn_board3);
		pn_board3.add(pn_blind);
		pn_blind.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblBlind = new JLabel("BLIND");
		lblBlind.setOpaque(true);
		lblBlind.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlind.setFont(new Font("굴림", Font.PLAIN, 30));
		lblBlind.setBackground(Color.WHITE);
		pn_blind.add(lblBlind);
		lbl_time.setOpaque(true);
		lbl_time.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("\uC5F4\uB9AC\uB294 \uC2DC\uAC04");
		sl_pn_board1.putConstraint(SpringLayout.SOUTH, pn_time, -25, SpringLayout.NORTH, lblNewLabel);
		sl_pn_board1.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, pn_board1);
		sl_pn_board1.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lbl_board1_1);
		sl_pn_board1.putConstraint(SpringLayout.SOUTH, lblNewLabel, -76, SpringLayout.SOUTH, pn_board1);
		sl_pn_board1.putConstraint(SpringLayout.NORTH, lblNewLabel, 194, SpringLayout.NORTH, pn_board1);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pn_board1.add(lblNewLabel);
		
	}
}