

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
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MainGUI {
   JScrollPane scrollPane;
   ImageIcon icon;
   ImageIcon icon2;
   ImageIcon Mainicon;
   private JFrame frame;
   private JTextField textField;
   private JTextField txt_hour;
   private JTextField txt_minute;
   private JTextField txt_title;
   private JTextField txt_content;

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
      Mainicon = new ImageIcon("C:\\Users\\pc-05\\Desktop\\김희정\\배경.jpg");
      icon = new ImageIcon("C:\\Users\\pc-05\\Desktop\\김희정\\1.png");
      icon2 = new ImageIcon("C:\\Users\\pc-05\\Desktop\\김희정\\icon1.png");
      frame = new JFrame();
      frame.setBounds(100, 100, 1082, 566);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel panel_big = new JPanel() {
         public void paintComponent(Graphics g) {
            // Approach 1: Dispaly image at at full size
            g.drawImage(Mainicon.getImage(), 0, 0, null);
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
      
      JPanel pn_logo = new JPanel() {
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
      sl_panel_big.putConstraint(SpringLayout.NORTH, pn_logo, 28, SpringLayout.NORTH, panel_big);
      sl_panel_big.putConstraint(SpringLayout.WEST, pn_logo, 10, SpringLayout.WEST, panel_big);
      sl_panel_big.putConstraint(SpringLayout.SOUTH, pn_logo, -467, SpringLayout.SOUTH, panel_big);
      sl_panel_big.putConstraint(SpringLayout.EAST, pn_logo, -939, SpringLayout.EAST, panel_big);
      panel_big.add(pn_logo);


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
             setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
             super.paintComponent(g);
          }
       };
      sl_panel_big.putConstraint(SpringLayout.NORTH, pn_img2, 428, SpringLayout.NORTH, panel_big);
      sl_panel_big.putConstraint(SpringLayout.WEST, pn_img2, 94, SpringLayout.WEST, lbl_log_id);
      sl_panel_big.putConstraint(SpringLayout.EAST, pn_img2, 0, SpringLayout.EAST, lbl_sign);
       panel_big.add(pn_img2);
       
       JPanel panel = new JPanel();
       sl_panel_big.putConstraint(SpringLayout.WEST, panel, 237, SpringLayout.WEST, panel_big);
       sl_panel_big.putConstraint(SpringLayout.EAST, panel, -116, SpringLayout.WEST, pn_img2);
       sl_panel_big.putConstraint(SpringLayout.SOUTH, pn_img2, 0, SpringLayout.SOUTH, panel);
       sl_panel_big.putConstraint(SpringLayout.NORTH, panel, 89, SpringLayout.NORTH, panel_big);
       sl_panel_big.putConstraint(SpringLayout.SOUTH, panel, -31, SpringLayout.SOUTH, panel_big);
       panel.setBackground(new Color(255,0,0,0));
       panel_big.add(panel);
       SpringLayout sl_panel = new SpringLayout();
       panel.setLayout(sl_panel);
       
       textField = new JTextField();
       panel.add(textField);
       textField.setColumns(10);
       
       JLabel lbl_period = new JLabel("period");
       sl_panel.putConstraint(SpringLayout.WEST, lbl_period, 77, SpringLayout.WEST, panel);
       panel.add(lbl_period);
       
       txt_hour = new JTextField();
       txt_hour.setHorizontalAlignment(SwingConstants.CENTER);
       txt_hour.setText("hour");
       sl_panel.putConstraint(SpringLayout.WEST, txt_hour, 6, SpringLayout.EAST, textField);
       sl_panel.putConstraint(SpringLayout.SOUTH, txt_hour, 0, SpringLayout.SOUTH, textField);
       txt_hour.setColumns(10);
       panel.add(txt_hour);
       
       txt_minute = new JTextField();
       sl_panel.putConstraint(SpringLayout.NORTH, txt_minute, 0, SpringLayout.NORTH, textField);
       txt_minute.setText("minute");
       txt_minute.setHorizontalAlignment(SwingConstants.CENTER);
       sl_panel.putConstraint(SpringLayout.WEST, txt_minute, 6, SpringLayout.EAST, txt_hour);
       txt_minute.setColumns(10);
       panel.add(txt_minute);
       
       JLabel lbl_title = new JLabel("title");
       sl_panel.putConstraint(SpringLayout.NORTH, lbl_title, 15, SpringLayout.SOUTH, lbl_period);
       sl_panel.putConstraint(SpringLayout.WEST, lbl_title, 0, SpringLayout.WEST, lbl_period);
       lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
       panel.add(lbl_title);
       
       txt_title = new JTextField();
       sl_panel.putConstraint(SpringLayout.NORTH, txt_title, 9, SpringLayout.SOUTH, textField);
       sl_panel.putConstraint(SpringLayout.EAST, txt_title, 0, SpringLayout.EAST, txt_minute);
       txt_title.setHorizontalAlignment(SwingConstants.CENTER);
       txt_title.setText("title");
       sl_panel.putConstraint(SpringLayout.WEST, txt_title, 0, SpringLayout.WEST, textField);
       txt_title.setColumns(10);
       panel.add(txt_title);
       
       JLabel lbl_content = new JLabel("content");
       sl_panel.putConstraint(SpringLayout.NORTH, lbl_content, 14, SpringLayout.SOUTH, lbl_title);
       sl_panel.putConstraint(SpringLayout.WEST, lbl_content, 77, SpringLayout.WEST, panel);
       sl_panel.putConstraint(SpringLayout.WEST, textField, 17, SpringLayout.EAST, lbl_content);
       lbl_content.setHorizontalAlignment(SwingConstants.CENTER);
       panel.add(lbl_content);
       
       txt_content = new JTextField();
       sl_panel.putConstraint(SpringLayout.NORTH, txt_content, 10, SpringLayout.SOUTH, txt_title);
       sl_panel.putConstraint(SpringLayout.EAST, txt_content, 0, SpringLayout.EAST, txt_minute);
       txt_content.setText("content");
       txt_content.setHorizontalAlignment(SwingConstants.CENTER);
       sl_panel.putConstraint(SpringLayout.WEST, txt_content, 0, SpringLayout.WEST, textField);
       txt_content.setColumns(10);
       panel.add(txt_content);
       
       JButton btnNewButton = new JButton("New button");
       sl_panel.putConstraint(SpringLayout.SOUTH, txt_content, -50, SpringLayout.NORTH, btnNewButton);
       sl_panel.putConstraint(SpringLayout.SOUTH, txt_minute, -190, SpringLayout.NORTH, btnNewButton);
       sl_panel.putConstraint(SpringLayout.SOUTH, textField, -190, SpringLayout.NORTH, btnNewButton);
       sl_panel.putConstraint(SpringLayout.SOUTH, txt_title, -160, SpringLayout.NORTH, btnNewButton);
       sl_panel.putConstraint(SpringLayout.SOUTH, lbl_content, -133, SpringLayout.NORTH, btnNewButton);
       sl_panel.putConstraint(SpringLayout.SOUTH, lbl_period, -192, SpringLayout.NORTH, btnNewButton);
       sl_panel.putConstraint(SpringLayout.SOUTH, lbl_title, -162, SpringLayout.NORTH, btnNewButton);
       sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 306, SpringLayout.NORTH, panel);
       sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -248, SpringLayout.EAST, panel);
       panel.add(btnNewButton);

      
      
      
   }
}