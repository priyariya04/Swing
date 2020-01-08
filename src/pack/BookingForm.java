package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;

import org.jdatepicker.impl.*;

public class BookingForm implements ActionListener {

	JFrame f;
	JPanel p1,p2,p3,main;
	JLabel l1,l2,l3,l4,l5,title;
	JButton b1;
	JTextField t1,t2;
	JComboBox<String> c1,c2;
	Properties p = new Properties();
	//p.put("text.today", "Today");
	//p.put("text.month", "Month");
	//p.put("text.year", "Year");
	
	UtilDateModel model = new UtilDateModel();
	JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
	JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
	String noOfPassenger,_class;
	
	public void design() {
		
		f = new JFrame();
		
		main = new JPanel();
		main.setLayout(new BoxLayout(main,BoxLayout.Y_AXIS));
		
		p1 = new JPanel(new FlowLayout());
		title = new JLabel("BOOK YOUR TRAIN TICKET");
		p1.add(title);
		
		p2 = new JPanel(new GridLayout(5,2));
		l1 = new JLabel("FROM");
		t1 = new JTextField(10);
		l2 = new JLabel("TO");
		t2 = new JTextField(10);
		l3 = new JLabel("DATE");
		l4 = new JLabel("CLASS");
		c1 = new JComboBox<String>();
		c1.addItem("1");
		c1.addItem("2");
		l5 = new JLabel("NO OF PASSENGERS");
		c2 = new JComboBox<String>();
		c2.addItem("SLEEPER");
		c2.addItem("UNRESERVED");
		p2.add(l1);
		p2.add(t1);
		p2.add(l2);
		p2.add(t2);
		p2.add(l3);
		p2.add(datePicker);
		p2.add(l5);
		p2.add(c1);
		
		p2.add(l4);
		p2.add(c2);
		
		
		p3 = new JPanel(new FlowLayout());
		b1 = new JButton("NEXT");
		b1.addActionListener(this);
		p3.add(b1);
		
		main.add(p1);
		main.add(p2);
		main.add(p3);
		
		f.add(main);
		f.setSize(400,300);
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			add();
		}
	}
	public void add() {
		BookingDetail bookdetail = new BookingDetail();
		bookdetail.setFrom(t1.getText());
		bookdetail.setTo(t2.getText());
		bookdetail.setDate((Date)datePicker.getModel().getValue());
		bookdetail.set_class((String)c2.getSelectedItem());
		bookdetail.setN(Integer.parseInt((String)c1.getSelectedItem()));
		PassengerDetails details = new PassengerDetails();
		details.design(bookdetail,bookdetail.getN());
	}
	
}
