package booktickets;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookingDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingDetails frame = new BookingDetails();
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
	public BookingDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BUS DETAILS");
		lblNewLabel.setBounds(159, 30, 119, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TRAVALS");
		lblNewLabel_1.setBounds(52, 84, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(136, 81, 201, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setBounds(52, 133, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 130, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setBounds(232, 133, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(288, 130, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("NOOFSEATS");
		lblNewLabel_4.setBounds(52, 183, 74, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(136, 180, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("COST");
		lblNewLabel_5.setBounds(232, 183, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(288, 180, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("FOOD");
		chckbxNewCheckBox.setBounds(57, 218, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("AC");
		chckbxNewCheckBox_1.setBounds(176, 218, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("WIFI");
		chckbxNewCheckBox_2.setBounds(288, 218, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 66, 394, 185);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String travals=textField.getText();
				String from=textField_1.getText();
				String to=textField_2.getText();
				String noofseat=textField_3.getText();
				String cost=textField_4.getText();

				JOptionPane.showMessageDialog(null,"Sucessfully Added");
				Detail det=new Detail();
				det.setTextField(travals);
				det.setTextField_1(from);
				det.setTextField_2(to);
				det.setTextField_3(noofseat);
				det.setTextField_4(cost);
				det.setVisible(true);
				
				
				
			}
		});
		btnNewButton.setBounds(159, 260, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				
			}
		});
		btnNewButton_1.setBounds(261, 260, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
