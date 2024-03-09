import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FactorialCalculation extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t;
    JButton b;
    public FactorialCalculation()
    {
        l1 = new JLabel("Factorial calculator");
        l2 = new JLabel("Enter a number");
        t = new JTextField(10);
        b = new JButton("show factor");
        l3 = new JLabel();
        b.addActionListener(this);
        add(l1);
        add(l2);
        add(t);
        add(b);
        add(l3);
        setSize(300,300);
        setLocation(50,50);
        setTitle("Calculation of factorial");
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int n = Integer.parseInt(t.getText());
        int f = 1;
        for(int i = 1; i<=n; i++)
        {
            f = f*i;
        }
        l3.setText("Factorial of given number=" +f);
        //l3.setText(String.ValueOf(f));
    }
    public static void main(String[] args) {
        new FactorialCalculation();
    }
}