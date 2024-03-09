import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VolumeFinder extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b;
    public VolumeFinder()
    {
        l1 = new JLabel("Enter length");
        l1.setBounds(40,40,150,40);
        t1 = new JTextField(20);
        t1.setBounds(200,40,100,40);
        l2 = new JLabel("Enter breadth");
        l2.setBounds(40,110,150,40);
        t2 = new JTextField(20);
        t2.setBounds(200,110,100,40);
        l3 = new JLabel("Enter height");
        l3.setBounds(40,140,150,40);
        t3 = new JTextField(20);
        t3.setBounds(200,170,100,40);
        b = new JButton("Multiply");
        b.setBounds(150,200,100,40);
        l4 = new JLabel();
        l4.setBounds(40,220,150,40);
        b.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        add(l4);
        setSize(400,400);
        setLocation(100,100);
        setTitle("Multiplication");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int l = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int h = Integer.parseInt(t3.getText());
        int v = l*b*h;
        l4.setText("Mul="+ v);
    }
    public static void main(String[] args) {
        VolumeFinder obj = new VolumeFinder();
    }
        

    }
