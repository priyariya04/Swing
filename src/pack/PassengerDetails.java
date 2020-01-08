package pack;

import javax.swing.*;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

public class PassengerDetails implements ActionListener {
	
	ArrayList<NoPassenger> list = new ArrayList<NoPassenger>();
	int c = 1;
	JFrame f;
	JPanel p1,p2,p3,p4,p5;
	JLabel title,l1,l2,l3,l4;
	JTextField t1,t2;
	Properties p = new Properties();
	//p.put("text.today", "Today");
	//p.put("text.month", "Month");
	//p.put("text.year", "Year");
	
	UtilDateModel model = new UtilDateModel();
	JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
	JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
	ButtonGroup group;
	JRadioButton r1,r2;
	JButton b1,b2;
	BookingDetail detail;
	int i;
	void design(BookingDetail detail,int i) {
		this.detail = detail;
		this.i = i;
			f = new JFrame();
			
			p1 = new JPanel(new FlowLayout());
			l1 = new JLabel("PASSENGER DETAIL");
			p1.add(l1);
		
			p2 = new JPanel(new GridLayout(3,2));
			l1 = new JLabel("NAME");
			l2 = new JLabel("AADHAR NO");
			l3 = new JLabel("DOB");
			l4 = new JLabel("GENDER");
			t1 = new JTextField(10);
			t2 = new JTextField(10);
			r1 = new JRadioButton("MALE");
			r2 = new JRadioButton("FEMALE");
			group = new ButtonGroup();
			p2.add(l1);
			p2.add(t1);
			p2.add(l2);
			p2.add(t2);
			p2.add(l3);
			p2.add(datePicker);
			p5 = new JPanel(new GridLayout(1,2));
			p5.add(l4);
			p5.add(r1);
			p5.add(r2);
			
			p3 = new JPanel(new FlowLayout());
			b1 = new JButton("ADD PASSENGER");
			b1.addActionListener(this);
			p3.add(b1);
			
			p4 = new JPanel(new FlowLayout());
			b2 = new JButton("PRINT BILL");
			b2.addActionListener(this);
			p4.add(b2);
			
			Container main = f.getContentPane();
			main.setLayout(new BoxLayout(main,BoxLayout.Y_AXIS));
			main.add(p1);
			main.add(p2);
			main.add(p5);
			main.add(p3);
			main.add(p4);
			group.add(r1);
			group.add(r2);
			
			f.setSize(400, 300);
			f.setVisible(true);
			if(i == 0) {
				b1.setEnabled(false);
				for(NoPassenger pa: list) {
					System.out.println(pa.getName());
				}
			}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b2) {
			BookingBill bill = new BookingBill(list);
			bill.design();
		}
		if(ae.getSource() == b1) {
				NoPassenger pass = new NoPassenger();
				pass.setName(t1.getText());
				Date date = (Date) datePicker.getModel().getValue();
				int year = date.getYear()+1900;
				int dat = date.getDate();
				int month = date.getMonth()+1;
				LocalDate dob = LocalDate.of(year, month, dat);
				LocalDate now = LocalDate.now();
				Period p = Period.between(dob, now);
				int age = p.getYears();
				String ages = age + " ";
				if(r1.isSelected()) {
					ages+="M";
				}else {
					ages+="F";
				}
				pass.setAgeandgender(ages);
				pass.set_class(detail.get_class());
				pass.setCost(320);
				pass.setSeatno("s"+(c++));
				pass.setDetail(detail);
				list.add(pass);
				/*for(NoPassenger pa: list) {
					System.out.println(pa.getName());
				}*/
				t1.setText(null);
				t2.setText(null);
				datePicker.resetKeyboardActions();
				r1.setSelected(false);
				r2.setSelected(false);
				design(detail, i-1);
	}
}
}