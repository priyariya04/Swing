package booktickets;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Detail extends JFrame {

	private JPanel contentPane;
	private String textField;
	private String textField_1;
	private String textField_2;
	private String textField_3;
	private String textField_4;
	
	public Detail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRAVEL DETAILS");
		lblNewLabel.setBounds(149, 35, 46, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 87, 398, 138);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("TRVALS \t FROM \t TO \t NO.OF SEATS \t COST \n"
			+textField +"\t"+ textField_1 +"\t"+textField_2+ "\t"+textField_3 + "\t"+textField_4);
			
			}
		});
		btnNewButton.setBounds(149, 247, 89, 23);
		contentPane.add(btnNewButton);
	}

	public String getTextField() {
		return textField;
	}
	public void setTextField(String textField) {
		this.textField = textField;
	}
	public String getTextField_1() {
		return textField_1;
	}
	public void setTextField_1(String textField_1) {
		this.textField_1 = textField_1;
	}
	public String getTextField_2() {
		return textField_2;
	}
	public void setTextField_2(String textField_2) {
		this.textField_2 = textField_2;
	}
	public String getTextField_3() {
		return textField_3;
	}
	public void setTextField_3(String textField_3) {
		this.textField_3 = textField_3;
	}

	public String getTextField_4() {
		return textField_4;
	}
	public void setTextField_4(String textField_4) {
		this.textField_4 = textField_4;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Detail frame = new Detail();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
