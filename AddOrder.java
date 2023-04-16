import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class AddOrder implements ActionListener {
   JFrame f;
   JLabel label, label2, label3, labelSpecialReq, labelP,labelI, label4 ;
   JCheckBox cb1, cb2,cb3, cb_E1, cb_E2, cb_E3, cb_E4,cb_E5,cb_E6,cb_E7, cb_E8;
   JTextField tf1, tf2;
   JButton btn;
   ImageIcon icon;
   JPanel p1;
   JRadioButton rb, rb1;


   public AddOrder(){
      f = new JFrame("Menu");
      f.getContentPane().setBackground(Color.red);
      f.setSize(600,700);
      f.setResizable(true);
      f.setLayout(null);
      f.setVisible(true);


      label= new JLabel("Welcome to Food Ordering System");
      label.setFont(new Font("ROMAN", Font.BOLD, 18));
      label.setBounds(140,13,350,35);
      label.setBackground(Color.yellow);
      label.setOpaque(true);
      label2= new JLabel("APPETIZERS");
      label2.setBounds(23, 40, 150, 80);
      label2.setFont(new Font("ITALIC", Font.BOLD, 14));
      label3= new JLabel("ENTREES");
      label3.setBounds(23,170,160,50);
      label3.setFont(new Font("ITALIC", Font.BOLD, 14));
      label4= new JLabel("DRINKS");
      label4.setBounds(420,40,150,80);
      label4.setFont(new Font("ITALIC", Font.BOLD, 14));

      labelSpecialReq= new JLabel("Special Request");
      labelSpecialReq.setBounds(190,40,190,120);

      labelP= new JLabel();
      labelP.setBounds(250,650,170,40);


      labelI= new JLabel();
      labelI.setBounds(225,350,250,160);
      icon= new ImageIcon("/Users/manishhanda/Downloads/group quiz 2/src/chicken1.png");
      labelI.setIcon(icon);

      rb= new JRadioButton("Spicy");
      rb.setBounds(225,280, 78,90);

      rb1= new JRadioButton("Not Spicy");
      rb1.setBounds(290,280,100,90);



      btn= new JButton("Place your Order");
      btn.setBounds(250,600,180,60);
      btn.setFont(new Font("ITALIC", Font.BOLD, 18));
      btn.setBackground(Color.BLACK);
      btn.setForeground(Color.blue);
      btn.setOpaque(true);

      btn.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            labelP.setText("Order has been Placed");
         }
      });

      tf1= new JTextField(25);
      tf1.setBounds(176,110,150,39);


      cb1 = new JCheckBox("ONION RINGS - $6");
      cb1.setBounds(15,100, 220,30);

      cb2 = new JCheckBox("FRIES - $4");
      cb2.setBounds(15,120, 100,30);

      cb3= new JCheckBox("BONLESS WINGS - $9");
      cb3.setBounds(15, 140, 200, 30);

      cb_E1= new JCheckBox("CHICKEN SANDWICH - $12");
      cb_E1.setBounds(15,210,210,30);

      cb_E2= new JCheckBox("CHICKEN QUESDILLA - $11");
      cb_E2.setBounds(15,235,210,30);

      cb_E3= new JCheckBox("GRILLED SHRIMP - $14");
      cb_E3.setBounds(15,260,200,30);



      cb_E4= new JCheckBox("CHICKEN KABAB - $14");
      cb_E4.setBounds(15,285,200,30);

      cb_E5= new JCheckBox("BONE WINGS - $10");
      cb_E5.setBounds(15,310,200,30);

      cb_E6= new JCheckBox("BOURBON CHICKEN - $13");
      cb_E6.setBounds(15,335,220,30);

      cb_E7= new JCheckBox("ORANGE CHICKEN - $10");
      cb_E7.setBounds(15,360,220,30);

      cb_E8= new JCheckBox("CHICKEN LOLIPOP - $12");
      cb_E8.setBounds(15,385,220,30);


      btn.addActionListener(this);

      f.add(cb1);f.add(cb2);f.add(cb3);f.add(label);f.add(label2);f.add(label3);
      f.add(tf1);f.add(labelSpecialReq);f.add(cb_E1);f.add(cb_E2);
      f.add(btn); f.add(labelP); f.add(labelI); f.add(cb_E3);f.add(cb_E4);f.add(cb_E5);
      f.add(cb_E6);f.add(cb_E7); f.add(cb_E8);f.add(label4); f.add(rb);f.add(rb1);

   }
   public void actionPerformed(ActionEvent arg0) {


      float price = 0;
      String msg = "";
      if (cb1.isSelected()) {
         price += 6;
         msg += "Onion Rings : $6\n";

      }

      if (cb2.isSelected()) {
         price += 4;
         msg += "Fries : $4\n";

      }

      msg += "------------------\n";
      JOptionPane.showMessageDialog(f, "RECEIPT\n\n" + msg + "Total " + "$" + price + "\n\nThanks for choosing our Resturant\nWe hope to see you again");

    //manish
   }

   public static void main(String[]args){
      new AddOrder();

   }
}
