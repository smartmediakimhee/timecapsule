

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
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.CardLayout;
import com.toedter.calendar.JCalendar;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class borderGUI {
   JScrollPane scrollPane;
   ImageIcon icon;
   ImageIcon icon2;
   ImageIcon period;
   ImageIcon title;
   ImageIcon content;
   ImageIcon bnt;
   
   ImageIcon back;
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
               borderGUI window = new borderGUI();
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
   public borderGUI() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      back = new ImageIcon("../TimeCapsule/Image/back.jpg");
      icon = new ImageIcon("../TimeCapsule/Image/1.png");
      icon2 = new ImageIcon("../TimeCapsule/Image/2.png");
      period = new ImageIcon("../TimeCapsule/Image/period.png");
      title = new ImageIcon("../TimeCapsule/Image/title.png");
      content = new ImageIcon("../TimeCapsule/Image/content.png");
      bnt = new ImageIcon("../TimeCapsule/Image/bnt.png");
      frame = new JFrame();
      frame.setBounds(0, 0, 1920, 1040);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel panel_big = new JPanel() {
         public void paintComponent(Graphics g) {
            // Approach 1: Dispaly image at at full size
            g.drawImage(back.getImage(), 0, 0,  null);
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


      JPanel pn_underimg = new JPanel() {
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
      sl_panel_big.putConstraint(SpringLayout.NORTH, pn_underimg, 816, SpringLayout.SOUTH, lbl_sign);
      sl_panel_big.putConstraint(SpringLayout.WEST, pn_underimg, 17, SpringLayout.WEST, lbl_log_id);
      sl_panel_big.putConstraint(SpringLayout.SOUTH, pn_underimg, -31, SpringLayout.SOUTH, panel_big);
      sl_panel_big.putConstraint(SpringLayout.EAST, pn_underimg, 0, SpringLayout.EAST, lbl_sign);
       panel_big.add(pn_underimg);
       
       JPanel pn_small = new JPanel();
       sl_panel_big.putConstraint(SpringLayout.SOUTH, pn_small, -31, SpringLayout.SOUTH, panel_big);
       sl_panel_big.putConstraint(SpringLayout.EAST, pn_small, -54, SpringLayout.WEST, pn_underimg);
       pn_small.setBackground(new Color(255,0,0,0));
       panel_big.add(pn_small);
       SpringLayout sl_pn_small = new SpringLayout();
       pn_small.setLayout(sl_pn_small);
       
       textField = new JTextField();
       pn_small.add(textField);
       textField.setColumns(10);

       
       txt_hour = new JTextField();
       sl_pn_small.putConstraint(SpringLayout.EAST, textField, -6, SpringLayout.WEST, txt_hour);
       sl_pn_small.putConstraint(SpringLayout.NORTH, txt_hour, 269, SpringLayout.NORTH, pn_small);
       sl_pn_small.putConstraint(SpringLayout.WEST, txt_hour, 822, SpringLayout.WEST, pn_small);
       txt_hour.setHorizontalAlignment(SwingConstants.CENTER);
       txt_hour.setText("hour" );
       txt_hour.setColumns(10);
       pn_small.add(txt_hour);
       
       txt_minute = new JTextField();
       sl_pn_small.putConstraint(SpringLayout.NORTH, txt_minute, 269, SpringLayout.NORTH, pn_small);
       sl_pn_small.putConstraint(SpringLayout.EAST, txt_hour, -8, SpringLayout.WEST, txt_minute);
       sl_pn_small.putConstraint(SpringLayout.WEST, txt_minute, 968, SpringLayout.WEST, pn_small);
       sl_pn_small.putConstraint(SpringLayout.EAST, txt_minute, -277, SpringLayout.EAST, pn_small);
       txt_minute.setText("minute");
       txt_minute.setHorizontalAlignment(SwingConstants.CENTER);
       txt_minute.setColumns(10);
       pn_small.add(txt_minute);
       
       txt_title = new JTextField();
       sl_pn_small.putConstraint(SpringLayout.SOUTH, textField, -12, SpringLayout.NORTH, txt_title);
       sl_pn_small.putConstraint(SpringLayout.WEST, txt_title, 385, SpringLayout.WEST, pn_small);
       sl_pn_small.putConstraint(SpringLayout.EAST, txt_title, -277, SpringLayout.EAST, pn_small);
       sl_pn_small.putConstraint(SpringLayout.SOUTH, txt_minute, -15, SpringLayout.NORTH, txt_title);
       sl_pn_small.putConstraint(SpringLayout.SOUTH, txt_hour, -13, SpringLayout.NORTH, txt_title);
       sl_pn_small.putConstraint(SpringLayout.NORTH, txt_title, 315, SpringLayout.NORTH, pn_small);
       txt_title.setHorizontalAlignment(SwingConstants.CENTER);
       txt_title.setText("title");
       txt_title.setColumns(10);
       pn_small.add(txt_title);
       
       txt_content = new JTextField();
       sl_pn_small.putConstraint(SpringLayout.EAST, txt_content, -277, SpringLayout.EAST, pn_small);
       sl_pn_small.putConstraint(SpringLayout.SOUTH, txt_title, -15, SpringLayout.NORTH, txt_content);
       sl_pn_small.putConstraint(SpringLayout.NORTH, txt_content, 361, SpringLayout.NORTH, pn_small);
       sl_pn_small.putConstraint(SpringLayout.SOUTH, txt_content, -289, SpringLayout.SOUTH, pn_small);
       txt_content.setText("content");
       txt_content.setHorizontalAlignment(SwingConstants.CENTER);
       txt_content.setColumns(10);
       pn_small.add(txt_content);
       
       JPanel panel_calendar = new JPanel();
       sl_pn_small.putConstraint(SpringLayout.NORTH, panel_calendar, 96, SpringLayout.NORTH, pn_small);
       sl_pn_small.putConstraint(SpringLayout.WEST, panel_calendar, 493, SpringLayout.WEST, pn_small);
       sl_pn_small.putConstraint(SpringLayout.EAST, panel_calendar, 691, SpringLayout.WEST, pn_small);
       pn_small.add(panel_calendar);
       panel_calendar.setLayout(new CardLayout(0, 0));
       
       JCalendar calendar = new JCalendar();
       panel_calendar.add(calendar, "name_8592003866036");
       
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
       sl_panel_big.putConstraint(SpringLayout.WEST, pn_logo, 69, SpringLayout.WEST, panel_big);
       sl_panel_big.putConstraint(SpringLayout.EAST, pn_logo, -1629, SpringLayout.EAST, panel_big);
       sl_panel_big.putConstraint(SpringLayout.NORTH, pn_small, 0, SpringLayout.NORTH, pn_logo);
       sl_panel_big.putConstraint(SpringLayout.WEST, pn_small, 6, SpringLayout.EAST, pn_logo);
       
       JPanel panel_period = new JPanel(){
           public void paintComponent(Graphics g) {
               // Approach 1: Dispaly image at at full size
               g.drawImage(period.getImage(), 0, 0, null);
               // Approach 2: Scale image to size of component
               
//                Dimension d = getSize();
//                g.drawImage(font.getImage(), 0, 0, d.width, d.height, null);
               // Approach 3: Fix the image position in the scroll pane
               // Point p = scrollPane.getViewport().getViewPosition();
               // g.drawImage(icon.getImage(), p.x, p.y, null);
               setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
               super.paintComponent(g);
            }
         };
       sl_pn_small.putConstraint(SpringLayout.WEST, textField, 26, SpringLayout.EAST, panel_period);
       sl_pn_small.putConstraint(SpringLayout.SOUTH, panel_period, -582, SpringLayout.SOUTH, pn_small);
       sl_pn_small.putConstraint(SpringLayout.WEST, panel_period, 301, SpringLayout.WEST, pn_small);
       sl_pn_small.putConstraint(SpringLayout.EAST, panel_period, -1024, SpringLayout.EAST, pn_small);
       sl_pn_small.putConstraint(SpringLayout.NORTH, panel_period, 269, SpringLayout.NORTH, pn_small);
       pn_small.add(panel_period);
       
       JPanel panel_title = new JPanel(){
           public void paintComponent(Graphics g) {
               // Approach 1: Dispaly image at at full size
               g.drawImage(title.getImage(), 0, 0, null);
               // Approach 2: Scale image to size of component
               
//                Dimension d = getSize();
//                g.drawImage(title.getImage(), 0, 0, d.width, d.height, null);
               // Approach 3: Fix the image position in the scroll pane
               // Point p = scrollPane.getViewport().getViewPosition();
               // g.drawImage(icon.getImage(), p.x, p.y, null);
               setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
               super.paintComponent(g);
            }
         };
       sl_pn_small.putConstraint(SpringLayout.NORTH, panel_title, 0, SpringLayout.NORTH, txt_title);
       sl_pn_small.putConstraint(SpringLayout.WEST, panel_title, 0, SpringLayout.WEST, panel_period);
       sl_pn_small.putConstraint(SpringLayout.SOUTH, panel_title, 0, SpringLayout.SOUTH, txt_title);
       sl_pn_small.putConstraint(SpringLayout.EAST, panel_title, -26, SpringLayout.WEST, txt_title);
       pn_small.add(panel_title);
       
       JPanel panel_content = new JPanel(){
           public void paintComponent(Graphics g) {
               // Approach 1: Dispaly image at at full size
               g.drawImage(content.getImage(), 0, 0, null);
               // Approach 2: Scale image to size of component
               
//                Dimension d = getSize();
//                g.drawImage(content.getImage(), 0, 0, d.width, d.height, null);
               // Approach 3: Fix the image position in the scroll pane
               // Point p = scrollPane.getViewport().getViewPosition();
               // g.drawImage(icon.getImage(), p.x, p.y, null);
               setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
               super.paintComponent(g);
            }
         };
       sl_pn_small.putConstraint(SpringLayout.WEST, txt_content, 26, SpringLayout.EAST, panel_content);
       sl_pn_small.putConstraint(SpringLayout.SOUTH, panel_content, -490, SpringLayout.SOUTH, pn_small);
       sl_pn_small.putConstraint(SpringLayout.NORTH, panel_content, 0, SpringLayout.NORTH, txt_content);
       sl_pn_small.putConstraint(SpringLayout.WEST, panel_content, 301, SpringLayout.WEST, pn_small);
       sl_pn_small.putConstraint(SpringLayout.EAST, panel_content, -1024, SpringLayout.EAST, pn_small);
       pn_small.add(panel_content);
       
       JComboBox comboBox_calendar = new JComboBox();
       sl_pn_small.putConstraint(SpringLayout.NORTH, textField, 27, SpringLayout.SOUTH, comboBox_calendar);
       sl_pn_small.putConstraint(SpringLayout.SOUTH, panel_calendar, -6, SpringLayout.NORTH, comboBox_calendar);
       sl_pn_small.putConstraint(SpringLayout.NORTH, comboBox_calendar, 0, SpringLayout.NORTH, txt_hour);
       sl_pn_small.putConstraint(SpringLayout.WEST, comboBox_calendar, 0, SpringLayout.WEST, textField);
       sl_pn_small.putConstraint(SpringLayout.SOUTH, comboBox_calendar, -15, SpringLayout.NORTH, txt_title);
       sl_pn_small.putConstraint(SpringLayout.EAST, comboBox_calendar, -12, SpringLayout.WEST, txt_hour);
       pn_small.add(comboBox_calendar);
       
       JButton btn_in = new JButton(new ImageIcon("./Image/btn.png"));
       sl_pn_small.putConstraint(SpringLayout.NORTH, btn_in, 77, SpringLayout.SOUTH, txt_content);
       sl_pn_small.putConstraint(SpringLayout.WEST, btn_in, 642, SpringLayout.WEST, pn_small);
       sl_pn_small.putConstraint(SpringLayout.SOUTH, btn_in, 108, SpringLayout.SOUTH, txt_content);
       sl_pn_small.putConstraint(SpringLayout.EAST, btn_in, -543, SpringLayout.EAST, pn_small);
       btn_in.setBorderPainted(false);
       btn_in.setText("in");
       pn_small.add(btn_in);
       sl_panel_big.putConstraint(SpringLayout.NORTH, pn_logo, 89, SpringLayout.NORTH, panel_big);
       sl_panel_big.putConstraint(SpringLayout.SOUTH, pn_logo, 280, SpringLayout.NORTH, panel_big);
       panel_big.add(pn_logo);

       Date d = calendar.getDate();
       SimpleDateFormat format = new SimpleDateFormat("yy-yy-yy hh:mm:ss");
       System.out.println(format.format(d));
      
   }
}