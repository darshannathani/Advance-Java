import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class SimpleCalculator extends JFrame {

private JPanel contentPane;
private JTextField console;
private JButton equal;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
SimpleCalculator frame = new SimpleCalculator();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public SimpleCalculator() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 330, 300);
contentPane = new JPanel();
contentPane.setBackground(Color.DARK_GRAY);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
String q ="";

console = new JTextField();
console.setForeground(Color.WHITE);
console.setBackground(Color.DARK_GRAY);
console.setHorizontalAlignment(SwingConstants.TRAILING);
console.setBounds(10, 11, 290, 30);
contentPane.add(console);
console.setColumns(10);

JButton b9 = new JButton("9");
b9.setBackground(Color.ORANGE);
b9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"9");
}
});
b9.setBounds(130, 52, 50, 30);
contentPane.add(b9);

JButton b6 = new JButton("6");
b6.setBackground(Color.ORANGE);
b6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"6");
}
});
b6.setBounds(130, 93, 50, 30);
contentPane.add(b6);

JButton b3 = new JButton("3");
b3.setBackground(Color.ORANGE);
b3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"3");
}
});
b3.setBounds(130, 137, 50, 30);
contentPane.add(b3);

JButton b0 = new JButton("0");
b0.setBackground(Color.ORANGE);
b0.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"0");
}
});
b0.setBounds(70, 178, 50, 30);
contentPane.add(b0);

JButton b1 = new JButton("1");
b1.setBackground(Color.ORANGE);
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"1");
}
});
b1.setBounds(10, 137, 50, 30);
contentPane.add(b1);

JButton b4 = new JButton("4");
b4.setForeground(UIManager.getColor("InternalFrame.borderLight"));
b4.setBackground(UIManager.getColor("InternalFrame.borderDarkShadow"));
b4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"4");
}
});
b4.setBounds(10, 93, 50, 30);
contentPane.add(b4);

JButton b7 = new JButton("7");
b7.setBackground(Color.ORANGE);
b7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"7");
}
});
b7.setBounds(10, 52, 50, 30);
contentPane.add(b7);

JButton b8 = new JButton("8");
b8.setBackground(Color.ORANGE);
b8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"8");
}
});
b8.setBounds(70, 52, 50, 30);
contentPane.add(b8);

JButton b5 = new JButton("5");
b5.setBackground(Color.ORANGE);
b5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"5");
}
});
b5.setBounds(70, 93, 50, 30);
contentPane.add(b5);

JButton b2 = new JButton("2");
b2.setBackground(Color.ORANGE);
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"2");
}
});
b2.setBounds(70, 137, 50, 30);
contentPane.add(b2);

JButton clear = new JButton("CE");
clear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText("");
}
});
clear.setBounds(10, 178, 50, 30);
contentPane.add(clear);

JButton add = new JButton("+");
add.setBackground(Color.WHITE);
add.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"+");
}
});
add.setBounds(190, 178, 50, 30);
contentPane.add(add);

JButton subtract = new JButton("-");
subtract.setBackground(Color.WHITE);
subtract.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"-");
}
});
subtract.setBounds(190, 137, 50, 30);
contentPane.add(subtract);

JButton multiply = new JButton("x");
multiply.setBackground(Color.WHITE);
multiply.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"x");
}
});
multiply.setBounds(190, 93, 50, 30);
contentPane.add(multiply);

JButton divide = new JButton("/");
divide.setBackground(Color.WHITE);
divide.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+"/");
}
});
divide.setBounds(190, 52, 50, 30);
contentPane.add(divide);

equal = new JButton("=");
equal.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String q = console.getText();
int a=0,b;
for(int i=0;i<q.length();i++) {
int x,y,ans;
if(q.charAt(i)=='+') {
x = Integer.parseInt(q.substring(0,i));
y = Integer.parseInt(q.substring(i+1,q.length()));
ans = x+y;
console.setText(ans+"");
}
else if(q.charAt(i)=='-') {
x = Integer.parseInt(q.substring(0,i));
y = Integer.parseInt(q.substring(i+1,q.length()));
ans = x-y;
console.setText(ans+"");
}
else if(q.charAt(i)=='x') {
x = Integer.parseInt(q.substring(0,i));
y = Integer.parseInt(q.substring(i+1,q.length()));
ans = x*y;
console.setText(ans+"");
}
else if(q.charAt(i)=='/') {
x = Integer.parseInt(q.substring(0,i));
y = Integer.parseInt(q.substring(i+1,q.length()));
ans = x/y;
console.setText(ans+"");
}
}
}
});
equal.setBounds(250, 137, 50, 71);
contentPane.add(equal);

JButton point = new JButton(".");
point.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
console.setText(console.getText()+".");
}
});
point.setBounds(130, 178, 50, 30);
contentPane.add(point);


}

}