import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Profile extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtId;
	private JTextField txtEmail;
	private JTextField txtNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(30, 25, 61, 16);
		contentPane.add(lblName);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(30, 68, 61, 16);
		contentPane.add(lblId);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(30, 117, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(30, 184, 61, 16);
		contentPane.add(lblGender);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(30, 224, 61, 16);
		contentPane.add(lblSubject);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(30, 156, 61, 16);
		contentPane.add(lblNumber);
		
		txtNumber = new JTextField();
		txtNumber.setColumns(10);
		txtNumber.setBounds(110, 151, 130, 26);
		contentPane.add(txtNumber);
		
		txtName = new JTextField();
		txtName.setBounds(110, 20, 130, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(110, 63, 130, 26);
		contentPane.add(txtId);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(110, 112, 130, 26);
		contentPane.add(txtEmail);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(110, 180, 61, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(187, 180, 76, 23);
		contentPane.add(rdbtnFemale);
		ButtonGroup g = new ButtonGroup();
		g.add(rdbtnFemale);
		g.add(rdbtnMale);
		
		JCheckBox chckbxAdvjava = new JCheckBox("Advance Java");
		chckbxAdvjava.setBounds(112, 220, 114, 23);
		contentPane.add(chckbxAdvjava);
		
		JCheckBox chckbxDotNet = new JCheckBox("Dot Net");
		chckbxDotNet.setBounds(110, 255, 82, 23);
		contentPane.add(chckbxDotNet);
		
		JCheckBox chckbxAndroid = new JCheckBox("Android");
		chckbxAndroid.setBounds(110, 290, 82, 23);
		contentPane.add(chckbxAndroid);
		
		JCheckBox chckbxCmpGr = new JCheckBox("Computer Graphics");
		chckbxCmpGr.setBounds(110, 325, 153, 23);
		contentPane.add(chckbxCmpGr);
		
		JTextArea console = new JTextArea();
		console.setEditable(false);
		console.setBounds(280, 25, 188, 252);
		contentPane.add(console);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String id = txtId.getText();
				String email = txtEmail.getText();
				String phone = txtNumber.getText();
				JFrame f = new JFrame();
				int flag =0; 
				if(name.matches("[a-zA-Z]+")) {
					flag=0;
				}
				else {
					JOptionPane.showMessageDialog(f,"Enter Valid name number");  
					flag=1;
				}
				if(phone.matches("[0-9]+")) {
					flag=0;
				}
				else {
					JOptionPane.showMessageDialog(f,"Enter Valid Phone number");
					flag=1;
				}
				if(email.matches("^[a-zA-Z0-9_! #$%&'*+/=?`{|}~^. -]+@[a-zA-Z0-9. -]+$")) {
					flag=0;
				}
				else {
					JOptionPane.showMessageDialog(f,"Enter Valid Email");
					flag=1;
				}
				if(flag==0) {
					console.setText("Name: "+txtName.getText());
					console.setText(console.getText() + "\nId: "+txtId.getText());
					console.setText(console.getText() + "\nEmail: "+txtEmail.getText());
					console.setText(console.getText() + "\nNumber: "+txtNumber.getText());
					if(rdbtnMale.isSelected()) {
						console.setText(console.getText()+"\nGender: Male");
					}
					else if(rdbtnFemale.isSelected()) {
						console.setText(console.getText()+"\nGender: Female");
					}
					if(chckbxAdvjava.isSelected()) {
						console.setText(console.getText() + "\nAdvance Java");
					}
					if(chckbxDotNet.isSelected()) {
						console.setText(console.getText() + "\nDot Net Technology");
					}
					if(chckbxAndroid.isSelected()) {
						console.setText(console.getText() + "\nMobile Application Development");
					}
					if(chckbxCmpGr.isSelected()) {
						console.setText(console.getText() + "\nComputer Graphics");
					}
				}
			}
		});
		btnSubmit.setBounds(159, 364, 117, 29);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtName.setText("");
				txtId.setText("");
				txtEmail.setText("");
				txtNumber.setText("");
				console.setText("");
				
			}
		});
		btnReset.setBounds(30, 364, 117, 29);
		contentPane.add(btnReset);
	}
}
