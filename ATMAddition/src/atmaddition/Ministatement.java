package atmaddition;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Ministatement extends JFrame implements ActionListener{
    String pinnumber;
    JButton back;

    Ministatement(String pinnumber) {
        this.pinnumber = pinnumber;
        setTitle("Mini Statement");

        setLayout(null);

        JLabel mini = new JLabel();
        mini.setBounds(20, 140, 360, 400);
        add(mini);
        
        JLabel balance = new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 200, 20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pin = '" + pinnumber + "'");
            while (rs.next()) {
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Conn conn = new Conn();
            int bal = 0;
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '" + pinnumber + "'");
            StringBuilder statement = new StringBuilder("<html>");
            while (rs.next()) {
                statement.append(rs.getString("date"))
                         .append("&nbsp;&nbsp;&nbsp;&nbsp;")
                         .append(rs.getString("type"))
                         .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                         .append(rs.getString("amount"))
                         .append("<br><br>");
                if(rs.getString("type").equals("Deposit")){
                    bal += Integer.parseInt(rs.getString("amount"));
                }else{
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your current account balance is Rs "+ bal);
            statement.append("</html>");
            mini.setText(statement.toString()); // Set the formatted statement
        } catch (Exception e) {
            System.out.println(e);
        }
        
        back = new JButton("BACK");
        back.setBounds(300, 500, 80, 30);
        back.setFont(new Font("System", Font.BOLD, 16));
        back.addActionListener(this);
        add(back);

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.BLUE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    

    public static void main(String[] args) {
        new Ministatement("");  // Pass a sample PIN number for testing
    }
}
