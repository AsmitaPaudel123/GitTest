import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SumFinder extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b;
    public SumFinder()
    {
        l1 = new JLabel("First Number");
        l1.setBounds(40,40,150,40);
        t1 = new JTextField(20);
        t1.setBounds(200,40,100,40);
        l2 = new JLabel("Second Number");
        l2.setBounds(40,110,150,40);
        t2 = new JTextField(20);
        t2.setBounds(200,110,100,40);
        b = new JButton("Add");
        b.setBounds(150,170,60,40);
        l3 = new JLabel();
        l3.setBounds(40,220,150,40);
        b.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);
        setSize(400,400);
        setLocation(100,100);
        setTitle("Sum Calculator");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int a = Integer.parseInt(t1.getText());
        int b= Integer.parseInt(t2.getText());
        int s = a+b;
        l3.setText("Sum="+s);
    }
    public static void main(String[] args) {
        SumFinder obj = new SumFinder();
    }
}
