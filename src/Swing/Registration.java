package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class Registration {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 605, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Application Form");
		lblNewLabel.setBounds(123, 11, 132, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(25, 49, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(292, 49, 56, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date of Birth");
		lblNewLabel_3.setBounds(24, 87, 74, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile Number");
		lblNewLabel_4.setBounds(292, 87, 73, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setBounds(25, 137, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email ID");
		lblNewLabel_6.setBounds(292, 133, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(114, 46, 141, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(415, 46, 141, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 84, 141, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(415, 84, 141, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdb = new JRadioButton("M");
		buttonGroup.add(rdb);
		rdb.setBounds(111, 133, 56, 23);
		frame.getContentPane().add(rdb);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("F");
		rdbtnNewRadioButton_1.setBounds(169, 133, 56, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(415, 134, 141, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(10, 211, 569, 83);
		frame.getContentPane().add(ta);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String firstname = textField.getText();
				String lastname = textField_1.getText();
				String dob = textField_2.getText();
				String email = textField_4.getText();
				String mobile = textField_3.getText();
				String gender;
				if(rdb.isSelected())
				{
					gender = "Male";
				}
				else
				{
					gender = "Female";
				}
				
				if(firstname.isEmpty()||(lastname.isEmpty())||(dob.isEmpty())|| (mobile.isEmpty())||
						(email.isEmpty()))
                    JOptionPane.showMessageDialog(null, "Data Missing");
                else       
                	ta.setText("FIRST NAME\t LAST NAME\t DATE OF BIRTH\t GENDER \t MOBILE\t EMAIL ID\n"+firstname+"\t"+lastname+"\t"+
                "\t"+dob+"\t"+gender+"\t"+mobile+"\t"+email+"\n");
			}
		});
		btnNewButton.setBounds(209, 158, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
